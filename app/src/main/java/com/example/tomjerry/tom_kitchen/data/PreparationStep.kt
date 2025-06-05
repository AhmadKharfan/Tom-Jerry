package com.example.tomjerry.tom_kitchen.data

data class PreparationStep(
    val number: Int,
    val text: String
)

val preparationSteps = listOf<PreparationStep>(
    PreparationStep(1,"Put the pasta in a toaster."),
    PreparationStep(2,"Pour battery juice over it."),
    PreparationStep(3,"Wait for the spark to ignite."),
    PreparationStep(4,"Serve with an insulating glove."),
    PreparationStep(5,"bla bla bla"),
    PreparationStep(6,"bla bla bla"),
    PreparationStep(7,"bla bla bla")
)