package com.example.professionali_pr22_102_boboev

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp)
    ) {
        // Верхняя часть с иконкой
        IconButton(
            onClick = { /* Handle icon click */ },
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.icon),
                contentDescription = ""
            )
        }

        // Приветствие и текст
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Привет!", fontSize = 32.sp, color = Color.Black)
            Text(
                "Заполните Свои Данные Или",
                fontSize = 15.sp,
                color = colorResource(R.color.text)
            )
            Text(
                "продолжите через социальные медиа",
                fontSize = 15.sp,
                color = colorResource(R.color.text)
            )
        }

        // Поля ввода
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp)
        ) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") }
            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                value = password,
                onValueChange = { password = it },
                label = { Text("Пароль") },
                visualTransformation = PasswordVisualTransformation()
            )
        }

        // Кнопка "Востановить" справа
        Text(
            text = "Востановить",
            fontSize = 12.sp,
            color = colorResource(R.color.text),
            modifier = Modifier
                .align(Alignment.End)
                .padding(top = 10.dp)
        )

        // Кнопка "Войти"
        Button(
            onClick = { /* Handle sign in */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.button)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .height(50.dp)
                .clip(RoundedCornerShape(16.dp))
        ) {
            Text("Войти", color = Color.White)
        }

        // Нижняя часть с текстом и кнопкой "Создать пользователя"
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f), // Занимает всю оставшуюся высоту
            contentAlignment = Alignment.BottomCenter
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 50.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text("Вы впервые?  ", color = colorResource(R.color.text))
                TextButton(onClick = { /* Handle create user */ }) {
                    Text("Создать пользователя", color = colorResource(R.color.black))
                }
            }
        }
    }
}