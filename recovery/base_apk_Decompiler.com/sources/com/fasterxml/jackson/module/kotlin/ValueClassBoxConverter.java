package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.util.StdConverter;
import java.lang.reflect.Method;
import kotlin.MagicModuleFeedbackRequestBody;
import kotlin.Metadata;
import kotlin.RenewEligible;
import kotlin.getRenewExpiresOn;
import kotlin.getShowPopup;
import kotlin.isHdPlaybackError;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0006*\u00020\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ValueClassBoxConverter;", "S", "", "D", "Lcom/fasterxml/jackson/databind/util/StdConverter;", "Ljava/lang/Class;", "p0", "Lo/isHdPlaybackError;", "p1", "<init>", "(Ljava/lang/Class;Lo/isHdPlaybackError;)V", "convert", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "boxMethod", "Ljava/lang/reflect/Method;", "Lcom/fasterxml/jackson/databind/ser/std/StdDelegatingSerializer;", "delegatingSerializer$delegate", "Lo/RenewEligible;", "getDelegatingSerializer", "()Lcom/fasterxml/jackson/databind/ser/std/StdDelegatingSerializer;", "delegatingSerializer"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ValueClassBoxConverter<S, D> extends StdConverter<S, D> {
    private final Method boxMethod;

    /* JADX INFO: renamed from: delegatingSerializer$delegate, reason: from kotlin metadata */
    private final RenewEligible delegatingSerializer;

    public ValueClassBoxConverter(Class<S> cls, isHdPlaybackError<D> ishdplaybackerror) throws NoSuchMethodException {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        Method declaredMethod = MagicModuleFeedbackRequestBody.IconCompatParcelizer(ishdplaybackerror).getDeclaredMethod("box-impl", cls);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        this.boxMethod = declaredMethod;
        this.delegatingSerializer = getRenewExpiresOn.RemoteActionCompatParcelizer(new ValueClassBoxConverter$delegatingSerializer$2(this));
    }

    @Override // com.fasterxml.jackson.databind.util.Converter
    public final D convert(S p0) {
        D d = (D) this.boxMethod.invoke(null, p0);
        if (d != null) {
            return d;
        }
        throw new NullPointerException("null cannot be cast to non-null type D of com.fasterxml.jackson.module.kotlin.ValueClassBoxConverter");
    }

    public final StdDelegatingSerializer getDelegatingSerializer() {
        return (StdDelegatingSerializer) this.delegatingSerializer.RemoteActionCompatParcelizer();
    }
}
