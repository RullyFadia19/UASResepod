package com.rully.resepod.model

import java.io.Serializable

class ModelFilter : Serializable {
//deklarasi untuk ke filterfoodactivity
    var idMeal: String? = null

    @JvmField
    var strMeal: String? = null

    @JvmField
    var strMealThumb: String? = null

}