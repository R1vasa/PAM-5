
package com.example.pam5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CounterScreen(
    viewModel: CounterViewModel = viewModel()
) {
    val counter = viewModel.counter

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Muhammad Rafi Hasbi Saviar")
        Text(text = "245150401111014")

        Spacer(modifier = Modifier.padding(12.dp))

        Text(text = "Nilai Counter")
        Text(text = "$counter")

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(onClick = { viewModel.increase() }, modifier = Modifier.width(90.dp)) {
                Text(text = "Up")
            }

            Button(onClick = { viewModel.decrease() }, modifier = Modifier.width(90.dp)) {
                Text(text = "Down")
            }

            Button(onClick = { viewModel.reset() }, modifier = Modifier.width(90.dp)) {
                Text(text = "Reset")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterPreview() {
    CounterScreen(
    )
}
