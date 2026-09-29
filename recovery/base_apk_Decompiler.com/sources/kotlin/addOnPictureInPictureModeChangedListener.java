package kotlin;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public class addOnPictureInPictureModeChangedListener {
    private final Object[] MediaBrowserCompatCustomActionResultReceiver = new Object[2];
    private static final Class<?>[] read = {Context.class, AttributeSet.class};
    private static final int[] AudioAttributesImplBaseParcelizer = {R.attr.onClick};
    private static final int[] write = {R.attr.accessibilityHeading};
    private static final int[] AudioAttributesCompatParcelizer = {R.attr.accessibilityPaneTitle};
    private static final int[] MediaBrowserCompatItemReceiver = {R.attr.screenReaderFocusable};
    private static final String[] RemoteActionCompatParcelizer = {"android.widget.", "android.view.", "android.webkit."};
    private static final AppCompatCheckBox<String, Constructor<? extends View>> IconCompatParcelizer = new AppCompatCheckBox<>();

    private void RemoteActionCompatParcelizer(Context context, View view, AttributeSet attributeSet) {
    }

    protected View RemoteActionCompatParcelizer(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View RemoteActionCompatParcelizer(android.view.View r1, java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.addOnPictureInPictureModeChangedListener.RemoteActionCompatParcelizer(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean):android.view.View");
    }

    protected AppCompatTextView MediaBrowserCompatSearchResultReceiver(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    protected AppCompatImageView AudioAttributesImplApi21Parcelizer(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected AppCompatButton read(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    protected AppCompatEditText write(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    protected AppCompatSpinner MediaMetadataCompat(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    protected AppCompatImageButton MediaBrowserCompatCustomActionResultReceiver(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    protected AppCompatCheckBox IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    protected AppCompatRadioButton AudioAttributesImplApi26Parcelizer(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    protected AppCompatCheckedTextView AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    protected AppCompatAutoCompleteTextView RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    protected AppCompatMultiAutoCompleteTextView MediaBrowserCompatItemReceiver(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    protected AppCompatRatingBar AudioAttributesImplBaseParcelizer(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    protected AppCompatSeekBar RatingCompat(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    protected AppCompatToggleButton MediaDescriptionCompat(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    private void read(View view, String str) {
        if (view != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" asked to inflate view for <");
        sb.append(str);
        sb.append(">, but returned null");
        throw new IllegalStateException(sb.toString());
    }

    private View read(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.MediaBrowserCompatCustomActionResultReceiver;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return RemoteActionCompatParcelizer(context, str, (String) null);
            }
            int i = 0;
            while (true) {
                String[] strArr = RemoteActionCompatParcelizer;
                if (i >= strArr.length) {
                    return null;
                }
                View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, str, strArr[i]);
                if (viewRemoteActionCompatParcelizer != null) {
                    return viewRemoteActionCompatParcelizer;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private void AudioAttributesCompatParcelizer(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && InvalidTypeIdException.onPrepareFromMediaId(view)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AudioAttributesImplBaseParcelizer);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new RemoteActionCompatParcelizer(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View RemoteActionCompatParcelizer(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String string;
        AppCompatCheckBox<String, Constructor<? extends View>> appCompatCheckBox = IconCompatParcelizer;
        Constructor<? extends View> constructor = appCompatCheckBox.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    string = sb.toString();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                string = str;
            }
            constructor = Class.forName(string, false, context.getClassLoader()).asSubclass(View.class).getConstructor(read);
            appCompatCheckBox.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private static Context write(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.View, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.View_theme, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof initializeViewTreeOwners) && ((initializeViewTreeOwners) context).IconCompatParcelizer() == resourceId)) ? context : new initializeViewTreeOwners(context, resourceId);
    }

    static class RemoteActionCompatParcelizer implements View.OnClickListener {
        private final View AudioAttributesCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private Method read;
        private Context write;

        public RemoteActionCompatParcelizer(View view, String str) {
            this.AudioAttributesCompatParcelizer = view;
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.read == null) {
                write(this.AudioAttributesCompatParcelizer.getContext());
            }
            try {
                this.read.invoke(this.write, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        private void write(Context context) {
            String string;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.RemoteActionCompatParcelizer, View.class)) != null) {
                        this.read = method;
                        this.write = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.AudioAttributesCompatParcelizer.getId();
            if (id == -1) {
                string = "";
            } else {
                StringBuilder sb = new StringBuilder(" with id '");
                sb.append(this.AudioAttributesCompatParcelizer.getContext().getResources().getResourceEntryName(id));
                sb.append("'");
                string = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("Could not find method ");
            sb2.append(this.RemoteActionCompatParcelizer);
            sb2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            sb2.append(this.AudioAttributesCompatParcelizer.getClass());
            sb2.append(string);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
