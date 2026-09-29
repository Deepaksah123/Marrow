package kotlin;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public class createFullyDrawnExecutor extends menuHostHelperlambda0 implements DialogInterface {
    final AlertController write;

    public createFullyDrawnExecutor(Context context, int i) {
        super(context, read(context, i));
        this.write = new AlertController(getContext(), this, getWindow());
    }

    static int read(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(_init_lambda5.read.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final ListView IconCompatParcelizer() {
        return this.write.IconCompatParcelizer();
    }

    @Override // kotlin.menuHostHelperlambda0, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.write.read(charSequence);
    }

    @Override // kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.write.read();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.write.write(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.write.IconCompatParcelizer(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public static class AudioAttributesCompatParcelizer {
        private final int IconCompatParcelizer;
        private final AlertController.IconCompatParcelizer write;

        public AudioAttributesCompatParcelizer(Context context) {
            this(context, createFullyDrawnExecutor.read(context, 0));
        }

        public AudioAttributesCompatParcelizer(Context context, int i) {
            this.write = new AlertController.IconCompatParcelizer(new ContextThemeWrapper(context, createFullyDrawnExecutor.read(context, i)));
            this.IconCompatParcelizer = i;
        }

        public Context getContext() {
            return this.write.read;
        }

        public AudioAttributesCompatParcelizer setTitle(CharSequence charSequence) {
            this.write.onCommand = charSequence;
            return this;
        }

        public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(View view) {
            this.write.AudioAttributesCompatParcelizer = view;
            return this;
        }

        public final AudioAttributesCompatParcelizer read(Drawable drawable) {
            this.write.MediaBrowserCompatItemReceiver = drawable;
            return this;
        }

        public AudioAttributesCompatParcelizer setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.IconCompatParcelizer iconCompatParcelizer = this.write;
            iconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler = iconCompatParcelizer.read.getText(i);
            this.write.MediaBrowserCompatSearchResultReceiver = onClickListener;
            return this;
        }

        public AudioAttributesCompatParcelizer setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.IconCompatParcelizer iconCompatParcelizer = this.write;
            iconCompatParcelizer.AudioAttributesImplApi21Parcelizer = iconCompatParcelizer.read.getText(i);
            this.write.AudioAttributesImplApi26Parcelizer = onClickListener;
            return this;
        }

        public final AudioAttributesCompatParcelizer read(DialogInterface.OnKeyListener onKeyListener) {
            this.write.RatingCompat = onKeyListener;
            return this;
        }

        public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            this.write.IconCompatParcelizer = listAdapter;
            this.write.MediaMetadataCompat = onClickListener;
            return this;
        }

        public final AudioAttributesCompatParcelizer IconCompatParcelizer(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            this.write.IconCompatParcelizer = listAdapter;
            this.write.MediaMetadataCompat = onClickListener;
            this.write.RemoteActionCompatParcelizer = i;
            this.write.MediaBrowserCompatCustomActionResultReceiver = true;
            return this;
        }

        public AudioAttributesCompatParcelizer setView(View view) {
            this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = view;
            this.write.onAddQueueItem = 0;
            this.write.onCustomAction = false;
            return this;
        }

        public createFullyDrawnExecutor create() {
            createFullyDrawnExecutor createfullydrawnexecutor = new createFullyDrawnExecutor(this.write.read, this.IconCompatParcelizer);
            this.write.IconCompatParcelizer(createfullydrawnexecutor.write);
            createfullydrawnexecutor.setCancelable(this.write.write);
            if (this.write.write) {
                createfullydrawnexecutor.setCanceledOnTouchOutside(true);
            }
            createfullydrawnexecutor.setOnCancelListener(this.write.MediaDescriptionCompat);
            createfullydrawnexecutor.setOnDismissListener(this.write.MediaBrowserCompatMediaItem);
            if (this.write.RatingCompat != null) {
                createfullydrawnexecutor.setOnKeyListener(this.write.RatingCompat);
            }
            return createfullydrawnexecutor;
        }
    }
}
