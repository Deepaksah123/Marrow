package kotlin;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.marrow.R;
import com.marrow.designsystem.theme.AppTheme;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes3.dex */
public final class CmcdHeadersFactoryCmcdRequest {

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[AppTheme.values().length];
            try {
                iArr[AppTheme.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppTheme.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppTheme.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public static final String RemoteActionCompatParcelizer(int i) {
        int i2 = i % 100;
        if (i2 == 11 || i2 == 12 || i2 == 13) {
            return "th";
        }
        int i3 = i % 10;
        if (i3 == 1) {
            return CmcdConfiguration.KEY_STREAM_TYPE;
        }
        if (i3 == 2) {
            return "nd";
        }
        return i3 == 3 ? "rd" : "th";
    }

    public static final String write(String str) {
        if (str == null) {
            return null;
        }
        String str2 = str;
        if (str2.length() == 0) {
            return null;
        }
        String[] strArr = (String[]) new newYearNameItem(" ").read(str2).toArray(new String[0]);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArr) {
            if (str3.length() > 0) {
                String strSubstring = str3.substring(0, 1);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                Locale locale = Locale.getDefault();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
                String upperCase = strSubstring.toUpperCase(locale);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
                String strSubstring2 = str3.substring(1);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring2, "");
                sb.append(upperCase);
                sb.append(strSubstring2);
                sb.append(" ");
            }
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String str4 = string;
        int length = str4.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = toMagicModuleMetaRepoModel.read((int) str4.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str4.subSequence(i, length + 1).toString();
    }

    public static final void RemoteActionCompatParcelizer(Context context, String str, String str2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        Object systemService = context.getSystemService("clipboard");
        toMagicModuleMetaRepoModel.read(systemService, "");
        ClipData clipDataNewPlainText = ClipData.newPlainText(str2, str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(clipDataNewPlainText, "");
        ((ClipboardManager) systemService).setPrimaryClip(clipDataNewPlainText);
    }

    public static final String IconCompatParcelizer(Context context, int i, int i2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(context.getResources().getQuantityText(i, i2).toString(), Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    public static final int RemoteActionCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str2, "");
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            return Color.parseColor(str2);
        }
        return dispatchTouchEvent.write.write(str3) ? Color.parseColor(str) : Color.parseColor(str2);
    }

    public static final String IconCompatParcelizer(AppTheme appTheme) {
        toMagicModuleMetaRepoModel.write(appTheme, "");
        int i = RemoteActionCompatParcelizer.IconCompatParcelizer[appTheme.ordinal()];
        if (i != 1) {
            return (i == 2 || i != 3) ? "light_description.css" : "sepia_description.css";
        }
        return "dark_description.css";
    }

    public static final ColorStateList IconCompatParcelizer(Context context, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(shouldEscapeCharacter.Companion.read(context, i, new TypedValue(), true));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(colorStateListValueOf, "");
        return colorStateListValueOf;
    }

    public static final void IconCompatParcelizer(SpannableString spannableString, Context context, int i, int i2) {
        toMagicModuleMetaRepoModel.write(spannableString, "");
        toMagicModuleMetaRepoModel.write(context, "");
        spannableString.setSpan(new TextAppearanceSpan(context, R.attr.subtext2), i, i2, 33);
    }

    public static final void IconCompatParcelizer(SpannableString spannableString, Context context, int i, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(spannableString, "");
        toMagicModuleMetaRepoModel.write(context, "");
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        spannableString.setSpan(new ForegroundColorSpan(shouldEscapeCharacter.Companion.read(context, i, new TypedValue(), true)), i2, i3, 18);
    }

    public static final void RemoteActionCompatParcelizer(View view, int i) {
        toMagicModuleMetaRepoModel.write(view, "");
        int i2 = (i * 255) / 100;
        Drawable background = view.getBackground();
        if (background != null) {
            background.setAlpha(i2);
        }
    }

    public static final <T> boolean RemoteActionCompatParcelizer(List<? extends T> list, List<? extends T> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isContentTypeTest.write(new IconCompatParcelizer(list)), isContentTypeTest.write(new write(list2)));
    }

    public static final String read(AppTheme appTheme) {
        toMagicModuleMetaRepoModel.write(appTheme, "");
        int i = RemoteActionCompatParcelizer.IconCompatParcelizer[appTheme.ordinal()];
        if (i == 1) {
            return "dark_description.css";
        }
        if (i == 3) {
            return "sepia_description.css";
        }
        return "light_description.css";
    }

    public static final class AudioAttributesCompatParcelizer implements View.OnTouchListener {
        private final GestureDetector IconCompatParcelizer;

        AudioAttributesCompatParcelizer(View view, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            this.IconCompatParcelizer = new GestureDetector(view.getContext(), new C0022AudioAttributesCompatParcelizer(getcreatedondatems));
        }

        /* JADX INFO: renamed from: o.CmcdHeadersFactoryCmcdRequest$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name */
        public static final class C0022AudioAttributesCompatParcelizer extends GestureDetector.SimpleOnGestureListener {
            private /* synthetic */ getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;

            C0022AudioAttributesCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
                this.IconCompatParcelizer = getcreatedondatems;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                toMagicModuleMetaRepoModel.write(motionEvent, "");
                this.IconCompatParcelizer.invoke();
                return true;
            }
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            GestureDetector gestureDetector = this.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(motionEvent);
            gestureDetector.onTouchEvent(motionEvent);
            return false;
        }
    }

    public static final void AudioAttributesCompatParcelizer(View view, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        view.setOnTouchListener(new AudioAttributesCompatParcelizer(view, getcreatedondatems));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IconCompatParcelizer<T> implements CrossDeviceSyncResponseObjectContentType<T, T> {
        private /* synthetic */ Iterable IconCompatParcelizer;

        @Override // kotlin.CrossDeviceSyncResponseObjectContentType
        public final T write(T t) {
            return t;
        }

        public IconCompatParcelizer(Iterable iterable) {
            this.IconCompatParcelizer = iterable;
        }

        @Override // kotlin.CrossDeviceSyncResponseObjectContentType
        public final Iterator<T> write() {
            return this.IconCompatParcelizer.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class write<T> implements CrossDeviceSyncResponseObjectContentType<T, T> {
        private /* synthetic */ Iterable AudioAttributesCompatParcelizer;

        @Override // kotlin.CrossDeviceSyncResponseObjectContentType
        public final T write(T t) {
            return t;
        }

        public write(Iterable iterable) {
            this.AudioAttributesCompatParcelizer = iterable;
        }

        @Override // kotlin.CrossDeviceSyncResponseObjectContentType
        public final Iterator<T> write() {
            return this.AudioAttributesCompatParcelizer.iterator();
        }
    }
}
