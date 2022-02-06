package ss.jet.GitHub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.runtime.Composable
//import androidx.compose.ui.tooling.preview.Preview

import ss.jet.GitHub.ui.theme.GitHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GitHubTheme {
                Surface(color = MaterialTheme.colors.background) {
                    VisitMyProfile()
                }
            }
        }
    }
}

@Composable
fun VisitMyProfile() {  
    Column(
    	modifier = Modifier.fillMaxSize(),
    	verticalArrangement = Arrangement.Center,
    	horizontalAlignment = Alignment.CenterHorizontally,
    ) {
    	val context = LocalContext.current
    	Button(
    		enabled = true,
    		onClick = {
    			context.startActivity(
    				Intent(
    					Intent.ACTION_VIEW,
    					Uri.parse(
    						"https://github.com/ShivaShirsath"
    					)
    				)
    			)
    		},
    	) {
    		Text(
    			text = "Shiva is Here 🤘\nYou Must Remember, Who am I. 😁",
    			textAlign = TextAlign.Center,
    		)
    	}
    }
}
/*
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreview() {
    GitHubTheme {
        VisitMyProfile()
    }
}
*/
