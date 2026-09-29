package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.configureFromLongCreator;

/* JADX INFO: loaded from: classes2.dex */
public final class _addSuperTypes {
    public static ActionMode.Callback write(TextView textView, ActionMode.Callback callback) {
        return callback;
    }

    @Deprecated
    public static void read(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Deprecated
    public static int RemoteActionCompatParcelizer(TextView textView) {
        return textView.getMaxLines();
    }

    public static void RemoteActionCompatParcelizer(TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    @Deprecated
    public static Drawable[] read(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static ActionMode.Callback AudioAttributesCompatParcelizer(ActionMode.Callback callback) {
        return callback instanceof IconCompatParcelizer ? ((IconCompatParcelizer) callback).RemoteActionCompatParcelizer() : callback;
    }

    static class IconCompatParcelizer implements ActionMode.Callback {
        private final ActionMode.Callback AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer;
        private final TextView MediaBrowserCompatCustomActionResultReceiver;
        private boolean RemoteActionCompatParcelizer;
        private Method read;
        private Class<?> write;

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.AudioAttributesCompatParcelizer.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            AudioAttributesCompatParcelizer(menu);
            return this.AudioAttributesCompatParcelizer.onPrepareActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.AudioAttributesCompatParcelizer.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.AudioAttributesCompatParcelizer.onDestroyActionMode(actionMode);
        }

        ActionMode.Callback RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        private void AudioAttributesCompatParcelizer(Menu menu) {
            Method declaredMethod;
            Context context = this.MediaBrowserCompatCustomActionResultReceiver.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.IconCompatParcelizer) {
                this.IconCompatParcelizer = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.write = cls;
                    this.read = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.RemoteActionCompatParcelizer = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.write = null;
                    this.read = null;
                    this.RemoteActionCompatParcelizer = false;
                }
            }
            try {
                if (this.RemoteActionCompatParcelizer && this.write.isInstance(menu)) {
                    declaredMethod = this.read;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context, packageManager);
                for (int i = 0; i < listAudioAttributesCompatParcelizer.size(); i++) {
                    ResolveInfo resolveInfo = listAudioAttributesCompatParcelizer.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(IconCompatParcelizer(resolveInfo, this.MediaBrowserCompatCustomActionResultReceiver)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        private List<ResolveInfo> AudioAttributesCompatParcelizer(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(read(), 0)) {
                    if (write(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        private boolean write(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(((PackageItemInfo) resolveInfo.activityInfo).packageName)) {
                return true;
            }
            if (((ComponentInfo) resolveInfo.activityInfo).exported) {
                return resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0;
            }
            return false;
        }

        private Intent IconCompatParcelizer(ResolveInfo resolveInfo, TextView textView) {
            return read().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !AudioAttributesCompatParcelizer(textView)).setClassName(((PackageItemInfo) resolveInfo.activityInfo).packageName, ((PackageItemInfo) resolveInfo.activityInfo).name);
        }

        private boolean AudioAttributesCompatParcelizer(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private Intent read() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    public static void AudioAttributesCompatParcelizer(TextView textView, int i) {
        StringCollectionDeserializer.IconCompatParcelizer(i);
        read.read(textView, i);
    }

    public static void write(TextView textView, int i) {
        int i2;
        StringCollectionDeserializer.IconCompatParcelizer(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static int write(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int IconCompatParcelizer(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void read(TextView textView, int i) {
        StringCollectionDeserializer.IconCompatParcelizer(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void IconCompatParcelizer(TextView textView, configureFromLongCreator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        textView.setTextDirection(RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer()));
        textView.getPaint().set(audioAttributesCompatParcelizer.write());
        write.AudioAttributesCompatParcelizer(textView, audioAttributesCompatParcelizer.read());
        write.RemoteActionCompatParcelizer(textView, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
    }

    public static void write(TextView textView, configureFromLongCreator configurefromlongcreator) {
        textView.setText(read.write(configurefromlongcreator.IconCompatParcelizer()));
    }

    private static int RemoteActionCompatParcelizer(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    public static void write(TextView textView, ColorStateList colorStateList) {
        write.read(textView, colorStateList);
    }

    public static void AudioAttributesCompatParcelizer(TextView textView, PorterDuff.Mode mode) {
        write.IconCompatParcelizer(textView, mode);
    }

    static class read {
        static CharSequence write(PrecomputedText precomputedText) {
            return precomputedText;
        }

        static void read(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    static class write {
        static void AudioAttributesCompatParcelizer(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        static void RemoteActionCompatParcelizer(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }

        static void read(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void IconCompatParcelizer(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }
    }
}
