package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import kotlin.PrivateMaxEntriesMapNode;
import kotlin._isNaN;
import kotlin.getAccessible;

/* JADX INFO: loaded from: classes4.dex */
public class MediaRouteExpandCollapseButton extends ImageButton {
    boolean AudioAttributesCompatParcelizer;
    View.OnClickListener AudioAttributesImplApi26Parcelizer;
    final String IconCompatParcelizer;
    final AnimationDrawable RemoteActionCompatParcelizer;
    final String read;
    final AnimationDrawable write;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnimationDrawable animationDrawable = (AnimationDrawable) _isNaN.getDrawable(context, PrivateMaxEntriesMapNode.read.mr_group_expand);
        this.RemoteActionCompatParcelizer = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) _isNaN.getDrawable(context, PrivateMaxEntriesMapNode.read.mr_group_collapse);
        this.write = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(getAccessible.RemoteActionCompatParcelizer(context, i), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_controller_expand_group);
        this.read = string;
        this.IconCompatParcelizer = context.getString(PrivateMaxEntriesMapNode.MediaBrowserCompatItemReceiver.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new View.OnClickListener() { // from class: androidx.mediarouter.app.MediaRouteExpandCollapseButton.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaRouteExpandCollapseButton.this.AudioAttributesCompatParcelizer = !r0.AudioAttributesCompatParcelizer;
                if (MediaRouteExpandCollapseButton.this.AudioAttributesCompatParcelizer) {
                    MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
                    mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.RemoteActionCompatParcelizer);
                    MediaRouteExpandCollapseButton.this.RemoteActionCompatParcelizer.start();
                    MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = MediaRouteExpandCollapseButton.this;
                    mediaRouteExpandCollapseButton2.setContentDescription(mediaRouteExpandCollapseButton2.IconCompatParcelizer);
                } else {
                    MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton3 = MediaRouteExpandCollapseButton.this;
                    mediaRouteExpandCollapseButton3.setImageDrawable(mediaRouteExpandCollapseButton3.write);
                    MediaRouteExpandCollapseButton.this.write.start();
                    MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton4 = MediaRouteExpandCollapseButton.this;
                    mediaRouteExpandCollapseButton4.setContentDescription(mediaRouteExpandCollapseButton4.read);
                }
                if (MediaRouteExpandCollapseButton.this.AudioAttributesImplApi26Parcelizer != null) {
                    MediaRouteExpandCollapseButton.this.AudioAttributesImplApi26Parcelizer.onClick(view);
                }
            }
        });
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.AudioAttributesImplApi26Parcelizer = onClickListener;
    }
}
