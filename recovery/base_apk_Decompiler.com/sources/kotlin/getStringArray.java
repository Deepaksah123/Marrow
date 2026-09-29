package kotlin;

import android.content.Context;
import kotlin.getQuote;

/* JADX INFO: loaded from: classes4.dex */
public final class getStringArray extends setUploaded {
    public static int AudioAttributesCompatParcelizer;
    public static int RemoteActionCompatParcelizer;
    private final getPagerMcqIds IconCompatParcelizer;
    private final CourseConfigV2CustomModuleQuestionSource read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getStringArray(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        super(getQuote.AudioAttributesCompatParcelizer.read());
        if (courseConfigV2CustomModuleQuestionSource == null) {
            RemoteActionCompatParcelizer(0);
        }
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        this.read = courseConfigV2CustomModuleQuestionSource;
        this.IconCompatParcelizer = new getPagerMcqIds(courseConfigV2CustomModuleQuestionSource);
    }

    @Override // kotlin.CourseConfigV2TestTabItem
    public final getStartIndex IconCompatParcelizer() {
        getPagerMcqIds getpagermcqids = this.IconCompatParcelizer;
        if (getpagermcqids == null) {
            RemoteActionCompatParcelizer(1);
        }
        return getpagermcqids;
    }

    @Override // kotlin.getVariant
    public final getVariant AudioAttributesImplApi21Parcelizer() {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = this.read;
        if (courseConfigV2CustomModuleQuestionSource == null) {
            RemoteActionCompatParcelizer(2);
        }
        return courseConfigV2CustomModuleQuestionSource;
    }

    @Override // kotlin.getBooleanMap
    public final String toString() {
        StringBuilder sb = new StringBuilder("class ");
        sb.append(this.read.aQ_());
        sb.append("::this");
        return sb.toString();
    }

    private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static int MediaBrowserCompatMediaItem() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 7866626;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        RemoteActionCompatParcelizer = i3;
        return i3;
    }
}
