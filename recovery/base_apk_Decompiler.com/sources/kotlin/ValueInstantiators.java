package kotlin;

import android.graphics.Typeface;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.findOnlyParamWithoutInjection;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001aU\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u000e\u0010\u0013\u001a\u001d\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u0018\u0010\u001b"}, d2 = {"Lo/canInstantiate;", "Lo/_findPropertyUnwrapper;", "p0", "Lkotlin/Function4;", "Lo/_reportMissingSetter;", "Lo/getDataStream;", "Lo/withValueDeserializer;", "Lo/_findFormat;", "Landroid/graphics/Typeface;", "p1", "Lo/bufferMapProperty;", "p2", "", "p3", "RemoteActionCompatParcelizer", "(Lo/canInstantiate;Lo/_findPropertyUnwrapper;Lo/getMagicModuleStat;Lo/bufferMapProperty;Z)Lo/_findPropertyUnwrapper;", "Lo/ReadableObjectIdReferring;", "Lo/switchToNext;", "Lo/_find2ViaAlias;", "(JZJLo/_find2ViaAlias;)Lo/_findPropertyUnwrapper;", "Lo/findOnlyParamWithoutInjection;", "", "AudioAttributesCompatParcelizer", "(Lo/canInstantiate;Lo/findOnlyParamWithoutInjection;)V", "read", "(Lo/_findPropertyUnwrapper;)Z", "", "(F)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ValueInstantiators {
    public static final float read(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    public static final _findPropertyUnwrapper RemoteActionCompatParcelizer(canInstantiate caninstantiate, _findPropertyUnwrapper _findpropertyunwrapper, getMagicModuleStat<? super _reportMissingSetter, ? super getDataStream, ? super withValueDeserializer, ? super _findFormat, ? extends Typeface> getmagicmodulestat, bufferMapProperty buffermapproperty, boolean z) {
        long jWrite = ReadableObjectIdReferring.write(_findpropertyunwrapper.getAudioAttributesCompatParcelizer());
        if (processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.read())) {
            caninstantiate.setTextSize(buffermapproperty.c_(_findpropertyunwrapper.getAudioAttributesCompatParcelizer()));
        } else if (processUnwrapped.read(jWrite, processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer())) {
            caninstantiate.setTextSize(caninstantiate.getTextSize() * ReadableObjectIdReferring.AudioAttributesCompatParcelizer(_findpropertyunwrapper.getAudioAttributesCompatParcelizer()));
        }
        if (read(_findpropertyunwrapper)) {
            _reportMissingSetter audioAttributesImplBaseParcelizer = _findpropertyunwrapper.getAudioAttributesImplBaseParcelizer();
            getDataStream remoteActionCompatParcelizer = _findpropertyunwrapper.getRemoteActionCompatParcelizer();
            if (remoteActionCompatParcelizer == null) {
                remoteActionCompatParcelizer = getDataStream.INSTANCE.RemoteActionCompatParcelizer();
            }
            withValueDeserializer write = _findpropertyunwrapper.getWrite();
            withValueDeserializer withvaluedeserializerIconCompatParcelizer = withValueDeserializer.IconCompatParcelizer(write != null ? write.getIconCompatParcelizer() : withValueDeserializer.INSTANCE.IconCompatParcelizer());
            _findFormat read = _findpropertyunwrapper.getRead();
            caninstantiate.setTypeface(getmagicmodulestat.write(audioAttributesImplBaseParcelizer, remoteActionCompatParcelizer, withvaluedeserializerIconCompatParcelizer, _findFormat.write(read != null ? read.getRead() : _findFormat.INSTANCE.RemoteActionCompatParcelizer())));
        }
        if (_findpropertyunwrapper.getMediaBrowserCompatMediaItem() != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_findpropertyunwrapper.getMediaBrowserCompatMediaItem(), canCreateFromBoolean.INSTANCE.read())) {
            getDelegateCreator.INSTANCE.IconCompatParcelizer(caninstantiate, _findpropertyunwrapper.getMediaBrowserCompatMediaItem());
        }
        if (_findpropertyunwrapper.getMediaBrowserCompatCustomActionResultReceiver() != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) _findpropertyunwrapper.getMediaBrowserCompatCustomActionResultReceiver(), (Object) "")) {
            caninstantiate.setFontFeatureSettings(_findpropertyunwrapper.getMediaBrowserCompatCustomActionResultReceiver());
        }
        if (_findpropertyunwrapper.getAudioAttributesImplApi26Parcelizer() != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_findpropertyunwrapper.getAudioAttributesImplApi26Parcelizer(), CreatorCandidate.INSTANCE.RemoteActionCompatParcelizer())) {
            caninstantiate.setTextScaleX(caninstantiate.getTextScaleX() * _findpropertyunwrapper.getAudioAttributesImplApi26Parcelizer().getRemoteActionCompatParcelizer());
            caninstantiate.setTextSkewX(caninstantiate.getTextSkewX() + _findpropertyunwrapper.getAudioAttributesImplApi26Parcelizer().getRead());
        }
        caninstantiate.IconCompatParcelizer(_findpropertyunwrapper.read());
        caninstantiate.read(_findpropertyunwrapper.IconCompatParcelizer(), calloc.INSTANCE.IconCompatParcelizer(), _findpropertyunwrapper.AudioAttributesCompatParcelizer());
        caninstantiate.RemoteActionCompatParcelizer(_findpropertyunwrapper.getMediaBrowserCompatSearchResultReceiver());
        caninstantiate.IconCompatParcelizer(_findpropertyunwrapper.getMediaMetadataCompat());
        caninstantiate.AudioAttributesCompatParcelizer(_findpropertyunwrapper.getOnCustomAction());
        if (processUnwrapped.read(ReadableObjectIdReferring.write(_findpropertyunwrapper.getMediaBrowserCompatItemReceiver()), processUnwrapped.INSTANCE.read()) && ReadableObjectIdReferring.AudioAttributesCompatParcelizer(_findpropertyunwrapper.getMediaBrowserCompatItemReceiver()) != BitmapDescriptorFactory.HUE_RED) {
            float textSize = caninstantiate.getTextSize() * caninstantiate.getTextScaleX();
            float fC_ = buffermapproperty.c_(_findpropertyunwrapper.getMediaBrowserCompatItemReceiver());
            if (textSize != BitmapDescriptorFactory.HUE_RED) {
                caninstantiate.setLetterSpacing(fC_ / textSize);
            }
        } else if (processUnwrapped.read(ReadableObjectIdReferring.write(_findpropertyunwrapper.getMediaBrowserCompatItemReceiver()), processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer())) {
            caninstantiate.setLetterSpacing(ReadableObjectIdReferring.AudioAttributesCompatParcelizer(_findpropertyunwrapper.getMediaBrowserCompatItemReceiver()));
        }
        return RemoteActionCompatParcelizer(_findpropertyunwrapper.getMediaBrowserCompatItemReceiver(), z, _findpropertyunwrapper.getMediaDescriptionCompat(), _findpropertyunwrapper.getAudioAttributesImplApi21Parcelizer());
    }

    private static final _findPropertyUnwrapper RemoteActionCompatParcelizer(long j, boolean z, long j2, _find2ViaAlias _find2viaalias) {
        long jAudioAttributesImplApi21Parcelizer = j2;
        boolean z2 = false;
        boolean z3 = z && processUnwrapped.read(ReadableObjectIdReferring.write(j), processUnwrapped.INSTANCE.read()) && ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j) != BitmapDescriptorFactory.HUE_RED;
        boolean z4 = (switchToNext.RemoteActionCompatParcelizer(jAudioAttributesImplApi21Parcelizer, switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer()) || switchToNext.RemoteActionCompatParcelizer(jAudioAttributesImplApi21Parcelizer, switchToNext.INSTANCE.AudioAttributesImplBaseParcelizer())) ? false : true;
        if (_find2viaalias != null) {
            if (!_find2ViaAlias.read(_find2viaalias.getAudioAttributesCompatParcelizer(), _find2ViaAlias.INSTANCE.read())) {
                z2 = true;
            }
        }
        if (!z3 && !z4 && !z2) {
            return null;
        }
        long jIconCompatParcelizer = !z3 ? ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer() : j;
        if (!z4) {
            jAudioAttributesImplApi21Parcelizer = switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer();
        }
        return new _findPropertyUnwrapper(0L, 0L, null, null, null, null, null, jIconCompatParcelizer, !z2 ? null : _find2viaalias, null, null, jAudioAttributesImplApi21Parcelizer, null, null, null, null, 63103, null);
    }

    public static final void AudioAttributesCompatParcelizer(canInstantiate caninstantiate, findOnlyParamWithoutInjection findonlyparamwithoutinjection) {
        int flags;
        if (findonlyparamwithoutinjection == null) {
            findonlyparamwithoutinjection = findOnlyParamWithoutInjection.INSTANCE.RemoteActionCompatParcelizer();
        }
        if (findonlyparamwithoutinjection.getRead()) {
            flags = caninstantiate.getFlags() | 128;
        } else {
            flags = caninstantiate.getFlags() & (-129);
        }
        caninstantiate.setFlags(flags);
        int write = findonlyparamwithoutinjection.getWrite();
        if (findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(write, findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer.INSTANCE.AudioAttributesCompatParcelizer())) {
            caninstantiate.setFlags(caninstantiate.getFlags() | 64);
            caninstantiate.setHinting(0);
        } else if (findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(write, findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer.INSTANCE.read())) {
            caninstantiate.getFlags();
            caninstantiate.setHinting(1);
        } else if (findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(write, findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer.INSTANCE.RemoteActionCompatParcelizer())) {
            caninstantiate.getFlags();
            caninstantiate.setHinting(0);
        } else {
            caninstantiate.getFlags();
        }
    }

    public static final boolean read(_findPropertyUnwrapper _findpropertyunwrapper) {
        return (_findpropertyunwrapper.getAudioAttributesImplBaseParcelizer() == null && _findpropertyunwrapper.getWrite() == null && _findpropertyunwrapper.getRemoteActionCompatParcelizer() == null) ? false : true;
    }
}
