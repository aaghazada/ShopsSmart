package com.example.shopssmart.ui.add_product

import android.Manifest
import android.app.Notification.Action
import android.content.ContentValues
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import com.example.shopssmart.base.BaseFragment
import com.example.shopssmart.databinding.FragmentAddProductBinding
import com.example.shopssmart.model.local.ProductModel
import com.example.shopssmart.view_models.AddProductViewModel
import com.google.firebase.database.core.Context
import dagger.hilt.android.AndroidEntryPoint
import java.util.UUID

@AndroidEntryPoint
class AddProductFragment :
    BaseFragment<FragmentAddProductBinding>(FragmentAddProductBinding::inflate) {

    private val cameraPermission = Manifest.permission.CAMERA
    private var imageUri: Uri? = null
    private val viewModel: AddProductViewModel by viewModels()

    private val cameraPermissionResult =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isPermitted ->
            if (isPermitted) {
                startCameraAction()
            }

        }
    private val captureResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            imageUri?.let {
//                binding.imgAddProduct.setImageURI(it)
            }
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding.name
        binding.price
        binding.description

        binding.imgAddProduct.setOnClickListener {
            cameraPermissionResult.launch(cameraPermission)
        }
        binding.buttonAddToCard.setOnClickListener {
            imageUri?.let { image ->
                viewModel.uploadImage(image) { path ->
                    val productItem = ProductModel(
                        id = 0,
                        productId = UUID.randomUUID().toString(),
                        productTitle = "",
                        price = "",
                        productImage = path,
                        description = ""
                    )
                    viewModel.addNewProduct(productItem)
                }
            }
        }
    }

    private fun startCameraAction() {
        imageUri = requireActivity().contentResolver.insert(
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
            ContentValues()
        )
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri)

        captureResult.launch(cameraIntent)
    }
}