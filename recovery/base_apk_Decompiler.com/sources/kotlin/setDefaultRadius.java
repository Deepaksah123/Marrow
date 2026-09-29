package kotlin;

import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009f\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0014\u0010\u0017\u001a\u001b\u0010\u0014\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0018\"&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a0\u00198\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/_handleOddName;", "Lkotlin/Function1;", "Lo/bufferMapProperty;", "Lo/getReferencedType;", "p0", "p1", "Lo/handleIdValue;", "", "p2", "", "p3", "", "p4", "p5", "Lo/assignParameter;", "p6", "p7", "p8", "Lo/setPaddingRight;", "p9", "IconCompatParcelizer", "(Lo/_handleOddName;Lo/getAnswerMap;Lo/getAnswerMap;Lo/getAnswerMap;FZJFFZLo/setPaddingRight;)Lo/_handleOddName;", "", "(I)Z", "(FF)Z", "Lo/MapperConfig;", "Lkotlin/Function0;", "Lo/MapperConfig;", "write", "()Lo/MapperConfig;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setDefaultRadius {
    private static final MapperConfig<getCreatedOnDateMs<getReferencedType>> IconCompatParcelizer = new MapperConfig<>("MagnifierPositionInRoot", (MagicModuleSubmissionRequestBody) null, 2, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);

    public static final boolean IconCompatParcelizer(int i) {
        return i >= 28;
    }

    public static final MapperConfig<getCreatedOnDateMs<getReferencedType>> write() {
        return IconCompatParcelizer;
    }

    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, getAnswerMap<? super bufferMapProperty, getReferencedType> getanswermap, getAnswerMap<? super bufferMapProperty, getReferencedType> getanswermap2, getAnswerMap<? super handleIdValue, getShowPopup> getanswermap3, float f, boolean z, long j, float f2, float f3, boolean z2, setPaddingRight setpaddingright) {
        if (IconCompatParcelizer$default(0, 1, null)) {
            return _handleoddname.AudioAttributesCompatParcelizer(new setPositionProvider(getanswermap, getanswermap2, getanswermap3, f, z, j, f2, f3, z2, setpaddingright == null ? setPaddingRight.INSTANCE.write() : setpaddingright, null));
        }
        return _handleoddname;
    }

    public static /* synthetic */ boolean IconCompatParcelizer$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Build.VERSION.SDK_INT;
        }
        return IconCompatParcelizer(i);
    }

    public static final boolean IconCompatParcelizer(float f, float f2) {
        return (Float.isNaN(f) && Float.isNaN(f2)) || f == f2;
    }
}
