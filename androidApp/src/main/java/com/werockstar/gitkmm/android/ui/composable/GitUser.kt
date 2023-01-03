package com.werockstar.gitkmm.android.ui.composable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.werockstar.gitkmm.ui.GitUser

@Composable
fun GitUser(user: GitUser) {
    Card(modifier = Modifier.fillMaxWidth(), elevation = 4.dp, shape = RectangleShape) {
        Row {
            val modifier = Modifier
                .size(80.dp)
                .padding(8.dp)
                .clip(CircleShape)
            UserImage(user.avatarUrl, modifier = modifier)
            Column(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    user.username, modifier = Modifier,
                    style = MaterialTheme.typography.h6,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                if (user.name.orEmpty().isNotEmpty()) {
                    Text(
                        user.name.orEmpty(), modifier = Modifier.padding(top = 8.dp),
                        style = MaterialTheme.typography.subtitle1,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun GitUserPreview() {
    GitUser(user = GitUser("WeRockStar", "", "Kotchaphan Muangsan"))
}