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
                    GitJet("https://github.com/ShivaShirsathShivaShirsath")
                }
            }
        }
    }
}

@SuppressLint("SetJavaScriptEnabled") 
@Composable
fun WebJet(url: String) {
	AndroidView(
		factory = {
			WebView(it).apply {
				layoutParams = ViewGroup.LayoutParams(
					ViewGroup.LayoutParams.MATCH_PARENT,
					ViewGroup.LayoutParams.MATCH_PARENT
				)
				webViewClient = WebViewClient()
				loadUrl(url)
			}
		},
		update = {
			it.loadUrl(url)
		}
	) 
}