package kotlin;

import android.os.Parcel;
import android.util.Base64;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010\u0013J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010\u0018J\u0011\u0010)\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020%H\u0002¢\u0006\u0004\b+\u0010\u0013R\u0014\u0010\u0015\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-"}, d2 = {"Lo/setSystemUiVisibility;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "Lo/_findPropertyUnwrapper;", "read", "()Lo/_findPropertyUnwrapper;", "Lo/switchToNext;", "IconCompatParcelizer", "()J", "Lo/ReadableObjectIdReferring;", "AudioAttributesImplApi21Parcelizer", "Lo/getDataStream;", "write", "()Lo/getDataStream;", "Lo/withValueDeserializer;", "AudioAttributesCompatParcelizer", "()I", "Lo/_findFormat;", "RemoteActionCompatParcelizer", "Lo/_find2ViaAlias;", "AudioAttributesImplBaseParcelizer", "()F", "Lo/CreatorCandidate;", "MediaBrowserCompatSearchResultReceiver", "()Lo/CreatorCandidate;", "Lo/renameAll;", "MediaBrowserCompatMediaItem", "()Lo/renameAll;", "Lo/nopInstance;", "MediaMetadataCompat", "()Lo/nopInstance;", "", "AudioAttributesImplApi26Parcelizer", "()B", "", "RatingCompat", "", "MediaBrowserCompatItemReceiver", "MediaDescriptionCompat", "()Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "Landroid/os/Parcel;", "Landroid/os/Parcel;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setSystemUiVisibility {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Parcel RemoteActionCompatParcelizer;

    public setSystemUiVisibility(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.RemoteActionCompatParcelizer = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    public final _findPropertyUnwrapper read() {
        getVisibleInsets getvisibleinsets;
        getVisibleInsets getvisibleinsets2 = getvisibleinsets;
        getVisibleInsets getvisibleinsets3 = new getVisibleInsets(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.RemoteActionCompatParcelizer.dataAvail() > 1) {
            byte bAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            if (bAudioAttributesImplApi26Parcelizer != 1) {
                getvisibleinsets = getvisibleinsets2;
                if (bAudioAttributesImplApi26Parcelizer == 2) {
                    if (MediaBrowserCompatCustomActionResultReceiver() < 5) {
                        break;
                    }
                    getvisibleinsets.write(AudioAttributesImplApi21Parcelizer());
                    getvisibleinsets2 = getvisibleinsets;
                } else if (bAudioAttributesImplApi26Parcelizer == 3) {
                    if (MediaBrowserCompatCustomActionResultReceiver() < 4) {
                        break;
                    }
                    getvisibleinsets.read(write());
                    getvisibleinsets2 = getvisibleinsets;
                } else if (bAudioAttributesImplApi26Parcelizer == 4) {
                    if (MediaBrowserCompatCustomActionResultReceiver() <= 0) {
                        break;
                    }
                    getvisibleinsets.read(withValueDeserializer.IconCompatParcelizer(AudioAttributesCompatParcelizer()));
                    getvisibleinsets2 = getvisibleinsets;
                } else if (bAudioAttributesImplApi26Parcelizer != 5) {
                    if (bAudioAttributesImplApi26Parcelizer != 6) {
                        if (bAudioAttributesImplApi26Parcelizer != 7) {
                            if (bAudioAttributesImplApi26Parcelizer != 8) {
                                if (bAudioAttributesImplApi26Parcelizer != 9) {
                                    if (bAudioAttributesImplApi26Parcelizer != 10) {
                                        if (bAudioAttributesImplApi26Parcelizer != 11) {
                                            if (bAudioAttributesImplApi26Parcelizer == 12) {
                                                if (MediaBrowserCompatCustomActionResultReceiver() < 20) {
                                                    break;
                                                }
                                                getvisibleinsets.read(MediaMetadataCompat());
                                            }
                                        } else {
                                            if (MediaBrowserCompatCustomActionResultReceiver() < 4) {
                                                break;
                                            }
                                            getvisibleinsets.read(MediaBrowserCompatMediaItem());
                                        }
                                    } else {
                                        if (MediaBrowserCompatCustomActionResultReceiver() < 8) {
                                            break;
                                        }
                                        getvisibleinsets.AudioAttributesCompatParcelizer(IconCompatParcelizer());
                                    }
                                } else {
                                    if (MediaBrowserCompatCustomActionResultReceiver() < 8) {
                                        break;
                                    }
                                    getvisibleinsets.read(MediaBrowserCompatSearchResultReceiver());
                                }
                            } else {
                                if (MediaBrowserCompatCustomActionResultReceiver() < 4) {
                                    break;
                                }
                                getvisibleinsets.AudioAttributesCompatParcelizer(_find2ViaAlias.read(AudioAttributesImplBaseParcelizer()));
                            }
                        } else {
                            if (MediaBrowserCompatCustomActionResultReceiver() < 5) {
                                break;
                            }
                            getvisibleinsets.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer());
                        }
                    } else {
                        getvisibleinsets.write(MediaDescriptionCompat());
                    }
                    getvisibleinsets2 = getvisibleinsets;
                } else {
                    if (MediaBrowserCompatCustomActionResultReceiver() <= 0) {
                        break;
                    }
                    getvisibleinsets.IconCompatParcelizer(_findFormat.write(RemoteActionCompatParcelizer()));
                    getvisibleinsets2 = getvisibleinsets;
                }
            } else {
                if (MediaBrowserCompatCustomActionResultReceiver() < 8) {
                    break;
                }
                getvisibleinsets2.IconCompatParcelizer(IconCompatParcelizer());
            }
        }
        getvisibleinsets = getvisibleinsets2;
        return getvisibleinsets.IconCompatParcelizer();
    }

    public final long IconCompatParcelizer() {
        return BufferRecyclers.AudioAttributesCompatParcelizer(switchToNext.INSTANCE, this.RemoteActionCompatParcelizer.readLong());
    }

    public final long AudioAttributesImplApi21Parcelizer() {
        long jIconCompatParcelizer;
        byte bAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (bAudioAttributesImplApi26Parcelizer == 1) {
            jIconCompatParcelizer = processUnwrapped.INSTANCE.read();
        } else if (bAudioAttributesImplApi26Parcelizer == 2) {
            jIconCompatParcelizer = processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer();
        } else {
            jIconCompatParcelizer = processUnwrapped.INSTANCE.IconCompatParcelizer();
        }
        if (processUnwrapped.read(jIconCompatParcelizer, processUnwrapped.INSTANCE.IconCompatParcelizer())) {
            return ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer();
        }
        return setResolver.IconCompatParcelizer(MediaBrowserCompatItemReceiver(), jIconCompatParcelizer);
    }

    public final getDataStream write() {
        return new getDataStream(RatingCompat());
    }

    public final int AudioAttributesCompatParcelizer() {
        byte bAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (bAudioAttributesImplApi26Parcelizer == 0) {
            return withValueDeserializer.INSTANCE.IconCompatParcelizer();
        }
        if (bAudioAttributesImplApi26Parcelizer == 1) {
            return withValueDeserializer.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return withValueDeserializer.INSTANCE.IconCompatParcelizer();
    }

    public final int RemoteActionCompatParcelizer() {
        byte bAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (bAudioAttributesImplApi26Parcelizer == 0) {
            return _findFormat.INSTANCE.IconCompatParcelizer();
        }
        if (bAudioAttributesImplApi26Parcelizer == 1) {
            return _findFormat.INSTANCE.RemoteActionCompatParcelizer();
        }
        if (bAudioAttributesImplApi26Parcelizer == 3) {
            return _findFormat.INSTANCE.write();
        }
        if (bAudioAttributesImplApi26Parcelizer == 2) {
            return _findFormat.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return _findFormat.INSTANCE.IconCompatParcelizer();
    }

    private final float AudioAttributesImplBaseParcelizer() {
        return _find2ViaAlias.RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver());
    }

    private final CreatorCandidate MediaBrowserCompatSearchResultReceiver() {
        return new CreatorCandidate(MediaBrowserCompatItemReceiver(), MediaBrowserCompatItemReceiver());
    }

    private final renameAll MediaBrowserCompatMediaItem() {
        int iRatingCompat = RatingCompat();
        boolean z = (renameAll.INSTANCE.RemoteActionCompatParcelizer().write() & iRatingCompat) != 0;
        boolean z2 = (iRatingCompat & renameAll.INSTANCE.AudioAttributesCompatParcelizer().write()) != 0;
        if (z && z2) {
            return renameAll.INSTANCE.IconCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new renameAll[]{renameAll.INSTANCE.RemoteActionCompatParcelizer(), renameAll.INSTANCE.AudioAttributesCompatParcelizer()}));
        }
        if (z) {
            return renameAll.INSTANCE.RemoteActionCompatParcelizer();
        }
        if (z2) {
            return renameAll.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return renameAll.INSTANCE.write();
    }

    private final nopInstance MediaMetadataCompat() {
        long jIconCompatParcelizer = IconCompatParcelizer();
        float fMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        float fMediaBrowserCompatItemReceiver2 = MediaBrowserCompatItemReceiver();
        long j = -1;
        return new nopInstance(jIconCompatParcelizer, getReferencedType.AudioAttributesCompatParcelizer((Float.floatToRawIntBits(fMediaBrowserCompatItemReceiver) << 32) | (((long) Float.floatToRawIntBits(fMediaBrowserCompatItemReceiver2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))), MediaBrowserCompatItemReceiver(), null);
    }

    private final byte AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer.readByte();
    }

    private final int RatingCompat() {
        return this.RemoteActionCompatParcelizer.readInt();
    }

    private final float MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer.readFloat();
    }

    private final String MediaDescriptionCompat() {
        return this.RemoteActionCompatParcelizer.readString();
    }

    private final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.RemoteActionCompatParcelizer.dataAvail();
    }
}
