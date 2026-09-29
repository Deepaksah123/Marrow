package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u0007\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f"}, d2 = {"E", "Lo/setSupportButtonTintList;", "", "p0", "IconCompatParcelizer", "(Lo/setSupportButtonTintList;I)Ljava/lang/Object;", "", "RemoteActionCompatParcelizer", "(Lo/setSupportButtonTintList;I)V", "AudioAttributesCompatParcelizer", "(Lo/setSupportButtonTintList;)V", "", "Ljava/lang/Object;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class setSupportCheckMarkTintList {
    private static final Object AudioAttributesCompatParcelizer = new Object();

    public static final <E> void RemoteActionCompatParcelizer(setSupportButtonTintList<E> setsupportbuttontintlist, int i) {
        toMagicModuleMetaRepoModel.write(setsupportbuttontintlist, "");
        int iIconCompatParcelizer = setCheckMarkDrawable.IconCompatParcelizer(setsupportbuttontintlist.write, setsupportbuttontintlist.IconCompatParcelizer, i);
        if (iIconCompatParcelizer >= 0) {
            Object obj = setsupportbuttontintlist.AudioAttributesCompatParcelizer[iIconCompatParcelizer];
            Object obj2 = AudioAttributesCompatParcelizer;
            if (obj != obj2) {
                setsupportbuttontintlist.AudioAttributesCompatParcelizer[iIconCompatParcelizer] = obj2;
                setsupportbuttontintlist.RemoteActionCompatParcelizer = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void AudioAttributesCompatParcelizer(setSupportButtonTintList<E> setsupportbuttontintlist) {
        int i = setsupportbuttontintlist.IconCompatParcelizer;
        int[] iArr = setsupportbuttontintlist.write;
        Object[] objArr = setsupportbuttontintlist.AudioAttributesCompatParcelizer;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != AudioAttributesCompatParcelizer) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        setsupportbuttontintlist.RemoteActionCompatParcelizer = false;
        setsupportbuttontintlist.IconCompatParcelizer = i2;
    }

    public static final <E> E IconCompatParcelizer(setSupportButtonTintList<E> setsupportbuttontintlist, int i) {
        toMagicModuleMetaRepoModel.write(setsupportbuttontintlist, "");
        int iIconCompatParcelizer = setCheckMarkDrawable.IconCompatParcelizer(setsupportbuttontintlist.write, setsupportbuttontintlist.IconCompatParcelizer, i);
        if (iIconCompatParcelizer < 0 || setsupportbuttontintlist.AudioAttributesCompatParcelizer[iIconCompatParcelizer] == AudioAttributesCompatParcelizer) {
            return null;
        }
        return (E) setsupportbuttontintlist.AudioAttributesCompatParcelizer[iIconCompatParcelizer];
    }
}
