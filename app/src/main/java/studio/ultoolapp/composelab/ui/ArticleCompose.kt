package studio.ultoolapp.composelab.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import studio.ultoolapp.composelab.R
import studio.ultoolapp.composelab.ui.theme.ComposeLabTheme

@Composable
fun Article() {
    Column {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth,
        )
        Text(
            text = stringResource(R.string.title_compose),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp),
        )
        Text(
            text = stringResource(R.string.paragraph_compose_1),
            modifier = Modifier.padding(16.dp, 0.dp),
            textAlign = TextAlign.Justify,
        )
        Text(
            text = stringResource(R.string.paragraph_compose_2),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify,
        )

    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ComposeLabTheme {
        Article()
    }
}