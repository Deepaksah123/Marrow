package kotlin;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0089\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\f2&\u0010\u0014\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0015*\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"", "p0", "", "p1", "Lo/deserializeWithObjectId;", "p2", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/AbstractDeserializer$RemoteActionCompatParcelizer;", "p3", "Lo/_findCustomMapDeserializer;", "p4", "Lo/bufferMapProperty;", "p5", "Lkotlin/Function4;", "Lo/_reportMissingSetter;", "Lo/getDataStream;", "Lo/withValueDeserializer;", "Lo/_findFormat;", "Landroid/graphics/Typeface;", "p6", "", "p7", "", "write", "(Ljava/lang/String;FLo/deserializeWithObjectId;Ljava/util/List;Ljava/util/List;Lo/bufferMapProperty;Lo/getMagicModuleStat;Z)Ljava/lang/CharSequence;", "RemoteActionCompatParcelizer", "(Lo/deserializeWithObjectId;)Z", "Lo/canCreateUsingDelegate$write;", "IconCompatParcelizer", "Lo/canCreateUsingDelegate$write;", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class canCreateUsingDelegate {
    private static final write IconCompatParcelizer = new write();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [o._booleanType] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final CharSequence write(String str, float f, deserializeWithObjectId deserializewithobjectid, List<? extends AbstractDeserializer.AudioAttributesCompatParcelizer<? extends AbstractDeserializer.RemoteActionCompatParcelizer>> list, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list2, bufferMapProperty buffermapproperty, getMagicModuleStat<? super _reportMissingSetter, ? super getDataStream, ? super withValueDeserializer, ? super _findFormat, ? extends Typeface> getmagicmodulestat, boolean z) {
        String strAudioAttributesCompatParcelizer;
        SpannableString spannableString;
        _findCustomTreeNodeDeserializer remoteActionCompatParcelizer;
        if (z && _booleanType.read()) {
            _getSetterInfo write2 = deserializewithobjectid.getWrite();
            _deserializeIfNatural _deserializeifnaturalIconCompatParcelizer = (write2 == null || (remoteActionCompatParcelizer = write2.getRemoteActionCompatParcelizer()) == null) ? null : _deserializeIfNatural.IconCompatParcelizer(remoteActionCompatParcelizer.getRead());
            strAudioAttributesCompatParcelizer = _booleanType.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(str, 0, str.length(), Integer.MAX_VALUE, _deserializeifnaturalIconCompatParcelizer == null ? 0 : _deserializeIfNatural.read(_deserializeifnaturalIconCompatParcelizer.getWrite(), _deserializeIfNatural.INSTANCE.AudioAttributesCompatParcelizer()));
            toMagicModuleMetaRepoModel.write(strAudioAttributesCompatParcelizer);
        } else {
            strAudioAttributesCompatParcelizer = str;
        }
        if (list.isEmpty() && list2.isEmpty() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(deserializewithobjectid.onPrepare(), withProperty.INSTANCE.AudioAttributesCompatParcelizer()) && ReadableObjectIdReferring.RemoteActionCompatParcelizer(deserializewithobjectid.onCustomAction()) == 0) {
            return strAudioAttributesCompatParcelizer;
        }
        if (strAudioAttributesCompatParcelizer instanceof Spannable) {
            spannableString = (Spannable) strAudioAttributesCompatParcelizer;
        } else {
            spannableString = new SpannableString(strAudioAttributesCompatParcelizer);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(deserializewithobjectid.onPlayFromMediaId(), renameAll.INSTANCE.AudioAttributesCompatParcelizer())) {
            getValueClass.IconCompatParcelizer(spannableString, IconCompatParcelizer, 0, str.length());
        }
        if (RemoteActionCompatParcelizer(deserializewithobjectid) && deserializewithobjectid.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() == null) {
            getValueClass.RemoteActionCompatParcelizer(spannableString, deserializewithobjectid.onCustomAction(), f, buffermapproperty);
        } else {
            find findVarMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = deserializewithobjectid.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            if (findVarMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
                findVarMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = find.INSTANCE.RemoteActionCompatParcelizer();
            }
            getValueClass.read(spannableString, deserializewithobjectid.onCustomAction(), f, buffermapproperty, findVarMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }
        getValueClass.AudioAttributesCompatParcelizer(spannableString, deserializewithobjectid.onPrepare(), f, buffermapproperty);
        getValueClass.read(spannableString, deserializewithobjectid, list, buffermapproperty, getmagicmodulestat);
        getValueClass.IconCompatParcelizer(spannableString, list, f, buffermapproperty, deserializewithobjectid.onPrepare());
        getFromObjectArguments.write(spannableString, list2, buffermapproperty);
        return spannableString;
    }

    public static final boolean RemoteActionCompatParcelizer(deserializeWithObjectId deserializewithobjectid) {
        _findCustomTreeNodeDeserializer remoteActionCompatParcelizer;
        _getSetterInfo write2 = deserializewithobjectid.getWrite();
        if (write2 == null || (remoteActionCompatParcelizer = write2.getRemoteActionCompatParcelizer()) == null) {
            return false;
        }
        return remoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/canCreateUsingDelegate$write;", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", "p0", "", "updateDrawState", "(Landroid/text/TextPaint;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write extends CharacterStyle {
        @Override // android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint p0) {
        }

        write() {
        }
    }
}
