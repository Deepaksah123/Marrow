package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.readId3Metadata;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes5.dex */
public class BottomNavigationView extends NavigationBarView {

    @Deprecated
    public interface read extends NavigationBarView.AudioAttributesCompatParcelizer {
    }

    @Deprecated
    public interface write extends NavigationBarView.IconCompatParcelizer {
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public final int RemoteActionCompatParcelizer() {
        return 5;
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Design_BottomNavigationView);
    }

    private BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setTitle settitle = readId3Metadata.read(getContext(), attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.BottomNavigationView, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        if (settitle.AudioAttributesImplApi26Parcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.BottomNavigationView_android_minHeight)) {
            setMinimumHeight(settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.BottomNavigationView_android_minHeight, 0));
        }
        settitle.AudioAttributesCompatParcelizer(calculateNextSearchBytePosition.MediaMetadataCompat.BottomNavigationView_compatShadowEnabled, true);
        settitle.write();
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        checkAndPeekStreamMarker.IconCompatParcelizer(this, new checkAndPeekStreamMarker.RemoteActionCompatParcelizer() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.2
            @Override // o.checkAndPeekStreamMarker.RemoteActionCompatParcelizer
            public final WindowInsetsCompat RemoteActionCompatParcelizer(View view, WindowInsetsCompat windowInsetsCompat, checkAndPeekStreamMarker.write writeVar) {
                writeVar.IconCompatParcelizer += windowInsetsCompat.AudioAttributesImplBaseParcelizer();
                boolean z = InvalidTypeIdException.MediaBrowserCompatMediaItem(view) == 1;
                int iAudioAttributesImplApi21Parcelizer = windowInsetsCompat.AudioAttributesImplApi21Parcelizer();
                int iMediaBrowserCompatItemReceiver = windowInsetsCompat.MediaBrowserCompatItemReceiver();
                writeVar.read += z ? iMediaBrowserCompatItemReceiver : iAudioAttributesImplApi21Parcelizer;
                int i = writeVar.RemoteActionCompatParcelizer;
                if (!z) {
                    iAudioAttributesImplApi21Parcelizer = iMediaBrowserCompatItemReceiver;
                }
                writeVar.RemoteActionCompatParcelizer = i + iAudioAttributesImplApi21Parcelizer;
                writeVar.IconCompatParcelizer(view);
                return windowInsetsCompat;
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, read(i2));
    }

    private int read(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) write();
        if (bottomNavigationMenuView.read() != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            read().AudioAttributesCompatParcelizer(false);
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public final NavigationBarMenuView read(Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(read readVar) {
        setOnItemSelectedListener(readVar);
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(write writeVar) {
        setOnItemReselectedListener(writeVar);
    }
}
