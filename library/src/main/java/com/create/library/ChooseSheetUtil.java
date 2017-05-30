package com.create.library;

import android.app.Activity;

import java.util.List;

/**
 * Created by lzh on 17-2-24.
 */

public class ChooseSheetUtil {
    public static ActionSheetDialog getBottomChoose(Activity activity, String title, String[] chooseTexts, final OnItemClickListener listener) {
        ActionSheetDialog actionSheetDialog = new ActionSheetDialog(activity)
                .builder()
                .setTitle(title)
                .setCancelable(true)
                .setCanceledOnTouchOutside(true)
                .setCancelVisible(true);
        for (int i = 0; i < chooseTexts.length; i++) {

            actionSheetDialog.addSheetItem(chooseTexts[i],
                    ActionSheetDialog.SheetItemColor.Blue, new ActionSheetDialog.OnSheetItemClickListener() {
                        @Override
                        public void onClick(int which) {
                            listener.onItemClick(null, which);
                        }
                    });
        }
        return actionSheetDialog;
    }

    public static ActionSheetDialog getBottomChoose(Activity activity, String title, List<String> chooseTexts, final OnItemClickListener listener) {
        ActionSheetDialog actionSheetDialog = new ActionSheetDialog(activity)
                .builder()
                .setTitle(title)
                .setCancelable(true)
                .setCanceledOnTouchOutside(true)
                .setCancelVisible(true);
        for (int i = 0; i < chooseTexts.size(); i++) {

            actionSheetDialog.addSheetItem(chooseTexts.get(i),
                    ActionSheetDialog.SheetItemColor.Blue, new ActionSheetDialog.OnSheetItemClickListener() {
                        @Override
                        public void onClick(int which) {
                            listener.onItemClick(null, which);
                        }
                    });
        }
        return actionSheetDialog;
    }

    public interface OnItemClickListener {
        void onItemClick(Object o, int position);
    }


}
