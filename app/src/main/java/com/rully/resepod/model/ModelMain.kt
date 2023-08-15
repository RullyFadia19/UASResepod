package com.rully.resepod.model

import java.io.Serializable

class ModelMain : Serializable {
//deklarasinya filterfoodactivity
    @JvmField
    var strCategory: String? = null

    @JvmField
    var strCategoryThumb: String? = null

    var strCategoryDescription: String? = null

}