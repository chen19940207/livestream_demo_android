package cn.ucai.live.utils;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;

import com.hyphenate.chat.EMClient;
import com.hyphenate.easeui.domain.User;

import cn.ucai.live.R;
import cn.ucai.live.ui.activity.LoginActivity;
import cn.ucai.live.ui.activity.RegisterActivity;


/**
 * Created by Administrator on 2017/1/10 0010.
 */

public class MFGT {
    public static void startActivity(Activity activity, Class<?> clz) {
        activity.startActivity(new Intent(activity, clz));
        activity.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }

    public static void finishActivity(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
    }

    public static void startActivity(Activity activity, Intent intent) {
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
    }

    public static void gotoLogin(Activity activity) {
        startActivity(activity, LoginActivity.class);
    }

    public static void gotoRegister(Activity activity) {
        startActivity(activity, RegisterActivity.class);
    }

//    public static void gotoSettings(FragmentActivity activity) {
//        startActivity(activity, SettingsActivity.class);
//    }

    public static void gotoLoginClenTask(Activity activity) {
        startActivity(activity, new Intent(activity, LoginActivity.class)
                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
    }

//    public static void gotoUserProfile(Activity activity) {
//        startActivity(activity, UserProfileActivity.class);
//    }
//
//    public static void gotoAddContact(Activity activity) {
//        startActivity(activity, AddContactActivity.class);
//    }

//    public static void gotoFriend(Activity activity, User user) {
//        startActivity(activity, new Intent(activity, FriendProfileActivity.class)
//                .putExtra(I.User.TABLE_NAME, user));
//    }
//    public static void gotoFriend(Activity activity, String username) {
//        if (username.equals(EMClient.getInstance().getCurrentUser())) {
//            gotoUserProfile(activity);
//        }else {
//            startActivity(activity, new Intent(activity, FriendProfileActivity.class)
//                    .putExtra(I.User.USER_NAME, username));
//        }
//    }
//
//    public static void gotoAddFriend(Activity activity,String username) {
//        startActivity(activity, new Intent(activity, AddFriendActivity.class)
//                .putExtra(I.User.USER_NAME, username));
//    }
//
//    public static void gotoChat(Activity activity, String username) {
//        startActivity(activity, new Intent(activity, ChatActivity.class)
//                .putExtra("userId", username));
//    }
//
//    public static void gotoMain(Activity activity) {
//        startActivity(activity, new Intent(activity,MainActivity.class)
//                .putExtra(I.BACK_MAIN_FROM_CHAT,true));
//    }
//    public static void gotoGuide(SplashActivity splashActivity) {
//        startActivity(splashActivity, GuideActivity.class);
//    }
}
