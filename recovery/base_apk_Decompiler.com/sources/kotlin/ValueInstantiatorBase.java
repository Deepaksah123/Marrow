package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.resetWithString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a;\u0010\u000e\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroid/graphics/Paint;", "Lo/findViews;", "p0", "", "IconCompatParcelizer", "(Landroid/graphics/Paint;Lo/findViews;)V", "Lo/resetWithString;", "Landroid/graphics/Canvas;", "p1", "", "p2", "p3", "", "p4", "RemoteActionCompatParcelizer", "(Lo/resetWithString;Landroid/graphics/Canvas;Landroid/graphics/Paint;FFI)V", "Lo/Instantiatable;", "Lo/calloc;", "Lkotlin/Function0;", "write", "(Landroid/graphics/Paint;Lo/Instantiatable;FJLo/getCreatedOnDateMs;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ValueInstantiatorBase {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(Paint paint, findViews findviews) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(findviews, findTypeResolver.INSTANCE)) {
            paint.setStyle(Paint.Style.FILL);
            return;
        }
        if (!(findviews instanceof findValueInstantiator)) {
            throw new RenewEligibleCreator();
        }
        paint.setStyle(Paint.Style.STROKE);
        findValueInstantiator findvalueinstantiator = (findValueInstantiator) findviews;
        paint.setStrokeWidth(findvalueinstantiator.getIconCompatParcelizer());
        paint.setStrokeMiter(findvalueinstantiator.getRemoteActionCompatParcelizer());
        paint.setStrokeCap(_deserializeFromNonArray.RemoteActionCompatParcelizer(findvalueinstantiator.getWrite()));
        paint.setStrokeJoin(_deserializeFromNonArray.read(findvalueinstantiator.getAudioAttributesCompatParcelizer()));
        setCurrentLength read = findvalueinstantiator.getRead();
        paint.setPathEffect(read != null ? getCurrentSegmentLength.read(read) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(resetWithString resetwithstring, Canvas canvas, Paint paint, float f, float f2, int i) {
        if (resetwithstring instanceof resetWithString.AudioAttributesCompatParcelizer) {
            canvas.save();
            resetWithString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (resetWithString.AudioAttributesCompatParcelizer) resetwithstring;
            WritableTypeIdInclusion read = audioAttributesCompatParcelizer.getRead();
            canvas.translate(f, f2 - ((read.getIconCompatParcelizer() - read.getRemoteActionCompatParcelizer()) / 2.0f));
            removeSoftRefsClearedByGc iconCompatParcelizer = audioAttributesCompatParcelizer.getIconCompatParcelizer();
            if (iconCompatParcelizer instanceof getCurrentSegment) {
                canvas.drawPath(((getCurrentSegment) iconCompatParcelizer).getRemoteActionCompatParcelizer(), paint);
                canvas.restore();
                return;
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        if (resetwithstring instanceof resetWithString.RemoteActionCompatParcelizer) {
            resetWithString.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (resetWithString.RemoteActionCompatParcelizer) resetwithstring;
            if (!allocByteBuffer.read(remoteActionCompatParcelizer.getRead())) {
                removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = writeIndentation.write();
                removeSoftRefsClearedByGc.RemoteActionCompatParcelizer$default(removesoftrefsclearedbygcWrite, remoteActionCompatParcelizer.getRead(), null, 2, null);
                canvas.save();
                canvas.translate(f, f2 - (remoteActionCompatParcelizer.getRead().read() / 2.0f));
                if (removesoftrefsclearedbygcWrite instanceof getCurrentSegment) {
                    canvas.drawPath(((getCurrentSegment) removesoftrefsclearedbygcWrite).getRemoteActionCompatParcelizer(), paint);
                    canvas.restore();
                    return;
                }
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (remoteActionCompatParcelizer.getRead().getWrite() >> 32));
            canvas.drawRoundRect(f, f2 - (remoteActionCompatParcelizer.getRead().read() / 2.0f), (i * remoteActionCompatParcelizer.getRead().AudioAttributesImplBaseParcelizer()) + f, (remoteActionCompatParcelizer.getRead().read() / 2.0f) + f2, fIntBitsToFloat, fIntBitsToFloat, paint);
            return;
        }
        if (!(resetwithstring instanceof resetWithString.read)) {
            throw new RenewEligibleCreator();
        }
        resetWithString.read readVar = (resetWithString.read) resetwithstring;
        WritableTypeIdInclusion writableTypeIdInclusionWrite = readVar.write();
        float iconCompatParcelizer2 = (writableTypeIdInclusionWrite.getIconCompatParcelizer() - writableTypeIdInclusionWrite.getRemoteActionCompatParcelizer()) / 2.0f;
        WritableTypeIdInclusion writableTypeIdInclusionWrite2 = readVar.write();
        float write = writableTypeIdInclusionWrite2.getWrite();
        float audioAttributesCompatParcelizer2 = writableTypeIdInclusionWrite2.getAudioAttributesCompatParcelizer();
        WritableTypeIdInclusion writableTypeIdInclusionWrite3 = readVar.write();
        canvas.drawRect(f, f2 - iconCompatParcelizer2, (i * (write - audioAttributesCompatParcelizer2)) + f, f2 + ((writableTypeIdInclusionWrite3.getIconCompatParcelizer() - writableTypeIdInclusionWrite3.getRemoteActionCompatParcelizer()) / 2.0f), paint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(Paint paint, Instantiatable instantiatable, float f, long j, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        Integer numValueOf = null;
        if (instantiatable == null) {
            if (!Float.isNaN(f)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f * 255.0f));
            }
            getcreatedondatems.invoke();
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (instantiatable instanceof _hasOneOf) {
            int color = paint.getColor();
            if (!Float.isNaN(f)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f * 255.0f));
            }
            paint.setColor(RequestPayload.IconCompatParcelizer(((_hasOneOf) instantiatable).getRead()));
            getcreatedondatems.invoke();
            paint.setColor(color);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (!(instantiatable instanceof throwInternal)) {
            throw new RenewEligibleCreator();
        }
        Shader shader = paint.getShader();
        if (!Float.isNaN(f)) {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(f * 255.0f));
        }
        paint.setShader(((throwInternal) instantiatable).IconCompatParcelizer(j));
        getcreatedondatems.invoke();
        paint.setShader(shader);
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
    }
}
