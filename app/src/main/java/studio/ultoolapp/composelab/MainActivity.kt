package studio.ultoolapp.composelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import studio.ultoolapp.composelab.ui.DimensionCompose
import studio.ultoolapp.composelab.ui.theme.ComposeLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLabTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
//                    Greeting("Android")
//                    Article()
                    DimensionCompose()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val image = painterResource(id = R.drawable.androidparty)
    Box {
        Image(
            painter = image, contentDescription = "",
            modifier = Modifier.fillMaxHeight(),
            contentScale = ContentScale.Crop,
        )
        Text(
            text = stringResource(R.string.greetings, name),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeLabTheme {
        Greeting("Android")
    }
}