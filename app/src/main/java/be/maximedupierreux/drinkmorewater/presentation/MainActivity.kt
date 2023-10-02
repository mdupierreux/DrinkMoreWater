/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter and
 * https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced to find the most up to date
 * changes to the libraries and their usages.
 */

package be.maximedupierreux.drinkmorewater.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.CircularProgressIndicator
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import be.maximedupierreux.drinkmorewater.DrinkWaterApplication
import be.maximedupierreux.drinkmorewater.R
import be.maximedupierreux.drinkmorewater.data.HealthConnectManager
import be.maximedupierreux.drinkmorewater.presentation.theme.DrinkMoreWaterTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val healthConnectManager = (application as DrinkWaterApplication).healthConnectManager

        setContent {
            WearApp(healthConnectManager)
        }
    }
}

@Composable
fun WearApp(healthConnectManager: HealthConnectManager) {
    DrinkMoreWaterTheme {
        healthConnectManager
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
        ) {
            DrinkWater()
        }
    }
}

@Composable
fun DrinkWater() {
    Button(
        onClick = {}
    ) {
        Icon(imageVector = Icons.Filled.Check, contentDescription = "")
    }
    CircularProgressIndicator(
        modifier = Modifier.fillMaxSize(),
        progress = 0.4f,
        indicatorColor = Color.Blue,
        trackColor = Color.Blue.copy(alpha = 0.5f)
    )
}

@Composable
fun Greeting(greetingName: String) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
        color = MaterialTheme.colors.primary,
        text = stringResource(R.string.hello_world, greetingName)
    )
}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    DrinkWater()
}