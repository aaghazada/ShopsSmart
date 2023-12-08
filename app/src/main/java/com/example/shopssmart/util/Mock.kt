package com.example.shopssmart.util

import com.example.shopssmart.R
import com.example.shopssmart.model.local.BannerModel
import com.example.shopssmart.model.local.CategoryModel
import com.example.shopssmart.model.local.DialogModel
import com.example.shopssmart.model.local.ProductModel

object Mock {

    fun getDialogSearch(): ArrayList<DialogModel> {
        return arrayListOf(
            DialogModel(
                title = "Iphone 15 Pro Max"
            )
        )
    }

    fun getMockBanner(): ArrayList<BannerModel> {
        return arrayListOf(
            BannerModel(
                bannerId = 1,
                bannerIcon = R.drawable.ic_banner
            ),
            BannerModel(
                bannerId = 2,
                bannerIcon = R.drawable.ic_banner
            ),
            BannerModel(
                bannerId = 3,
                bannerIcon = R.drawable.ic_banner
            ),
            BannerModel(
                bannerId = 4,
                bannerIcon = R.drawable.ic_banner
            ),
            BannerModel(
                bannerId = 5,
                bannerIcon = R.drawable.ic_banner
            ),
            BannerModel(
                bannerId = 6,
                bannerIcon = R.drawable.ic_banner
            ),
            BannerModel(
                bannerId = 7,
                bannerIcon = R.drawable.ic_banner
            )
        )
    }

    fun getMockCategory(): ArrayList<CategoryModel> {
        return arrayListOf(
            CategoryModel(
                categoryId = 1,
                categoryName = "Apparel",
                categoryIcon = R.drawable.ic_category_apparel
            ),
            CategoryModel(
                categoryId = 2,
                categoryName = "School",
                categoryIcon = R.drawable.ic_category_school
            ),
            CategoryModel(
                categoryId = 3,
                categoryName = "Sport",
                categoryIcon = R.drawable.ic_category_sports
            ),
            CategoryModel(
                categoryId = 4,
                categoryName = "Electronics",
                categoryIcon = R.drawable.ic_category_electronic
            ),
            CategoryModel(
                categoryId = 5,
                categoryName = "All",
                categoryIcon = R.drawable.ic_category_all
            )

        )
    }

    fun getMockProducts(): ArrayList<ProductModel> {
        return arrayListOf(
            ProductModel(
                id = 1,
                productId = "asdfgh",
                productImage = "",
                productTitle = "",
                description = "",
                isFavourite = true,
                price = ""
            ),
            ProductModel(
                id = 1,
                productId = "asdfgh",
                productImage = "",
                productTitle = "",
                description = "",
                isFavourite = true,
                price = ""
            ),ProductModel(
                id = 1,
                productId = "asdfgh",
                productImage = "",
                productTitle = "",
                description = "",
                isFavourite = true,
                price = ""
            ),ProductModel(
                id = 1,
                productId = "asdfgh",
                productImage = "",
                productTitle = "",
                description = "",
                isFavourite = true,
                price = ""
            ),
            ProductModel(
                id = 1,
                productId = "asdfgh",
                productImage = "",
                productTitle = "",
                description = "",
                isFavourite = true,
                price = ""
            ),
            ProductModel(
                id = 1,
                productId = "asdfgh",
                productImage = "",
                productTitle = "",
                description = "",
                isFavourite = true,
                price = ""
            )


        )
    }
}