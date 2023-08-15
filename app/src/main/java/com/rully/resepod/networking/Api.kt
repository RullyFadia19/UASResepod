package com.rully.resepod.networking

object Api {
    var SEARCH = "api/search/?q=";
    var Categories = "https://www.themealdb.com/api/json/v1/1/categories.php"
    var Filter = "https://www.themealdb.com/api/json/v1/1/filter.php?c={strCategory}"
    var DetailRecipe = "https://www.themealdb.com/api/json/v1/1/lookup.php?i={idMeal}"

}