package com.example.food.data.database

import androidx.room.TypeConverter
import com.example.food.models.FoodRecipe
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class RecipesTypeConvertor {

    var gson = Gson()

    @TypeConverter
    fun stringToFoodRecipe(data: String): FoodRecipe {
        val listType = object : TypeToken<FoodRecipe>() {}.type
        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun foodRecipeToString(foodRecipe: FoodRecipe): String {
        return Gson().toJson(foodRecipe)
    }
}