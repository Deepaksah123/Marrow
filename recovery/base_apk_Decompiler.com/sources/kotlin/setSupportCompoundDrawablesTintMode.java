package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class setSupportCompoundDrawablesTintMode {
    private static final Object[] IconCompatParcelizer = new Object[0];
    private static final setTextAppearance<Object> RemoteActionCompatParcelizer = new setDropDownBackgroundResource(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i);
            sb.append(" is out of bounds. The list has ");
            sb.append(size);
            sb.append(" elements.");
            AppCompatImageButton.IconCompatParcelizer(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(List<?> list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            StringBuilder sb = new StringBuilder("Indices are out of order. fromIndex (");
            sb.append(i);
            sb.append(") is greater than toIndex (");
            sb.append(i2);
            sb.append(").");
            AppCompatImageButton.read(sb.toString());
        }
        if (i < 0) {
            StringBuilder sb2 = new StringBuilder("fromIndex (");
            sb2.append(i);
            sb2.append(") is less than 0.");
            AppCompatImageButton.IconCompatParcelizer(sb2.toString());
        }
        if (i2 > size) {
            StringBuilder sb3 = new StringBuilder("toIndex (");
            sb3.append(i2);
            sb3.append(") is more than than the list size (");
            sb3.append(size);
            sb3.append(')');
            AppCompatImageButton.IconCompatParcelizer(sb3.toString());
        }
    }

    public static final <E> setTextAppearance<E> AudioAttributesCompatParcelizer() {
        setTextAppearance<E> settextappearance = (setTextAppearance<E>) RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.read(settextappearance, "");
        return settextappearance;
    }

    public static final <E> setTextAppearance<E> read(E e) {
        return AudioAttributesCompatParcelizer(e);
    }

    public static final <E> setDropDownBackgroundResource<E> AudioAttributesCompatParcelizer(E e) {
        setDropDownBackgroundResource<E> setdropdownbackgroundresource = new setDropDownBackgroundResource<>(1);
        setdropdownbackgroundresource.AudioAttributesCompatParcelizer(e);
        return setdropdownbackgroundresource;
    }

    public static final <E> setDropDownBackgroundResource<E> IconCompatParcelizer(E e, E e2) {
        setDropDownBackgroundResource<E> setdropdownbackgroundresource = new setDropDownBackgroundResource<>(2);
        setdropdownbackgroundresource.AudioAttributesCompatParcelizer(e);
        setdropdownbackgroundresource.AudioAttributesCompatParcelizer(e2);
        return setdropdownbackgroundresource;
    }
}
