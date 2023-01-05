package studio.ultoolapp.composelab.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import studio.ultoolapp.composelab.R
import studio.ultoolapp.composelab.ui.theme.ComposeLabTheme


@Composable
fun DimensionCompose() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            DimensionalCard(
                color = Color.Green,
                title = stringResource(id = R.string.title_dimension_1),
                content = stringResource(id = R.string.content_dimension_1),
                modifier = Modifier.weight(1f)
            )

            DimensionalCard(
                color = Color.Yellow,
                title = stringResource(id = R.string.title_dimension_2),
                content = stringResource(id = R.string.content_dimension_2),
                modifier = Modifier.weight(1f)
            )

        }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            DimensionalCard(
                color = Color.Cyan,
                title = stringResource(id = R.string.title_dimension_3),
                content = stringResource(id = R.string.content_dimension_3),
                modifier = Modifier.weight(1f)
            )
            DimensionalCard(
                color = Color.LightGray,
                title = stringResource(id = R.string.title_dimension_4),
                content = stringResource(id = R.string.content_dimension_4),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DimensionPreview() {
    ComposeLabTheme {
        DimensionCompose()
    }
}

@Composable
fun DimensionalCard(
    color: Color, title: String, content: String, modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(color = color)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            style = TextStyle(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(bottom = 16.dp),
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify,
        )
    }

}
