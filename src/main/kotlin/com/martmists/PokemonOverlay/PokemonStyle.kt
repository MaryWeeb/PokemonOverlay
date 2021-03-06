package com.martmists.PokemonOverlay

import javafx.scene.effect.DropShadow
import javafx.scene.layout.BorderStrokeStyle
import javafx.scene.paint.Color
import tornadofx.*

class PokemonStyle: Stylesheet() {
    companion object {
        val App by cssclass()

        val Column by cssclass()

        val Pokemon by cssclass()
        val PokemonIcon by cssclass()
        val PokeBall by cssclass()
        val ItemIcon by cssclass()
        val ItemName by cssclass()
        val Nickname by cssclass()

        val Inner by cssclass()

        val row1 by cssclass()
        val row2 by cssclass()

        val Type1 by cssclass()
        val Type2 by cssclass()

        val XButton by cssclass()
        val PlusButton by cssclass()
        val LevelPlusButton by cssclass()
        val LevelMinusButton by cssclass()
        val EditButton by cssclass()

        val EditApp by cssclass()
        val EditPokemon by cssclass()
        val EditNickname by cssclass()
        val EditLevel by cssclass()
        val EditBall by cssclass()
        val EditItem by cssclass()
        val EditSave by cssclass()
    }

    init {
        App {
            prefHeight = 215.px
            prefWidth = 1305.px
            padding = box(40.px)

            backgroundImage += ClassLoader.getSystemResource("overlay.png").toURI()
            // backgroundColor += Color.RED
        }

        Column {
            prefWidth = 405.px
            // backgroundColor += Color.BLUE
        }

        Pokemon {
            prefWidth = 305.px
            prefHeight = 60.px
            // backgroundColor += Color.WHITE
        }

        Inner {
            borderStyle += BorderStrokeStyle.SOLID
            borderWidth += box(3.px)
            borderRadius += box(40.px)

            backgroundImage += ClassLoader.getSystemResource("pokemonBack2.png").toURI()
            // backgroundColor += Color.GREEN
        }

        PokemonIcon {
            scaleX = 1.75
            scaleY = 1.75
        }

        ItemName {
            scaleX = 0.8
            scaleY = 0.8
            padding = box(0.px, 0.px, 0.px, 0.px)
        }

        row1 {
            padding = box(0.px, 100.px, 0.px, 0.px)
        }

        row2 {
            padding = box(0.px, 0.px, 0.px, 100.px)
        }

        s(XButton, PlusButton, EditButton) {
            scaleX = 0.75
            scaleY = 0.75
        }

        XButton {
            baseColor = Color.RED
        }

        PlusButton {
            baseColor = Color.GREEN
        }

        EditApp {
            prefWidth = 500.px
        }

        s(EditPokemon, EditNickname, EditLevel, EditBall, EditItem) {
            prefWidth = 360.px
        }

        EditSave {
            prefWidth = 340.px
        }

        s(button, comboBox, textField) {
            backgroundRadius += box(15.px)
            effect = DropShadow().apply {
                color = Color.GRAY
                offsetX = 2.0
                offsetY = 3.0
                radius = 0.0
            }

            focusColor = Color.TRANSPARENT
            faintFocusColor = Color.TRANSPARENT

            and(hover, focused, selected) {
                focusColor = Color.TRANSPARENT
                faintFocusColor = Color.TRANSPARENT
            }
        }

        s(comboBox, textField) {
            prefWidth = 255.px
            maxWidth = 255.px
        }

        EditApp {
            backgroundImage += ClassLoader.getSystemResource("editScreen.png").toURI()
        }
    }
}