package app

import annotations.NotBlank
import data.CreateProductRequest
import exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun validateRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

    // iterate 1 1 , cek kalo ada annotation not blank
    for(property in properties) {
        if(property.findAnnotation<NotBlank>() != null) {
            val value: String = property.call(request) as String
            when(value) {
                is String -> {
                    if("" == value) {
                        throw ValidationException("${property.name} be blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request = CreateProductRequest("1", "Indomie", 1000)

    validateRequest(request)
}