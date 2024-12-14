package com.example.formas_proibidas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.formas_proibidas.ui.theme.FormasproibidasTheme

val vermelho = Color(0xFFD1495B)
val azul = Color(0xFF003D5B)
val azul2 = Color(0xFF005681)
val amarelo = Color(0xFFEDAE49)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormasproibidasTheme {
                Inicio()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Inicio() {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                NavHost(navController = navController, startDestination = "login") {
                    composable("login") { ConteudoLogin(navController, innerPadding) }
                    composable("telaformas") { TelaFormas(navController) }
                    composable("AreaQuadrado") {Calc_Area_Quadrado(navController)  }
                    composable("AreaTriângulo") { Calc_Area_Triângulo(navController) }
                    composable("AreaCirculo") { Calc_Area_Circulo(navController) }
                    composable("AreaLosango") { Calc_Area_Losango(navController)  }
                    composable("AreaCubo") {Calc_Area_Cubo(navController)  }
                    composable("AreaParalelogramo") {Calc_Area_Paralelogramo(navController)  }
                    composable("AreaRetangulo") {Calc_Area_Retangulo(navController)  }
                    composable("AreaCubóide") {Calc_Area_Cuboide(navController)  }
                }
            }
        }
    )
}

@Composable
fun ConteudoLogin(navController: NavController, innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .background(color = azul)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo Aplicativo",
            modifier = Modifier
                .size(width = 231.dp, height = 221.dp)
                .padding(bottom = 20.dp)
        )

        Spacer(modifier = Modifier.padding(top = 70.dp))

        Button(
            onClick = {
                navController.navigate("telaformas")
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = vermelho,
                contentColor = Color.White
            ),
            modifier = Modifier.size(width = 230.dp, height = 75.dp)
        ) {
            Text("Calcular", fontSize = 36.sp, fontWeight = FontWeight.SemiBold)
        }

        Spacer(modifier = Modifier.padding(top = 47.dp))
    }
}

@Composable
fun TelaFormas(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = azul)
    ) {
        Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 5.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {
                        navController.navigate("AreaQuadrado")
                    },
                    modifier = Modifier.padding(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = azul2,
                        contentColor = Color.Black
                    )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mdi__square_outline),
                        contentDescription = "Ícone de Tela Inicial",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    Text (
                        text = "Quadrado",
                        color = amarelo )
                }

                Button(
                    onClick = {
                        navController.navigate("AreaTriângulo")
                    },
                    modifier = Modifier.padding(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = azul2,
                        contentColor = Color.Black
                    )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.triangle),
                        contentDescription = "Ícone do Triângulo",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    Text("Triângulo",
                        color = amarelo )
                }

                Button(
                    onClick = {
                        navController.navigate("AreaCirculo")
                    },
                    modifier = Modifier.padding(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = azul2,
                        contentColor = Color.Black
                    )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.circle),
                        contentDescription = "Ícone do Círculo",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    Text("Círculo",
                        color = amarelo )
                }

                Button(
                    onClick = {
                        navController.navigate("AreaLosango")
                    },
                    modifier = Modifier.padding(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = azul2,
                        contentColor = Color.Black
                    )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.diamond),
                        contentDescription = "Ícone do Losango",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    Text("Losango",
                        color = amarelo )
                }

                Button(
                    onClick = {
                        navController.navigate("AreaCubo")
                    },
                    modifier = Modifier.padding(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = azul2,
                        contentColor = Color.Black
                    )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cube),
                        contentDescription = "Losango",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    Text("Cubo",
                        color = amarelo )
                }

                Button(
                    onClick = {
                        navController.navigate("AreaCubóide")
                    },
                    modifier = Modifier.padding(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = azul2,
                        contentColor = Color.Black
                    )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cuboid),
                        contentDescription = "Ícone do Cubóide",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    Text("Cubóide",
                        color = amarelo)
                }

                Button(
                    onClick = {
                        navController.navigate("AreaParalelogramo")
                    },
                    modifier = Modifier.padding(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = azul2,
                        contentColor = Color.Black
                    )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.parallelogram),
                        contentDescription = "Ícone do Losango",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    Text("Paralelogramo",
                        color = amarelo )
                }

                Button(
                    onClick = {
                        navController.navigate("AreaRetangulo")
                    },
                    modifier = Modifier.padding(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = azul2,
                        contentColor = Color.Black
                    )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = "Ícone do Retângulo",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    Text("Retângulo",
                        color = amarelo)
                }
            }
        }
    }

@Composable
fun Calc_Area_Quadrado(navController: NavController) {

    var lado by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = azul)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 75.dp),
            horizontalAlignment = Alignment.CenterHorizontally )
         {
                Image(
                    painter = painterResource(id = R.drawable.logo_2),
                    contentDescription = "Logo Aplicativo",
                    modifier = Modifier.size(width = 314.dp, height = 98.dp)
                )
            }
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(0.9f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = azul2),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Área do Quadrado",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = lado,
                        onValueChange = { lado = it },
                        label = { Text("Digite o valor do lado") },
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = {
                            val ladoDouble = lado.toDoubleOrNull()
                            if (ladoDouble != null) {
                                resultado = "Área: ${(ladoDouble * ladoDouble)}"
                            } else {
                                resultado = "Por favor, insira um valor válido!"
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = vermelho
                        ),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Calcular",
                            color = Color.White
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = azul),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        Text(
                            text = resultado,
                            modifier = Modifier.padding(16.dp),
                            style = TextStyle(fontSize = 18.sp, color = Color.White)
                        )
                    }
                }
            }
        }
    }

@Composable
fun Calc_Area_Triângulo(navController: NavController) {

    var base by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = azul)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 75.dp),
            horizontalAlignment = Alignment.CenterHorizontally )
        {
            Image(
                painter = painterResource(id = R.drawable.logo_2),
                contentDescription = "Logo Aplicativo",
                modifier = Modifier.size(width = 314.dp, height = 98.dp)
            )
        }
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier
                    .padding(16.dp, top = 75.dp)
                    .fillMaxWidth(0.9f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = azul2),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Área do Triângulo",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = base,
                        onValueChange = { base = it },
                        label = { Text("Digite o valor da base") },
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = altura,
                        onValueChange = { altura = it },
                        label = { Text("Digite o valor da altura") },
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = {
                            val baseDouble = base.toDoubleOrNull()
                            val alturaDouble = altura.toDoubleOrNull()
                            if (baseDouble != null && alturaDouble != null) {
                                resultado = "Área: ${(baseDouble * alturaDouble) / 2}"
                            } else {
                                resultado = "Por favor, insira valores válidos!"
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = vermelho
                        ),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Calcular",
                            color = Color.White )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = azul),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        Text(
                            text = resultado,
                            modifier = Modifier.padding(16.dp),
                            style = TextStyle(fontSize = 18.sp, color = Color.White)
                        )
                    }
                }
            }
        }
    }

@Composable
fun Calc_Area_Circulo(navController: NavController) {

    var raio by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = azul)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 75.dp),
            horizontalAlignment = Alignment.CenterHorizontally )
        {
            Image(
                painter = painterResource(id = R.drawable.logo_2),
                contentDescription = "Logo Aplicativo",
                modifier = Modifier.size(width = 314.dp, height = 98.dp)
            )
        }
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(0.9f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = azul2),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Área do Círculo",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = raio,
                        onValueChange = { raio = it },
                        label = { Text("Digite o valor do raio") },
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = {
                            val raioDouble = raio.toDoubleOrNull()
                            if (raioDouble != null) {
                                val area = Math.PI * raioDouble * raioDouble
                                resultado = "Área: %.2f".format(area)
                            } else {
                                resultado = "Por favor, insira um valor válido!"
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = vermelho
                        ),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Calcular",
                            color = Color.White )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = azul),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        Text(
                            text = resultado,
                            modifier = Modifier.padding(16.dp),
                            style = TextStyle(fontSize = 18.sp, color = Color.White)
                        )
                    }
                }
            }
        }
    }

@Composable
fun Calc_Area_Losango(navController: NavController) {

    var diagonal1 by remember { mutableStateOf("") }
    var diagonal2 by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = azul)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 75.dp),
            horizontalAlignment = Alignment.CenterHorizontally )
        {
            Image(
                painter = painterResource(id = R.drawable.logo_2),
                contentDescription = "Logo Aplicativo",
                modifier = Modifier.size(width = 314.dp, height = 98.dp)
            )
        }
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier
                    .padding(16.dp, top = 100.dp)
                    .fillMaxWidth(0.9f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = azul2),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Área do Losango",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = diagonal1,
                        onValueChange = { diagonal1 = it },
                        label = { Text("Digite o valor da primeira diagonal (D₁)") },
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = diagonal2,
                        onValueChange = { diagonal2 = it },
                        label = { Text("Digite o valor da segunda diagonal (D₂)") },
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = {
                            val d1 = diagonal1.toDoubleOrNull()
                            val d2 = diagonal2.toDoubleOrNull()
                            if (d1 != null && d2 != null) {
                                resultado = "Área: ${(d1 * d2) / 2}"
                            } else {
                                resultado = "Por favor, insira valores válidos!"
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = vermelho
                        ),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Calcular",
                            color = Color.White)
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = azul),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        Text(
                            text = resultado,
                            modifier = Modifier.padding(16.dp),
                            style = TextStyle(fontSize = 18.sp, color = Color.White)
                        )
                    }
                }
            }
        }
    }

@Composable
fun Calc_Area_Cubo(navController: NavController) {

    var aresta by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = azul)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 75.dp),
            horizontalAlignment = Alignment.CenterHorizontally )
        {
            Image(
                painter = painterResource(id = R.drawable.logo_2),
                contentDescription = "Logo Aplicativo",
                modifier = Modifier.size(width = 314.dp, height = 98.dp)
            )
        }
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(0.9f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = azul2),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Área do Cubo",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = aresta,
                        onValueChange = { aresta = it },
                        label = { Text("Digite o valor da aresta do cubo") },
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = {
                            val arestaDouble = aresta.toDoubleOrNull()
                            if (arestaDouble != null) {
                                val area = 6 * (arestaDouble * arestaDouble)
                                resultado = "Área: %.2f".format(area)
                            } else {
                                resultado = "Por favor, insira um valor válido!"
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = vermelho
                        ),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Calcular",
                            color = Color.White)
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = azul),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        Text(
                            text = resultado,
                            modifier = Modifier.padding(16.dp),
                            style = TextStyle(fontSize = 18.sp, color = Color.White)
                        )
                    }
                }
            }
        }
    }

@Composable
fun Calc_Area_Paralelogramo(navController: NavController) {

    var base by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = azul)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 75.dp),
            horizontalAlignment = Alignment.CenterHorizontally )
        {
            Image(
                painter = painterResource(id = R.drawable.logo_2),
                contentDescription = "Logo Aplicativo",
                modifier = Modifier.size(width = 314.dp, height = 98.dp)
            )
        }
    }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier
                    .padding(16.dp, top = 100.dp)
                    .fillMaxWidth(0.9f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = azul2),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Área do Paralelogramo",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = base,
                        onValueChange = { base = it },
                        label = { Text("Digite o valor da base") },
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = altura,
                        onValueChange = { altura = it },
                        label = { Text("Digite o valor da altura") },
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = {
                            val baseDouble = base.toDoubleOrNull()
                            val alturaDouble = altura.toDoubleOrNull()
                            if (baseDouble != null && alturaDouble != null) {
                                val area = baseDouble * alturaDouble
                                resultado = "Área: %.2f".format(area)
                            } else {
                                resultado = "Por favor, insira valores válidos!"
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = vermelho
                        ),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Calcular",
                            color = Color.White)
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = azul),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        Text(
                            text = resultado,
                            modifier = Modifier.padding(16.dp),
                            style = TextStyle(fontSize = 18.sp, color = Color.White)
                        )
                    }
                }
            }
        }
    }

@Composable
fun Calc_Area_Retangulo(navController: NavController) {

    var base by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = azul)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 75.dp),
            horizontalAlignment = Alignment.CenterHorizontally )
        {
            Image(
                painter = painterResource(id = R.drawable.logo_2),
                contentDescription = "Logo Aplicativo",
                modifier = Modifier.size(width = 314.dp, height = 98.dp)
            )
        }
    }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier
                    .padding(16.dp, top = 75.dp)
                    .fillMaxWidth(0.9f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = azul2),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Área do Retângulo",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = base,
                        onValueChange = { base = it },
                        label = { Text("Digite o valor da base") },
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = altura,
                        onValueChange = { altura = it },
                        label = { Text("Digite o valor da altura") },
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = {
                            val baseDouble = base.toDoubleOrNull()
                            val alturaDouble = altura.toDoubleOrNull()
                            if (baseDouble != null && alturaDouble != null) {
                                val area = baseDouble * alturaDouble
                                resultado = "Área: %.2f".format(area)
                            } else {
                                resultado = "Por favor, insira valores válidos!"
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = vermelho
                        ),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Calcular",
                            color = Color.White )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = azul),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        Text(
                            text = resultado,
                            modifier = Modifier.padding(16.dp),
                            style = TextStyle(fontSize = 18.sp, color = Color.White)
                        )
                    }
                }
            }
        }
    }

@Composable
fun Calc_Area_Cuboide(navController: NavController) {

    var comprimento by remember { mutableStateOf("") }
    var largura by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = azul)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 75.dp),
            horizontalAlignment = Alignment.CenterHorizontally )
        {
            Image(
                painter = painterResource(id = R.drawable.logo_2),
                contentDescription = "Logo Aplicativo",
                modifier = Modifier.size(width = 314.dp, height = 98.dp)
            )
        }
    }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                modifier = Modifier
                    .padding(16.dp, top = 125.dp)
                    .fillMaxWidth(0.9f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = azul2),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Área do Cubóide",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = comprimento,
                        onValueChange = { comprimento = it },
                        label = { Text("Digite o valor do comprimento") },
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = largura,
                        onValueChange = { largura = it },
                        label = { Text("Digite o valor da largura") },
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = altura,
                        onValueChange = { altura = it },
                        label = { Text("Digite o valor da altura") },
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = {
                            val comprimentoDouble = comprimento.toDoubleOrNull()
                            val larguraDouble = largura.toDoubleOrNull()
                            val alturaDouble = altura.toDoubleOrNull()
                            if (comprimentoDouble != null && larguraDouble != null && alturaDouble != null) {
                                val area = 2 * (comprimentoDouble * larguraDouble + comprimentoDouble * alturaDouble + larguraDouble * alturaDouble)
                                resultado = "Área: %.2f".format(area)
                            } else {
                                resultado = "Por favor, insira valores válidos!"
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = vermelho
                        ),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Calcular",
                            color = Color.White )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(containerColor = azul),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        Text(
                            text = resultado,
                            modifier = Modifier.padding(16.dp),
                            style = TextStyle(fontSize = 18.sp, color = Color.White)
                        )
                    }
                }
            }
        }
    }