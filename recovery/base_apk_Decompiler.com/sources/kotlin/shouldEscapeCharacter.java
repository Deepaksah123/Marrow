package kotlin;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.marrow.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/shouldEscapeCharacter;", "", "<init>", "()V", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class shouldEscapeCharacter {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.shouldEscapeCharacter$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007J*\u0010\f\u001a\u00020\u0005*\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007J(\u0010\u000f\u001a\u00020\u0005*\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0011\u001a\u00020\u0012*\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u000bJ\f\u0010\u0015\u001a\u00020\u0012*\u0004\u0018\u00010\u0016J\n\u0010\u0017\u001a\u00020\u0005*\u00020\u0016¨\u0006\u0018"}, d2 = {"Lcom/marrow2/ui/UiUtility$Companion;", "", "<init>", "()V", "getColorFromAttr", "", "Landroid/content/Context;", "attrColor", "typedValue", "Landroid/util/TypedValue;", "resolveRefs", "", "getDimenPxFromAttr", "attrDimen", "tv", "getTextAppearanceFromAttr", "attrTextAppearance", "showKeyboard", "", "Landroid/widget/EditText;", "requestFocus", "hideKeyboard", "Landroid/view/View;", "getTotalInsetsHeight", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static int read(Context context, int i, TypedValue typedValue, boolean z) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(typedValue, "");
            context.getTheme().resolveAttribute(i, typedValue, true);
            return typedValue.data;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int write(Context context, int i, TypedValue typedValue, boolean z) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(typedValue, "");
            if (!context.getTheme().resolveAttribute(R.attr.cardViewStrokeWidth, typedValue, true)) {
                return 0;
            }
            if (typedValue.type == 5) {
                return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
            if (typedValue.resourceId != 0) {
                return context.getResources().getDimensionPixelSize(typedValue.resourceId);
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int AudioAttributesCompatParcelizer(Context context, int i, TypedValue typedValue, boolean z) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(typedValue, "");
            context.getTheme().resolveAttribute(i, typedValue, true);
            return typedValue.resourceId;
        }

        public static void IconCompatParcelizer(EditText editText) {
            if (editText != null) {
                editText.requestFocus();
                editText.setText(editText.getText());
                editText.setSelection(editText.getText().length());
                editText.setCursorVisible(true);
                Object systemService = editText.getContext().getSystemService("input_method");
                toMagicModuleMetaRepoModel.read(systemService, "");
                ((InputMethodManager) systemService).showSoftInput(editText, 0);
            }
        }

        public static void IconCompatParcelizer(View view) {
            if (view != null) {
                view.clearFocus();
                Object systemService = view.getContext().getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final int AudioAttributesCompatParcelizer(Context context, int i, TypedValue typedValue) {
        return Companion.read(context, i, typedValue, true);
    }
}
