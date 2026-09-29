package kotlin;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class readMetadataBlock {
    private static final Comparator<View> write = new Comparator<View>() { // from class: o.readMetadataBlock.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            return read(view, view2);
        }

        private static int read(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    };

    public static TextView read(Toolbar toolbar) {
        List<TextView> list = read(toolbar, toolbar.MediaBrowserCompatSearchResultReceiver());
        if (list.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(list, write);
    }

    public static TextView RemoteActionCompatParcelizer(Toolbar toolbar) {
        List<TextView> list = read(toolbar, toolbar.MediaDescriptionCompat());
        if (list.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(list, write);
    }

    private static List<TextView> read(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static ImageView AudioAttributesCompatParcelizer(Toolbar toolbar) {
        return read(toolbar, toolbar.AudioAttributesImplBaseParcelizer());
    }

    private static ImageView read(Toolbar toolbar, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    public static ActionMenuView write(Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static ImageButton IconCompatParcelizer(Toolbar toolbar) {
        Drawable drawableAudioAttributesImplApi21Parcelizer = toolbar.AudioAttributesImplApi21Parcelizer();
        if (drawableAudioAttributesImplApi21Parcelizer == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == drawableAudioAttributesImplApi21Parcelizer) {
                    return imageButton;
                }
            }
        }
        return null;
    }
}
