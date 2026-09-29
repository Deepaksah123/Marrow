package kotlin;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;
import kotlin.StringDeserializer;

/* JADX INFO: loaded from: classes.dex */
public final class handleOnBackPressed {
    public static boolean RemoteActionCompatParcelizer(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 31 || InvalidTypeIdException.MediaDescriptionCompat(textView) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            InvalidTypeIdException.read(textView, new StringDeserializer.read(primaryClip, 1).IconCompatParcelizer(i != 16908322 ? 1 : 0).write());
        }
        return true;
    }

    public static boolean write(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && InvalidTypeIdException.MediaDescriptionCompat(view) != null) {
            Activity activityWrite = write(view);
            if (activityWrite == null) {
                Objects.toString(view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                if (view instanceof TextView) {
                    return write.write(dragEvent, (TextView) view, activityWrite);
                }
                return write.AudioAttributesCompatParcelizer(dragEvent, view, activityWrite);
            }
        }
        return false;
    }

    static final class write {
        static boolean write(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                InvalidTypeIdException.read(textView, new StringDeserializer.read(dragEvent.getClipData(), 3).write());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        static boolean AudioAttributesCompatParcelizer(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            InvalidTypeIdException.read(view, new StringDeserializer.read(dragEvent.getClipData(), 3).write());
            return true;
        }
    }

    static Activity write(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
