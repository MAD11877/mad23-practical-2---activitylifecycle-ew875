package sg.edu.np.mad.week2practical;

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
//
//    @Override
//    protected void onStart(){
//        super.onStart();
//        Log.v(TITLE, "Start!");
//    }
//
//    @Override
//    protected void onResume(){
//        super.onResume();
//        Log.v(TITLE, "Resume");
//        TextView tv1 = findViewById(R.id.textView);
//
//        Button buttonOne = findViewById(R.id.button1);
//        buttonOne.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick (View view) {
//                Log.v(TITLE, "Followed!");
//                tv1.setText("hi!");
//            }
//        });
//
//        User myUser = new User();
//        myUser.getUserName();
//
//    }
//
//    @Override
//    protected void onPause(){
//        super.onPause();
//        Log.v(TITLE, "Paused");
//    }
//
//    @Override
//    protected void onStop(){
//        super.onStop();
//        Log.v(TITLE, "Stop!");
//    }
//
//    @Override
//    protected void onRestart(){
//        super.onRestart();
//        Log.v(TITLE, "Restart");
//    }
//
//    @Override
//    protected void onDestroy(){
//        super.onDestroy();
//        Log.v(TITLE, "Destroy");
//    }
//
//    public static class User {
//        private String userName;
//        private String userPassword;
//
//        public User(String userName, String userPassword) {
//            this.userName = userName;
//            this.userPassword = userPassword;
//        }
//
//
//
//        public String getUserName() {
//            return userName;
//        }
//
//        public void setUserName(String userName) {
//            this.userName = userName;
//        }
//
//        public String getUserPassword() {
//            return userPassword;
//        }
//
//        public void setUserPassword(String userPassword) {
//            this.userPassword = userPassword;
//        }
//    }