package kotlin;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class BinarySearchSeekerSeekTimestampConverter {
    private final AppCompatCheckBox<String, updateSeekCeiling> AudioAttributesCompatParcelizer = new AppCompatCheckBox<>();
    private final AppCompatCheckBox<String, PropertyValuesHolder[]> RemoteActionCompatParcelizer = new AppCompatCheckBox<>();

    private boolean AudioAttributesCompatParcelizer(String str) {
        return this.AudioAttributesCompatParcelizer.get(str) != null;
    }

    public final updateSeekCeiling read(String str) {
        if (!AudioAttributesCompatParcelizer(str)) {
            throw new IllegalArgumentException();
        }
        return this.AudioAttributesCompatParcelizer.get(str);
    }

    private void RemoteActionCompatParcelizer(String str, updateSeekCeiling updateseekceiling) {
        this.AudioAttributesCompatParcelizer.put(str, updateseekceiling);
    }

    public final boolean IconCompatParcelizer(String str) {
        return this.RemoteActionCompatParcelizer.get(str) != null;
    }

    public final PropertyValuesHolder[] write(String str) {
        if (!IconCompatParcelizer(str)) {
            throw new IllegalArgumentException();
        }
        return IconCompatParcelizer(this.RemoteActionCompatParcelizer.get(str));
    }

    public final void read(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.RemoteActionCompatParcelizer.put(str, propertyValuesHolderArr);
    }

    private static PropertyValuesHolder[] IconCompatParcelizer(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final <T> ObjectAnimator read(String str, T t, Property<T, ?> property) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, write(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        read(str).read(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final long read() {
        int remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
        long jMax = 0;
        for (int i = 0; i < remoteActionCompatParcelizer; i++) {
            updateSeekCeiling updateseekceilingIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i);
            jMax = Math.max(jMax, updateseekceilingIconCompatParcelizer.AudioAttributesCompatParcelizer() + updateseekceilingIconCompatParcelizer.write());
        }
        return jMax;
    }

    public static BinarySearchSeekerSeekTimestampConverter AudioAttributesCompatParcelizer(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return write(context, resourceId);
    }

    public static BinarySearchSeekerSeekTimestampConverter write(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return read(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return read(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    private static BinarySearchSeekerSeekTimestampConverter read(List<Animator> list) {
        BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter = new BinarySearchSeekerSeekTimestampConverter();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RemoteActionCompatParcelizer(binarySearchSeekerSeekTimestampConverter, list.get(i));
        }
        return binarySearchSeekerSeekTimestampConverter;
    }

    private static void RemoteActionCompatParcelizer(BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            binarySearchSeekerSeekTimestampConverter.read(objectAnimator.getPropertyName(), objectAnimator.getValues());
            binarySearchSeekerSeekTimestampConverter.RemoteActionCompatParcelizer(objectAnimator.getPropertyName(), updateSeekCeiling.IconCompatParcelizer(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(animator)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BinarySearchSeekerSeekTimestampConverter) {
            return this.AudioAttributesCompatParcelizer.equals(((BinarySearchSeekerSeekTimestampConverter) obj).AudioAttributesCompatParcelizer);
        }
        return false;
    }

    public int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}\n");
        return sb.toString();
    }
}
