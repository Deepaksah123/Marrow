package kotlin;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.SubTypeValidator;
import kotlin._acceptJsonFormatVisitor;
import kotlin._fromVariable;

/* JADX INFO: loaded from: classes2.dex */
final class AsArraySerializerBase {
    private Uri AudioAttributesCompatParcelizer;
    private final _hasTypeResolver IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private final C0170format[] MediaBrowserCompatMediaItem;
    private final _serializeAsIndex MediaBrowserCompatSearchResultReceiver;
    private final List<C0170format> MediaDescriptionCompat;
    private final _hasTypeResolver MediaMetadataCompat;
    private final modifyArraySerializer RatingCompat;
    private final _getReferencedIfPresent RemoteActionCompatParcelizer;
    private final long handleMediaPlayPauseIfPendingOnHandler;
    private final BooleanSerializerAsNumber onAddQueueItem;
    private boolean onCommand;
    private final Uri[] onCustomAction;
    private final setName onFastForward;
    private _verifyAndResolvePlaceholders onMediaButtonEvent;
    private IOException read;
    private final _fromClass write;
    private long AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
    private final _shouldUnwrapSingle AudioAttributesImplApi26Parcelizer = new _shouldUnwrapSingle();
    private byte[] MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
    private long AudioAttributesImplApi21Parcelizer = C.TIME_UNSET;

    public static final class AudioAttributesCompatParcelizer {
        public Uri IconCompatParcelizer;
        public CollectionLikeType RemoteActionCompatParcelizer;
        public boolean write;

        public AudioAttributesCompatParcelizer() {
            RemoteActionCompatParcelizer();
        }

        public final void RemoteActionCompatParcelizer() {
            this.RemoteActionCompatParcelizer = null;
            this.write = false;
            this.IconCompatParcelizer = null;
        }
    }

    public AsArraySerializerBase(_getReferencedIfPresent _getreferencedifpresent, _serializeAsIndex _serializeasindex, Uri[] uriArr, C0170format[] c0170formatArr, _getReferenced _getreferenced, TypeNameIdResolver typeNameIdResolver, BooleanSerializerAsNumber booleanSerializerAsNumber, long j, List<C0170format> list, modifyArraySerializer modifyarrayserializer, _fromClass _fromclass) {
        this.RemoteActionCompatParcelizer = _getreferencedifpresent;
        this.MediaBrowserCompatSearchResultReceiver = _serializeasindex;
        this.onCustomAction = uriArr;
        this.MediaBrowserCompatMediaItem = c0170formatArr;
        this.onAddQueueItem = booleanSerializerAsNumber;
        this.handleMediaPlayPauseIfPendingOnHandler = j;
        this.MediaDescriptionCompat = list;
        this.RatingCompat = modifyarrayserializer;
        this.write = _fromclass;
        _hasTypeResolver _hastyperesolverWrite = _getreferenced.write();
        this.MediaMetadataCompat = _hastyperesolverWrite;
        if (typeNameIdResolver != null) {
            _hastyperesolverWrite.read(typeNameIdResolver);
        }
        this.IconCompatParcelizer = _getreferenced.write();
        this.onFastForward = new setName(c0170formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c0170formatArr[i].onPrepare & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.onMediaButtonEvent = new RemoteActionCompatParcelizer(this.onFastForward, parseTextAttribute.write(arrayList));
    }

    public final void write() throws IOException {
        IOException iOException = this.read;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.AudioAttributesCompatParcelizer;
        if (uri == null || !this.onCommand) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(uri);
    }

    public final setName AudioAttributesCompatParcelizer() {
        return this.onFastForward;
    }

    public final boolean read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void AudioAttributesCompatParcelizer(_verifyAndResolvePlaceholders _verifyandresolveplaceholders) {
        MediaBrowserCompatItemReceiver();
        this.onMediaButtonEvent = _verifyandresolveplaceholders;
    }

    public final _verifyAndResolvePlaceholders IconCompatParcelizer() {
        return this.onMediaButtonEvent;
    }

    public final void RemoteActionCompatParcelizer() {
        MediaBrowserCompatItemReceiver();
        this.read = null;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver = z;
    }

    public final long RemoteActionCompatParcelizer(long j, createKeySerializer createkeyserializer) {
        int i = this.onMediaButtonEvent.read();
        Uri[] uriArr = this.onCustomAction;
        _acceptJsonFormatVisitor _acceptjsonformatvisitorIconCompatParcelizer = (i >= uriArr.length || i == -1) ? null : this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(uriArr[this.onMediaButtonEvent.AudioAttributesImplApi21Parcelizer()], true);
        if (_acceptjsonformatvisitorIconCompatParcelizer == null || _acceptjsonformatvisitorIconCompatParcelizer.MediaDescriptionCompat.isEmpty() || !_acceptjsonformatvisitorIconCompatParcelizer.onPlayFromMediaId) {
            return j;
        }
        long jWrite = _acceptjsonformatvisitorIconCompatParcelizer.onCommand - this.MediaBrowserCompatSearchResultReceiver.write();
        long j2 = j - jWrite;
        int iAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer((List<? extends Comparable<? super Long>>) _acceptjsonformatvisitorIconCompatParcelizer.MediaDescriptionCompat, Long.valueOf(j2), true);
        long j3 = _acceptjsonformatvisitorIconCompatParcelizer.MediaDescriptionCompat.get(iAudioAttributesCompatParcelizer).MediaBrowserCompatMediaItem;
        return createkeyserializer.write(j2, j3, iAudioAttributesCompatParcelizer != _acceptjsonformatvisitorIconCompatParcelizer.MediaDescriptionCompat.size() - 1 ? _acceptjsonformatvisitorIconCompatParcelizer.MediaDescriptionCompat.get(iAudioAttributesCompatParcelizer + 1).MediaBrowserCompatMediaItem : j3) + jWrite;
    }

    public final int AudioAttributesCompatParcelizer(_isValuePresent _isvaluepresent) {
        List<_acceptJsonFormatVisitor.read> list;
        if (_isvaluepresent.RemoteActionCompatParcelizer == -1) {
            return 1;
        }
        _acceptJsonFormatVisitor _acceptjsonformatvisitor = (_acceptJsonFormatVisitor) buildTypeSerializer.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(this.onCustomAction[this.onFastForward.read(_isvaluepresent.MediaDescriptionCompat)], false));
        int i = (int) (_isvaluepresent.MediaBrowserCompatMediaItem - _acceptjsonformatvisitor.AudioAttributesImplBaseParcelizer);
        if (i < 0) {
            return 1;
        }
        if (i < _acceptjsonformatvisitor.MediaDescriptionCompat.size()) {
            list = _acceptjsonformatvisitor.MediaDescriptionCompat.get(i).RemoteActionCompatParcelizer;
        } else {
            list = _acceptjsonformatvisitor.onAddQueueItem;
        }
        if (_isvaluepresent.RemoteActionCompatParcelizer >= list.size()) {
            return 2;
        }
        _acceptJsonFormatVisitor.read readVar = list.get(_isvaluepresent.RemoteActionCompatParcelizer);
        if (readVar.read) {
            return 0;
        }
        return LaissezFaireSubTypeValidator.read(Uri.parse(_idFrom.RemoteActionCompatParcelizer(_acceptjsonformatvisitor.handleMediaPlayPauseIfPendingOnHandler, readVar.MediaDescriptionCompat)), _isvaluepresent.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer) ? 1 : 2;
    }

    public final void RemoteActionCompatParcelizer(_put _putVar, long j, List<_isValuePresent> list, boolean z, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        _acceptJsonFormatVisitor _acceptjsonformatvisitor;
        int i;
        long jWrite;
        Uri uri;
        _fromVariable.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer;
        String str;
        long j2;
        _isValuePresent _isvaluepresent = list.isEmpty() ? null : (_isValuePresent) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(list);
        int i2 = _isvaluepresent == null ? -1 : this.onFastForward.read(_isvaluepresent.MediaDescriptionCompat);
        long j3 = _putVar.write;
        long jMax = j - j3;
        long jIconCompatParcelizer = IconCompatParcelizer(j3);
        if (_isvaluepresent != null && !this.MediaBrowserCompatCustomActionResultReceiver) {
            long jMediaBrowserCompatItemReceiver = _isvaluepresent.MediaBrowserCompatItemReceiver();
            jMax = Math.max(0L, jMax - jMediaBrowserCompatItemReceiver);
            if (jIconCompatParcelizer != C.TIME_UNSET) {
                jIconCompatParcelizer = Math.max(0L, jIconCompatParcelizer - jMediaBrowserCompatItemReceiver);
            }
        }
        long j4 = jIconCompatParcelizer;
        long j5 = jMax;
        this.onMediaButtonEvent.RemoteActionCompatParcelizer(j3, j5, j4, list, write(_isvaluepresent, j));
        int iAudioAttributesImplApi21Parcelizer = this.onMediaButtonEvent.AudioAttributesImplApi21Parcelizer();
        boolean z2 = i2 != iAudioAttributesImplApi21Parcelizer;
        Uri uri2 = this.onCustomAction[iAudioAttributesImplApi21Parcelizer];
        if (!this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(uri2)) {
            audioAttributesCompatParcelizer.IconCompatParcelizer = uri2;
            this.onCommand &= uri2.equals(this.AudioAttributesCompatParcelizer);
            this.AudioAttributesCompatParcelizer = uri2;
            return;
        }
        _acceptJsonFormatVisitor _acceptjsonformatvisitorIconCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(uri2, true);
        this.MediaBrowserCompatCustomActionResultReceiver = _acceptjsonformatvisitorIconCompatParcelizer.onPlayFromMediaId;
        read(_acceptjsonformatvisitorIconCompatParcelizer);
        long jWrite2 = _acceptjsonformatvisitorIconCompatParcelizer.onCommand - this.MediaBrowserCompatSearchResultReceiver.write();
        int i3 = i2;
        Pair<Long, Integer> pair = read(_isvaluepresent, z2, _acceptjsonformatvisitorIconCompatParcelizer, jWrite2, j);
        long jLongValue = ((Long) pair.first).longValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (jLongValue >= _acceptjsonformatvisitorIconCompatParcelizer.AudioAttributesImplBaseParcelizer || _isvaluepresent == null || !z2) {
            _acceptjsonformatvisitor = _acceptjsonformatvisitorIconCompatParcelizer;
            i = iAudioAttributesImplApi21Parcelizer;
            jWrite = jWrite2;
            uri = uri2;
        } else {
            Uri uri3 = this.onCustomAction[i3];
            _acceptJsonFormatVisitor _acceptjsonformatvisitorIconCompatParcelizer2 = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(uri3, true);
            jWrite = _acceptjsonformatvisitorIconCompatParcelizer2.onCommand - this.MediaBrowserCompatSearchResultReceiver.write();
            Pair<Long, Integer> pair2 = read(_isvaluepresent, false, _acceptjsonformatvisitorIconCompatParcelizer2, jWrite, j);
            jLongValue = ((Long) pair2.first).longValue();
            iIntValue = ((Integer) pair2.second).intValue();
            i = i3;
            uri = uri3;
            _acceptjsonformatvisitor = _acceptjsonformatvisitorIconCompatParcelizer2;
        }
        if (i != i3 && i3 != -1) {
            this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(this.onCustomAction[i3]);
        }
        if (jLongValue < _acceptjsonformatvisitor.AudioAttributesImplBaseParcelizer) {
            this.read = new NumberSerializersBase();
            return;
        }
        IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(_acceptjsonformatvisitor, jLongValue, iIntValue);
        if (iconCompatParcelizerRemoteActionCompatParcelizer == null) {
            if (!_acceptjsonformatvisitor.RemoteActionCompatParcelizer) {
                audioAttributesCompatParcelizer.IconCompatParcelizer = uri;
                this.onCommand &= uri.equals(this.AudioAttributesCompatParcelizer);
                this.AudioAttributesCompatParcelizer = uri;
                return;
            } else {
                if (z || _acceptjsonformatvisitor.MediaDescriptionCompat.isEmpty()) {
                    audioAttributesCompatParcelizer.write = true;
                    return;
                }
                iconCompatParcelizerRemoteActionCompatParcelizer = new IconCompatParcelizer((_acceptJsonFormatVisitor.RemoteActionCompatParcelizer) onMoofContainerAtomRead.AudioAttributesCompatParcelizer(_acceptjsonformatvisitor.MediaDescriptionCompat), (_acceptjsonformatvisitor.AudioAttributesImplBaseParcelizer + ((long) _acceptjsonformatvisitor.MediaDescriptionCompat.size())) - 1, -1);
            }
        }
        this.onCommand = false;
        this.AudioAttributesCompatParcelizer = null;
        _fromClass _fromclass = this.write;
        if (_fromclass != null) {
            _fromVariable.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = new _fromVariable.AudioAttributesCompatParcelizer(_fromclass, this.onMediaButtonEvent, Math.max(0L, j5), _putVar.RemoteActionCompatParcelizer, CmcdHeadersFactory.STREAMING_FORMAT_HLS, !_acceptjsonformatvisitor.RemoteActionCompatParcelizer, _putVar.write(this.AudioAttributesImplBaseParcelizer), list.isEmpty());
            if (AudioAttributesImplApi21Parcelizer()) {
                str = CmcdHeadersFactory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO;
            } else {
                str = _fromVariable.AudioAttributesCompatParcelizer.read(this.onMediaButtonEvent);
            }
            audioAttributesCompatParcelizerRemoteActionCompatParcelizer = audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer(str);
            if (iconCompatParcelizerRemoteActionCompatParcelizer.read == -1) {
                j2 = iconCompatParcelizerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer + 1;
            } else {
                j2 = iconCompatParcelizerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            }
            IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(_acceptjsonformatvisitor, j2, iconCompatParcelizerRemoteActionCompatParcelizer.read == -1 ? -1 : iconCompatParcelizerRemoteActionCompatParcelizer.read + 1);
            if (iconCompatParcelizerRemoteActionCompatParcelizer2 != null) {
                audioAttributesCompatParcelizerRemoteActionCompatParcelizer.read(_idFrom.write(_idFrom.read(_acceptjsonformatvisitor.handleMediaPlayPauseIfPendingOnHandler, iconCompatParcelizerRemoteActionCompatParcelizer.write.MediaDescriptionCompat), _idFrom.read(_acceptjsonformatvisitor.handleMediaPlayPauseIfPendingOnHandler, iconCompatParcelizerRemoteActionCompatParcelizer2.write.MediaDescriptionCompat)));
                StringBuilder sb = new StringBuilder();
                sb.append(iconCompatParcelizerRemoteActionCompatParcelizer2.write.IconCompatParcelizer);
                sb.append("-");
                String string = sb.toString();
                if (iconCompatParcelizerRemoteActionCompatParcelizer2.write.write != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append(iconCompatParcelizerRemoteActionCompatParcelizer2.write.IconCompatParcelizer + iconCompatParcelizerRemoteActionCompatParcelizer2.write.write);
                    string = sb2.toString();
                }
                audioAttributesCompatParcelizerRemoteActionCompatParcelizer.write(string);
            }
        } else {
            audioAttributesCompatParcelizerRemoteActionCompatParcelizer = null;
        }
        this.AudioAttributesImplBaseParcelizer = SystemClock.elapsedRealtime();
        Uri uriWrite = write(_acceptjsonformatvisitor, iconCompatParcelizerRemoteActionCompatParcelizer.write.MediaBrowserCompatSearchResultReceiver);
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer = read(uriWrite, i, true, audioAttributesCompatParcelizerRemoteActionCompatParcelizer);
        if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer == null) {
            Uri uriWrite2 = write(_acceptjsonformatvisitor, iconCompatParcelizerRemoteActionCompatParcelizer.write);
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer = read(uriWrite2, i, false, audioAttributesCompatParcelizerRemoteActionCompatParcelizer);
            if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer == null) {
                boolean zIconCompatParcelizer = _isValuePresent.IconCompatParcelizer(_isvaluepresent, uri, _acceptjsonformatvisitor, iconCompatParcelizerRemoteActionCompatParcelizer, jWrite);
                if (zIconCompatParcelizer && iconCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer) {
                    return;
                }
                audioAttributesCompatParcelizer.RemoteActionCompatParcelizer = _isValuePresent.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem[i], jWrite, _acceptjsonformatvisitor, iconCompatParcelizerRemoteActionCompatParcelizer, uri, this.MediaDescriptionCompat, this.onMediaButtonEvent.write(), this.onMediaButtonEvent.AudioAttributesCompatParcelizer(), this.MediaBrowserCompatItemReceiver, this.onAddQueueItem, this.handleMediaPlayPauseIfPendingOnHandler, _isvaluepresent, this.AudioAttributesImplApi26Parcelizer.write(uriWrite2), this.AudioAttributesImplApi26Parcelizer.write(uriWrite), zIconCompatParcelizer, this.RatingCompat, audioAttributesCompatParcelizerRemoteActionCompatParcelizer);
            }
        }
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        C0170format c0170formatAudioAttributesCompatParcelizer = this.onFastForward.AudioAttributesCompatParcelizer(this.onMediaButtonEvent.read());
        return (DefaultBaseTypeLimitingValidator.RemoteActionCompatParcelizer(c0170formatAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer) == null || DefaultBaseTypeLimitingValidator.read(c0170formatAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer) == null) ? false : true;
    }

    private static IconCompatParcelizer RemoteActionCompatParcelizer(_acceptJsonFormatVisitor _acceptjsonformatvisitor, long j, int i) {
        int i2 = (int) (j - _acceptjsonformatvisitor.AudioAttributesImplBaseParcelizer);
        if (i2 == _acceptjsonformatvisitor.MediaDescriptionCompat.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < _acceptjsonformatvisitor.onAddQueueItem.size()) {
                return new IconCompatParcelizer(_acceptjsonformatvisitor.onAddQueueItem.get(i), j, i);
            }
            return null;
        }
        _acceptJsonFormatVisitor.write writeVar = _acceptjsonformatvisitor.MediaDescriptionCompat.get(i2);
        if (i == -1) {
            return new IconCompatParcelizer(writeVar, j, -1);
        }
        if (i < writeVar.RemoteActionCompatParcelizer.size()) {
            return new IconCompatParcelizer(writeVar.RemoteActionCompatParcelizer.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < _acceptjsonformatvisitor.MediaDescriptionCompat.size()) {
            return new IconCompatParcelizer(_acceptjsonformatvisitor.MediaDescriptionCompat.get(i3), j + 1, -1);
        }
        if (_acceptjsonformatvisitor.onAddQueueItem.isEmpty()) {
            return null;
        }
        return new IconCompatParcelizer(_acceptjsonformatvisitor.onAddQueueItem.get(0), j + 1, 0);
    }

    public final void write(CollectionLikeType collectionLikeType) {
        if (collectionLikeType instanceof write) {
            write writeVar = (write) collectionLikeType;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = writeVar.RemoteActionCompatParcelizer();
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(writeVar.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer, (byte[]) buildTypeSerializer.IconCompatParcelizer(writeVar.IconCompatParcelizer()));
        }
    }

    public final boolean write(CollectionLikeType collectionLikeType, long j) {
        _verifyAndResolvePlaceholders _verifyandresolveplaceholders = this.onMediaButtonEvent;
        return _verifyandresolveplaceholders.RemoteActionCompatParcelizer(_verifyandresolveplaceholders.RemoteActionCompatParcelizer(this.onFastForward.read(collectionLikeType.MediaDescriptionCompat)), j);
    }

    public final boolean write(Uri uri, long j) {
        int iRemoteActionCompatParcelizer;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.onCustomAction;
            if (i >= uriArr.length) {
                i = -1;
                break;
            }
            if (uriArr[i].equals(uri)) {
                break;
            }
            i++;
        }
        if (i == -1 || (iRemoteActionCompatParcelizer = this.onMediaButtonEvent.RemoteActionCompatParcelizer(i)) == -1) {
            return true;
        }
        this.onCommand |= uri.equals(this.AudioAttributesCompatParcelizer);
        return j == C.TIME_UNSET || (this.onMediaButtonEvent.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, j) && this.MediaBrowserCompatSearchResultReceiver.write(uri, j));
    }

    public final ResolvedRecursiveType[] write(_isValuePresent _isvaluepresent, long j) {
        int i;
        int i2 = _isvaluepresent == null ? -1 : this.onFastForward.read(_isvaluepresent.MediaDescriptionCompat);
        int iMediaBrowserCompatCustomActionResultReceiver = this.onMediaButtonEvent.MediaBrowserCompatCustomActionResultReceiver();
        ResolvedRecursiveType[] resolvedRecursiveTypeArr = new ResolvedRecursiveType[iMediaBrowserCompatCustomActionResultReceiver];
        boolean z = false;
        int i3 = 0;
        while (i3 < iMediaBrowserCompatCustomActionResultReceiver) {
            int iIconCompatParcelizer = this.onMediaButtonEvent.IconCompatParcelizer(i3);
            Uri uri = this.onCustomAction[iIconCompatParcelizer];
            if (!this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(uri)) {
                resolvedRecursiveTypeArr[i3] = ResolvedRecursiveType.AudioAttributesCompatParcelizer;
                i = i3;
            } else {
                _acceptJsonFormatVisitor _acceptjsonformatvisitorIconCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(uri, z);
                long jWrite = _acceptjsonformatvisitorIconCompatParcelizer.onCommand - this.MediaBrowserCompatSearchResultReceiver.write();
                i = i3;
                Pair<Long, Integer> pair = read(_isvaluepresent, iIconCompatParcelizer != i2 ? true : z, _acceptjsonformatvisitorIconCompatParcelizer, jWrite, j);
                resolvedRecursiveTypeArr[i] = new read(_acceptjsonformatvisitorIconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler, jWrite, read(_acceptjsonformatvisitorIconCompatParcelizer, ((Long) pair.first).longValue(), ((Integer) pair.second).intValue()));
            }
            i3 = i + 1;
            z = false;
        }
        return resolvedRecursiveTypeArr;
    }

    public final int write(long j, List<? extends getSelfReferencedType> list) {
        if (this.read != null || this.onMediaButtonEvent.MediaBrowserCompatCustomActionResultReceiver() < 2) {
            return list.size();
        }
        return this.onMediaButtonEvent.AudioAttributesCompatParcelizer(j, list);
    }

    public final boolean write(long j, CollectionLikeType collectionLikeType, List<? extends getSelfReferencedType> list) {
        if (this.read != null) {
            return false;
        }
        return this.onMediaButtonEvent.AudioAttributesCompatParcelizer(j, collectionLikeType, list);
    }

    private static List<_acceptJsonFormatVisitor.RemoteActionCompatParcelizer> read(_acceptJsonFormatVisitor _acceptjsonformatvisitor, long j, int i) {
        int i2 = (int) (j - _acceptjsonformatvisitor.AudioAttributesImplBaseParcelizer);
        if (i2 < 0 || _acceptjsonformatvisitor.MediaDescriptionCompat.size() < i2) {
            return initExtraTracks.AudioAttributesImplApi26Parcelizer();
        }
        ArrayList arrayList = new ArrayList();
        if (i2 < _acceptjsonformatvisitor.MediaDescriptionCompat.size()) {
            if (i != -1) {
                _acceptJsonFormatVisitor.write writeVar = _acceptjsonformatvisitor.MediaDescriptionCompat.get(i2);
                if (i == 0) {
                    arrayList.add(writeVar);
                } else if (i < writeVar.RemoteActionCompatParcelizer.size()) {
                    List<_acceptJsonFormatVisitor.read> list = writeVar.RemoteActionCompatParcelizer;
                    arrayList.addAll(list.subList(i, list.size()));
                }
                i2++;
            }
            arrayList.addAll(_acceptjsonformatvisitor.MediaDescriptionCompat.subList(i2, _acceptjsonformatvisitor.MediaDescriptionCompat.size()));
            i = 0;
        }
        if (_acceptjsonformatvisitor.AudioAttributesImplApi21Parcelizer != C.TIME_UNSET) {
            int i3 = i != -1 ? i : 0;
            if (i3 < _acceptjsonformatvisitor.onAddQueueItem.size()) {
                arrayList.addAll(_acceptjsonformatvisitor.onAddQueueItem.subList(i3, _acceptjsonformatvisitor.onAddQueueItem.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean IconCompatParcelizer(Uri uri) {
        return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.onCustomAction, uri);
    }

    private Pair<Long, Integer> read(_isValuePresent _isvaluepresent, boolean z, _acceptJsonFormatVisitor _acceptjsonformatvisitor, long j, long j2) {
        List<_acceptJsonFormatVisitor.read> list;
        long jC_;
        boolean z2 = true;
        if (_isvaluepresent == null || z) {
            long j3 = _acceptjsonformatvisitor.AudioAttributesCompatParcelizer;
            if (_isvaluepresent != null && !this.MediaBrowserCompatCustomActionResultReceiver) {
                j2 = _isvaluepresent.MediaBrowserCompatItemReceiver;
            }
            if (!_acceptjsonformatvisitor.RemoteActionCompatParcelizer && j2 >= j3 + j) {
                return new Pair<>(Long.valueOf(_acceptjsonformatvisitor.AudioAttributesImplBaseParcelizer + ((long) _acceptjsonformatvisitor.MediaDescriptionCompat.size())), -1);
            }
            long j4 = j2 - j;
            List<_acceptJsonFormatVisitor.write> list2 = _acceptjsonformatvisitor.MediaDescriptionCompat;
            int i = 0;
            if (this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer() && _isvaluepresent != null) {
                z2 = false;
            }
            int iAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(list2, Long.valueOf(j4), z2);
            long j5 = ((long) iAudioAttributesCompatParcelizer) + _acceptjsonformatvisitor.AudioAttributesImplBaseParcelizer;
            if (iAudioAttributesCompatParcelizer >= 0) {
                _acceptJsonFormatVisitor.write writeVar = _acceptjsonformatvisitor.MediaDescriptionCompat.get(iAudioAttributesCompatParcelizer);
                if (j4 < writeVar.MediaBrowserCompatMediaItem + writeVar.AudioAttributesImplApi21Parcelizer) {
                    list = writeVar.RemoteActionCompatParcelizer;
                } else {
                    list = _acceptjsonformatvisitor.onAddQueueItem;
                }
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    _acceptJsonFormatVisitor.read readVar = list.get(i);
                    if (j4 >= readVar.MediaBrowserCompatMediaItem + readVar.AudioAttributesImplApi21Parcelizer) {
                        i++;
                    } else if (readVar.RemoteActionCompatParcelizer) {
                        j5 += list == _acceptjsonformatvisitor.onAddQueueItem ? 1L : 0L;
                        i = i;
                    }
                }
            }
            return new Pair<>(Long.valueOf(j5), Integer.valueOf(i));
        }
        if (_isvaluepresent.write()) {
            if (_isvaluepresent.RemoteActionCompatParcelizer == -1) {
                jC_ = _isvaluepresent.C_();
            } else {
                jC_ = _isvaluepresent.MediaBrowserCompatMediaItem;
            }
            return new Pair<>(Long.valueOf(jC_), Integer.valueOf(_isvaluepresent.RemoteActionCompatParcelizer != -1 ? _isvaluepresent.RemoteActionCompatParcelizer + 1 : -1));
        }
        return new Pair<>(Long.valueOf(_isvaluepresent.MediaBrowserCompatMediaItem), Integer.valueOf(_isvaluepresent.RemoteActionCompatParcelizer));
    }

    private long IconCompatParcelizer(long j) {
        long j2 = this.AudioAttributesImplApi21Parcelizer;
        return j2 != C.TIME_UNSET ? j2 - j : C.TIME_UNSET;
    }

    private void read(_acceptJsonFormatVisitor _acceptjsonformatvisitor) {
        this.AudioAttributesImplApi21Parcelizer = _acceptjsonformatvisitor.RemoteActionCompatParcelizer ? C.TIME_UNSET : _acceptjsonformatvisitor.IconCompatParcelizer() - this.MediaBrowserCompatSearchResultReceiver.write();
    }

    private CollectionLikeType read(Uri uri, int i, boolean z, _fromVariable.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (uri == null) {
            return null;
        }
        byte[] bArrRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(uri);
        if (bArrRemoteActionCompatParcelizer != null) {
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(uri, bArrRemoteActionCompatParcelizer);
            return null;
        }
        SubTypeValidator subTypeValidatorWrite = new SubTypeValidator.write().IconCompatParcelizer(uri).read(1).write();
        if (audioAttributesCompatParcelizer != null) {
            if (z) {
                audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT);
            }
            subTypeValidatorWrite = audioAttributesCompatParcelizer.IconCompatParcelizer().read(subTypeValidatorWrite);
        }
        return new write(this.IconCompatParcelizer, subTypeValidatorWrite, this.MediaBrowserCompatMediaItem[i], this.onMediaButtonEvent.write(), this.onMediaButtonEvent.AudioAttributesCompatParcelizer(), this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    private static Uri write(_acceptJsonFormatVisitor _acceptjsonformatvisitor, _acceptJsonFormatVisitor.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (remoteActionCompatParcelizer == null || remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver == null) {
            return null;
        }
        return _idFrom.read(_acceptjsonformatvisitor.handleMediaPlayPauseIfPendingOnHandler, remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver);
    }

    private void MediaBrowserCompatItemReceiver() {
        this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(this.onCustomAction[this.onMediaButtonEvent.AudioAttributesImplApi21Parcelizer()]);
    }

    static final class IconCompatParcelizer {
        public final long AudioAttributesCompatParcelizer;
        public final boolean IconCompatParcelizer;
        public final int read;
        public final _acceptJsonFormatVisitor.RemoteActionCompatParcelizer write;

        public IconCompatParcelizer(_acceptJsonFormatVisitor.RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, int i) {
            this.write = remoteActionCompatParcelizer;
            this.AudioAttributesCompatParcelizer = j;
            this.read = i;
            this.IconCompatParcelizer = (remoteActionCompatParcelizer instanceof _acceptJsonFormatVisitor.read) && ((_acceptJsonFormatVisitor.read) remoteActionCompatParcelizer).read;
        }
    }

    static final class RemoteActionCompatParcelizer extends emptyBindings {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin._verifyAndResolvePlaceholders
        public final Object AudioAttributesCompatParcelizer() {
            return null;
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final int write() {
            return 0;
        }

        public RemoteActionCompatParcelizer(setName setname, int[] iArr) {
            super(setname, iArr);
            this.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(setname.AudioAttributesCompatParcelizer(iArr[0]));
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final void RemoteActionCompatParcelizer(long j, long j2, long j3, List<? extends getSelfReferencedType> list, ResolvedRecursiveType[] resolvedRecursiveTypeArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (write(this.RemoteActionCompatParcelizer, jElapsedRealtime)) {
                for (int i = this.AudioAttributesCompatParcelizer - 1; i >= 0; i--) {
                    if (!write(i, jElapsedRealtime)) {
                        this.RemoteActionCompatParcelizer = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final int read() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    static final class write extends MapType {
        private byte[] write;

        public write(_hasTypeResolver _hastyperesolver, SubTypeValidator subTypeValidator, C0170format c0170format, int i, Object obj, byte[] bArr) {
            super(_hastyperesolver, subTypeValidator, c0170format, i, obj, bArr);
        }

        @Override // kotlin.MapType
        public final void read(byte[] bArr, int i) {
            this.write = Arrays.copyOf(bArr, i);
        }

        public final byte[] IconCompatParcelizer() {
            return this.write;
        }
    }

    static final class read extends buildCanonicalName {
        private final List<_acceptJsonFormatVisitor.RemoteActionCompatParcelizer> IconCompatParcelizer;
        private final long read;
        private final String write;

        public read(String str, long j, List<_acceptJsonFormatVisitor.RemoteActionCompatParcelizer> list) {
            super(0L, list.size() - 1);
            this.write = str;
            this.read = j;
            this.IconCompatParcelizer = list;
        }

        @Override // kotlin.ResolvedRecursiveType
        public final long RemoteActionCompatParcelizer() {
            write();
            return this.read + this.IconCompatParcelizer.get((int) IconCompatParcelizer()).MediaBrowserCompatMediaItem;
        }

        @Override // kotlin.ResolvedRecursiveType
        public final long AudioAttributesCompatParcelizer() {
            write();
            _acceptJsonFormatVisitor.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.get((int) IconCompatParcelizer());
            return this.read + remoteActionCompatParcelizer.MediaBrowserCompatMediaItem + remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        }
    }
}
