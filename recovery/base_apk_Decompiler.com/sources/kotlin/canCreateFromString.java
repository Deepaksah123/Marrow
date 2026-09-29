package kotlin;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._deserializeFromObjectId;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u000f\u001a\u00020\u000e*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011*\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0014"}, d2 = {"Lo/AbstractDeserializer;", "Lo/bufferMapProperty;", "p0", "Lo/_reportMissingSetter$write;", "p1", "Lo/getDelegateType;", "p2", "Landroid/text/SpannableString;", "write", "(Lo/AbstractDeserializer;Lo/bufferMapProperty;Lo/_reportMissingSetter$write;Lo/getDelegateType;)Landroid/text/SpannableString;", "Lo/_findPropertyUnwrapper;", "", "p3", "p4", "", "read", "(Landroid/text/SpannableString;Lo/_findPropertyUnwrapper;IILo/bufferMapProperty;Lo/_reportMissingSetter$write;)V", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_deserializeFromObjectId;", "Lo/_deserializeFromObjectId$IconCompatParcelizer;", "(Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;)Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class canCreateFromString {
    public static final SpannableString write(AbstractDeserializer abstractDeserializer, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar, getDelegateType getdelegatetype) {
        SpannableString spannableString = new SpannableString(abstractDeserializer.getIconCompatParcelizer());
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findPropertyUnwrapper>> listIconCompatParcelizer = abstractDeserializer.IconCompatParcelizer();
        if (listIconCompatParcelizer != null) {
            int size = listIconCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                AbstractDeserializer.AudioAttributesCompatParcelizer<_findPropertyUnwrapper> audioAttributesCompatParcelizer = listIconCompatParcelizer.get(i);
                _findPropertyUnwrapper _findpropertyunwrapperRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                read(spannableString, _findpropertyunwrapperRemoteActionCompatParcelizer.write((65503 & 1) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.read() : 0L, (65503 & 2) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer : 0L, (65503 & 4) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.RemoteActionCompatParcelizer : null, (65503 & 8) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.write : null, (65503 & 16) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.read : null, (65503 & 32) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer : null, (65503 & 64) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver : null, (65503 & 128) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver : 0L, (65503 & 256) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer : null, (65503 & 512) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer : null, (65503 & 1024) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem : null, (65503 & 2048) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.MediaDescriptionCompat : 0L, (65503 & 4096) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.MediaMetadataCompat : null, (65503 & 8192) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver : null, (65503 & 16384) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.RatingCompat : null, (65503 & 32768) != 0 ? _findpropertyunwrapperRemoteActionCompatParcelizer.onCustomAction : null), audioAttributesCompatParcelizer.getWrite(), audioAttributesCompatParcelizer.write(), buffermapproperty, writeVar);
            }
        }
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<handleIgnoredProperty>> list = abstractDeserializer.read(0, abstractDeserializer.length());
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractDeserializer.AudioAttributesCompatParcelizer<handleIgnoredProperty> audioAttributesCompatParcelizer2 = list.get(i2);
            spannableString.setSpan(getValueTypeDesc.write(audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer()), audioAttributesCompatParcelizer2.getWrite(), audioAttributesCompatParcelizer2.write(), 33);
        }
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<handleUnknownVanilla>> listRemoteActionCompatParcelizer = abstractDeserializer.RemoteActionCompatParcelizer(0, abstractDeserializer.length());
        int size3 = listRemoteActionCompatParcelizer.size();
        for (int i3 = 0; i3 < size3; i3++) {
            AbstractDeserializer.AudioAttributesCompatParcelizer<handleUnknownVanilla> audioAttributesCompatParcelizer3 = listRemoteActionCompatParcelizer.get(i3);
            spannableString.setSpan(getdelegatetype.IconCompatParcelizer(audioAttributesCompatParcelizer3.RemoteActionCompatParcelizer()), audioAttributesCompatParcelizer3.getWrite(), audioAttributesCompatParcelizer3.write(), 33);
        }
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId>> listWrite = abstractDeserializer.write(0, abstractDeserializer.length());
        int size4 = listWrite.size();
        for (int i4 = 0; i4 < size4; i4++) {
            AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId> audioAttributesCompatParcelizer4 = listWrite.get(i4);
            if (audioAttributesCompatParcelizer4.AudioAttributesImplBaseParcelizer() != audioAttributesCompatParcelizer4.getAudioAttributesCompatParcelizer()) {
                _deserializeFromObjectId _deserializefromobjectidIconCompatParcelizer = audioAttributesCompatParcelizer4.IconCompatParcelizer();
                if ((_deserializefromobjectidIconCompatParcelizer instanceof _deserializeFromObjectId.IconCompatParcelizer) && ((_deserializeFromObjectId.IconCompatParcelizer) _deserializefromobjectidIconCompatParcelizer).getAudioAttributesCompatParcelizer() == null) {
                    spannableString.setSpan(getdelegatetype.read(read(audioAttributesCompatParcelizer4)), audioAttributesCompatParcelizer4.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer4.getAudioAttributesCompatParcelizer(), 33);
                } else {
                    spannableString.setSpan(getdelegatetype.IconCompatParcelizer(audioAttributesCompatParcelizer4), audioAttributesCompatParcelizer4.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer4.getAudioAttributesCompatParcelizer(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final void read(SpannableString spannableString, _findPropertyUnwrapper _findpropertyunwrapper, int i, int i2, bufferMapProperty buffermapproperty, _reportMissingSetter.write writeVar) {
        SpannableString spannableString2 = spannableString;
        getValueClass.AudioAttributesCompatParcelizer(spannableString2, _findpropertyunwrapper.read(), i, i2);
        getValueClass.AudioAttributesCompatParcelizer(spannableString2, _findpropertyunwrapper.getAudioAttributesCompatParcelizer(), buffermapproperty, i, i2);
        if (_findpropertyunwrapper.getRemoteActionCompatParcelizer() != null || _findpropertyunwrapper.getWrite() != null) {
            getDataStream remoteActionCompatParcelizer = _findpropertyunwrapper.getRemoteActionCompatParcelizer();
            if (remoteActionCompatParcelizer == null) {
                remoteActionCompatParcelizer = getDataStream.INSTANCE.RemoteActionCompatParcelizer();
            }
            withValueDeserializer write = _findpropertyunwrapper.getWrite();
            spannableString.setSpan(new StyleSpan(BuilderBasedDeserializer.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, write != null ? write.getIconCompatParcelizer() : withValueDeserializer.INSTANCE.IconCompatParcelizer())), i, i2, 33);
        }
        if (_findpropertyunwrapper.getAudioAttributesImplBaseParcelizer() != null) {
            if (_findpropertyunwrapper.getAudioAttributesImplBaseParcelizer() instanceof DefaultDeserializationContext) {
                spannableString.setSpan(new TypefaceSpan(((DefaultDeserializationContext) _findpropertyunwrapper.getAudioAttributesImplBaseParcelizer()).getRemoteActionCompatParcelizer()), i, i2, 33);
            } else {
                _reportMissingSetter audioAttributesImplBaseParcelizer = _findpropertyunwrapper.getAudioAttributesImplBaseParcelizer();
                _findFormat read = _findpropertyunwrapper.getRead();
                Object remoteActionCompatParcelizer2 = _reportMissingSetter.write.RemoteActionCompatParcelizer$default(writeVar, audioAttributesImplBaseParcelizer, null, 0, read != null ? read.getRead() : _findFormat.INSTANCE.RemoteActionCompatParcelizer(), 6, null).getRemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer2, "");
                spannableString.setSpan(createFromInt.INSTANCE.write((Typeface) remoteActionCompatParcelizer2), i, i2, 33);
            }
        }
        if (_findpropertyunwrapper.getMediaMetadataCompat() != null) {
            if (_findpropertyunwrapper.getMediaMetadataCompat().write(renameAll.INSTANCE.AudioAttributesCompatParcelizer())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (_findpropertyunwrapper.getMediaMetadataCompat().write(renameAll.INSTANCE.RemoteActionCompatParcelizer())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (_findpropertyunwrapper.getAudioAttributesImplApi26Parcelizer() != null) {
            spannableString.setSpan(new ScaleXSpan(_findpropertyunwrapper.getAudioAttributesImplApi26Parcelizer().getRemoteActionCompatParcelizer()), i, i2, 33);
        }
        getValueClass.AudioAttributesCompatParcelizer(spannableString2, _findpropertyunwrapper.getMediaBrowserCompatMediaItem(), i, i2);
        getValueClass.IconCompatParcelizer(spannableString2, _findpropertyunwrapper.getMediaDescriptionCompat(), i, i2);
    }

    private static final AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId.IconCompatParcelizer> read(AbstractDeserializer.AudioAttributesCompatParcelizer<_deserializeFromObjectId> audioAttributesCompatParcelizer) {
        _deserializeFromObjectId _deserializefromobjectidIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.read(_deserializefromobjectidIconCompatParcelizer, "");
        return new AbstractDeserializer.AudioAttributesCompatParcelizer<>((_deserializeFromObjectId.IconCompatParcelizer) _deserializefromobjectidIconCompatParcelizer, audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer());
    }
}
