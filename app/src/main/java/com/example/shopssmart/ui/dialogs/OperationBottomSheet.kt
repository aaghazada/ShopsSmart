package com.example.shopssmart.ui.dialogs

import android.os.Bundle
import android.view.View
import com.example.shopssmart.R
import com.example.shopssmart.base.BaseBottomSheetDialog
import com.example.shopssmart.databinding.BottomSheetOperationBinding
import com.example.shopssmart.util.BundleNames.OPERATION_MESSAGE
import com.example.shopssmart.util.BundleNames.OPERATION_TYPE
import com.example.shopssmart.util.OperationType

class OperationBottomSheet(val onButtonClicked: () -> Unit) :
    BaseBottomSheetDialog<BottomSheetOperationBinding>(BottomSheetOperationBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {
        when (requireArguments().getString(OPERATION_TYPE)) {
            OperationType.SUCCESS.type -> {
                binding.operationAnim.setAnimation(R.raw.success_animation)
            }

            OperationType.ERROR.type -> {
                binding.operationAnim.setAnimation(R.raw.error_animation)
            }
        }
        binding.txtOperationMessage.text = requireArguments().getString(OPERATION_MESSAGE)

        binding.operationAnim.setAnimation(R.raw.success_animation)
        binding.btnOk.setOnClickListener {
            dismiss()
        }
    }
}
