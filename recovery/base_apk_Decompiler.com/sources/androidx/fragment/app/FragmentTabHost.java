package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin._doAddInjectable;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    private Context AudioAttributesCompatParcelizer;
    private TabHost.OnTabChangeListener AudioAttributesImplApi21Parcelizer;
    private final ArrayList<IconCompatParcelizer> AudioAttributesImplApi26Parcelizer;
    private boolean IconCompatParcelizer;
    private FrameLayout MediaBrowserCompatCustomActionResultReceiver;
    private int RemoteActionCompatParcelizer;
    private FragmentManager read;
    private IconCompatParcelizer write;

    static final class IconCompatParcelizer {
        Fragment AudioAttributesCompatParcelizer;
        final String IconCompatParcelizer;
        final Class<?> RemoteActionCompatParcelizer;
        final Bundle read;
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.fragment.app.FragmentTabHost.SavedState.3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return AudioAttributesCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState[] newArray(int i) {
                return read(i);
            }

            private static SavedState AudioAttributesCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel);
            }

            private static SavedState[] read(int i) {
                return new SavedState[i];
            }
        };
        String RemoteActionCompatParcelizer;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.RemoteActionCompatParcelizer = parcel.readString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.RemoteActionCompatParcelizer);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append("}");
            return sb.toString();
        }
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, null);
        this.AudioAttributesImplApi26Parcelizer = new ArrayList<>();
        AudioAttributesCompatParcelizer(context, null);
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AudioAttributesImplApi26Parcelizer = new ArrayList<>();
        AudioAttributesCompatParcelizer(context, attributeSet);
    }

    private void AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    private void AudioAttributesCompatParcelizer(Context context) {
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, BitmapDescriptorFactory.HUE_RED));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, BitmapDescriptorFactory.HUE_RED));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.MediaBrowserCompatCustomActionResultReceiver = frameLayout2;
            frameLayout2.setId(this.RemoteActionCompatParcelizer);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager) {
        AudioAttributesCompatParcelizer(context);
        super.setup();
        this.AudioAttributesCompatParcelizer = context;
        this.read = fragmentManager;
        IconCompatParcelizer();
    }

    @Deprecated
    public void setup(Context context, FragmentManager fragmentManager, int i) {
        AudioAttributesCompatParcelizer(context);
        super.setup();
        this.AudioAttributesCompatParcelizer = context;
        this.read = fragmentManager;
        this.RemoteActionCompatParcelizer = i;
        IconCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver.setId(i);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }

    private void IconCompatParcelizer() {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.RemoteActionCompatParcelizer);
            this.MediaBrowserCompatCustomActionResultReceiver = frameLayout;
            if (frameLayout != null) {
                return;
            }
            StringBuilder sb = new StringBuilder("No tab content FrameLayout found for id ");
            sb.append(this.RemoteActionCompatParcelizer);
            throw new IllegalStateException(sb.toString());
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.AudioAttributesImplApi21Parcelizer = onTabChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.AudioAttributesImplApi26Parcelizer.size();
        _doAddInjectable _doaddinjectableIconCompatParcelizer = null;
        for (int i = 0; i < size; i++) {
            IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.get(i);
            iconCompatParcelizer.AudioAttributesCompatParcelizer = this.read.findFragmentByTag(iconCompatParcelizer.IconCompatParcelizer);
            if (iconCompatParcelizer.AudioAttributesCompatParcelizer != null && !iconCompatParcelizer.AudioAttributesCompatParcelizer.isDetached()) {
                if (iconCompatParcelizer.IconCompatParcelizer.equals(currentTabTag)) {
                    this.write = iconCompatParcelizer;
                } else {
                    if (_doaddinjectableIconCompatParcelizer == null) {
                        _doaddinjectableIconCompatParcelizer = this.read.IconCompatParcelizer();
                    }
                    _doaddinjectableIconCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer.AudioAttributesCompatParcelizer);
                }
            }
        }
        this.IconCompatParcelizer = true;
        _doAddInjectable _doaddinjectable = read(currentTabTag, _doaddinjectableIconCompatParcelizer);
        if (_doaddinjectable != null) {
            _doaddinjectable.write();
            this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.IconCompatParcelizer = false;
    }

    @Override // android.view.View
    @Deprecated
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.RemoteActionCompatParcelizer = getCurrentTabTag();
        return savedState;
    }

    @Override // android.view.View
    @Deprecated
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.RemoteActionCompatParcelizer);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(String str) {
        _doAddInjectable _doaddinjectable;
        if (this.IconCompatParcelizer && (_doaddinjectable = read(str, null)) != null) {
            _doaddinjectable.write();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.AudioAttributesImplApi21Parcelizer;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    private _doAddInjectable read(String str, _doAddInjectable _doaddinjectable) {
        IconCompatParcelizer iconCompatParcelizer = read(str);
        if (this.write != iconCompatParcelizer) {
            if (_doaddinjectable == null) {
                _doaddinjectable = this.read.IconCompatParcelizer();
            }
            IconCompatParcelizer iconCompatParcelizer2 = this.write;
            if (iconCompatParcelizer2 != null && iconCompatParcelizer2.AudioAttributesCompatParcelizer != null) {
                _doaddinjectable.RemoteActionCompatParcelizer(this.write.AudioAttributesCompatParcelizer);
            }
            if (iconCompatParcelizer != null) {
                if (iconCompatParcelizer.AudioAttributesCompatParcelizer == null) {
                    iconCompatParcelizer.AudioAttributesCompatParcelizer = this.read.onCommand().read(this.AudioAttributesCompatParcelizer.getClassLoader(), iconCompatParcelizer.RemoteActionCompatParcelizer.getName());
                    iconCompatParcelizer.AudioAttributesCompatParcelizer.setArguments(iconCompatParcelizer.read);
                    _doaddinjectable.read(this.RemoteActionCompatParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer, iconCompatParcelizer.IconCompatParcelizer);
                } else {
                    _doaddinjectable.write(iconCompatParcelizer.AudioAttributesCompatParcelizer);
                }
            }
            this.write = iconCompatParcelizer;
        }
        return _doaddinjectable;
    }

    private IconCompatParcelizer read(String str) {
        int size = this.AudioAttributesImplApi26Parcelizer.size();
        for (int i = 0; i < size; i++) {
            IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.get(i);
            if (iconCompatParcelizer.IconCompatParcelizer.equals(str)) {
                return iconCompatParcelizer;
            }
        }
        return null;
    }
}
