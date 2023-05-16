package sg.edu.np.mad.madexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String TITLE = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TITLE, "Create!");
        User myUser =  new User();
        myUser.setFollowed(false);

        Button myfollowbutton = findViewById(R.id.button1);
        myfollowbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean bool = myUser.isFollowed();
                bool = !bool;
                myUser.setFollowed(bool);
                Log.v(TITLE, "on Destroy....");
                if (myUser.isFollowed() == Boolean.FALSE)
                {
                    myfollowbutton.setText("Follow");
                }
                else
                {
                    myfollowbutton.setText("Unfollow");
                }
                Log.v(TITLE, "on Destroy....");
            }
        });
    }
}