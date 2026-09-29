package kotlin;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;
import kotlin.postKeyRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class createSessionCreationData extends DrmInitData1 {
    private postKeyRequest AudioAttributesCompatParcelizer;
    private Paint IconCompatParcelizer;
    private Path MediaBrowserCompatItemReceiver;
    private Paint RemoteActionCompatParcelizer;
    private Paint.FontMetrics read;
    private List<getSchemeUuid> write;

    public createSessionCreationData(lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, postKeyRequest postkeyrequest) {
        super(lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        this.write = new ArrayList(16);
        this.read = new Paint.FontMetrics();
        this.MediaBrowserCompatItemReceiver = new Path();
        this.AudioAttributesCompatParcelizer = postkeyrequest;
        Paint paint = new Paint(1);
        this.RemoteActionCompatParcelizer = paint;
        paint.setTextSize(drmSessionAcquired.write(9.0f));
        this.RemoteActionCompatParcelizer.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.IconCompatParcelizer = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    public final Paint AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void IconCompatParcelizer(kotlin.requiresSecureDecoder<?> r19) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createSessionCreationData.IconCompatParcelizer(o.requiresSecureDecoder):void");
    }

    public final void IconCompatParcelizer(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        List<Boolean> list;
        float f7;
        List<DrmSessionEventListener> list2;
        Canvas canvas2;
        int i;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float fAudioAttributesImplApi21Parcelizer;
        float f14;
        float f15;
        postKeyRequest.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        getSchemeUuid getschemeuuid;
        float f16;
        float fMediaDescriptionCompat;
        float fMediaBrowserCompatCustomActionResultReceiver;
        float fAudioAttributesImplBaseParcelizer;
        double d;
        if (this.AudioAttributesCompatParcelizer.onPlayFromSearch()) {
            Typeface typefaceOnPrepareFromSearch = this.AudioAttributesCompatParcelizer.onPrepareFromSearch();
            if (typefaceOnPrepareFromSearch != null) {
                this.RemoteActionCompatParcelizer.setTypeface(typefaceOnPrepareFromSearch);
            }
            this.RemoteActionCompatParcelizer.setTextSize(this.AudioAttributesCompatParcelizer.onPrepareFromMediaId());
            this.RemoteActionCompatParcelizer.setColor(this.AudioAttributesCompatParcelizer.onFastForward());
            float f17 = drmSessionAcquired.read(this.RemoteActionCompatParcelizer, this.read);
            float fAudioAttributesCompatParcelizer = drmSessionAcquired.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.read) + drmSessionAcquired.write(this.AudioAttributesCompatParcelizer.onAddQueueItem());
            float fAudioAttributesCompatParcelizer2 = f17 - (drmSessionAcquired.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, "ABC") / 2.0f);
            getSchemeUuid[] getschemeuuidArrIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            float fWrite = drmSessionAcquired.write(this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem());
            float fWrite2 = drmSessionAcquired.write(this.AudioAttributesCompatParcelizer.onCommand());
            postKeyRequest.IconCompatParcelizer iconCompatParcelizerMediaMetadataCompat = this.AudioAttributesCompatParcelizer.MediaMetadataCompat();
            postKeyRequest.read readVarMediaBrowserCompatSearchResultReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
            postKeyRequest.write writeVarHandleMediaPlayPauseIfPendingOnHandler = this.AudioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler();
            postKeyRequest.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = this.AudioAttributesCompatParcelizer.read();
            float fWrite3 = drmSessionAcquired.write(this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver());
            float fWrite4 = drmSessionAcquired.write(this.AudioAttributesCompatParcelizer.RatingCompat());
            float fOnPrepare = this.AudioAttributesCompatParcelizer.onPrepare();
            float fOnPlayFromUri = this.AudioAttributesCompatParcelizer.onPlayFromUri();
            int i2 = AnonymousClass3.AudioAttributesCompatParcelizer[readVarMediaBrowserCompatSearchResultReceiver.ordinal()];
            float f18 = fWrite4;
            float f19 = fWrite2;
            if (i2 != 1) {
                if (i2 == 2) {
                    f = f17;
                    f2 = fAudioAttributesCompatParcelizer;
                    if (iconCompatParcelizerMediaMetadataCompat == postKeyRequest.IconCompatParcelizer.VERTICAL) {
                        fMediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatMediaItem();
                    } else {
                        fMediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
                    }
                    f4 = fMediaBrowserCompatCustomActionResultReceiver - fOnPlayFromUri;
                    if (audioAttributesCompatParcelizer2 == postKeyRequest.AudioAttributesCompatParcelizer.LEFT_TO_RIGHT) {
                        f4 -= this.AudioAttributesCompatParcelizer.read;
                    }
                } else if (i2 != 3) {
                    f = f17;
                    f2 = fAudioAttributesCompatParcelizer;
                    f3 = 0.0f;
                } else {
                    if (iconCompatParcelizerMediaMetadataCompat == postKeyRequest.IconCompatParcelizer.VERTICAL) {
                        fAudioAttributesImplBaseParcelizer = this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatMediaItem() / 2.0f;
                    } else {
                        fAudioAttributesImplBaseParcelizer = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer() + (this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatItemReceiver() / 2.0f);
                    }
                    f4 = fAudioAttributesImplBaseParcelizer + (audioAttributesCompatParcelizer2 == postKeyRequest.AudioAttributesCompatParcelizer.LEFT_TO_RIGHT ? fOnPlayFromUri : -fOnPlayFromUri);
                    if (iconCompatParcelizerMediaMetadataCompat == postKeyRequest.IconCompatParcelizer.VERTICAL) {
                        f2 = fAudioAttributesCompatParcelizer;
                        double d2 = f4;
                        if (audioAttributesCompatParcelizer2 == postKeyRequest.AudioAttributesCompatParcelizer.LEFT_TO_RIGHT) {
                            f = f17;
                            d = (((double) (-this.AudioAttributesCompatParcelizer.read)) / 2.0d) + ((double) fOnPlayFromUri);
                        } else {
                            f = f17;
                            d = (((double) this.AudioAttributesCompatParcelizer.read) / 2.0d) - ((double) fOnPlayFromUri);
                        }
                        f4 = (float) (d2 + d);
                    } else {
                        f = f17;
                        f2 = fAudioAttributesCompatParcelizer;
                    }
                }
                f3 = f4;
            } else {
                f = f17;
                f2 = fAudioAttributesCompatParcelizer;
                if (iconCompatParcelizerMediaMetadataCompat != postKeyRequest.IconCompatParcelizer.VERTICAL) {
                    fOnPlayFromUri += this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer();
                }
                if (audioAttributesCompatParcelizer2 == postKeyRequest.AudioAttributesCompatParcelizer.RIGHT_TO_LEFT) {
                    f4 = this.AudioAttributesCompatParcelizer.read + fOnPlayFromUri;
                    f3 = f4;
                } else {
                    f3 = fOnPlayFromUri;
                }
            }
            int i3 = AnonymousClass3.read[iconCompatParcelizerMediaMetadataCompat.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = AnonymousClass3.IconCompatParcelizer[writeVarHandleMediaPlayPauseIfPendingOnHandler.ordinal()];
                    if (i4 == 1) {
                        fAudioAttributesImplApi21Parcelizer = (readVarMediaBrowserCompatSearchResultReceiver == postKeyRequest.read.CENTER ? 0.0f : this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer()) + fOnPrepare;
                    } else if (i4 == 2) {
                        if (readVarMediaBrowserCompatSearchResultReceiver == postKeyRequest.read.CENTER) {
                            fMediaDescriptionCompat = this.MediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat();
                        } else {
                            fMediaDescriptionCompat = this.MediaBrowserCompatSearchResultReceiver.read();
                        }
                        fAudioAttributesImplApi21Parcelizer = fMediaDescriptionCompat - (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer + fOnPrepare);
                    } else {
                        fAudioAttributesImplApi21Parcelizer = i4 != 3 ? 0.0f : ((this.MediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat() / 2.0f) - (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer / 2.0f)) + this.AudioAttributesCompatParcelizer.onPrepare();
                    }
                    float f20 = fAudioAttributesImplApi21Parcelizer;
                    float f21 = 0.0f;
                    boolean z = false;
                    int i5 = 0;
                    while (i5 < getschemeuuidArrIconCompatParcelizer.length) {
                        getSchemeUuid getschemeuuid2 = getschemeuuidArrIconCompatParcelizer[i5];
                        boolean z2 = getschemeuuid2.AudioAttributesCompatParcelizer != postKeyRequest.RemoteActionCompatParcelizer.NONE;
                        float fWrite5 = Float.isNaN(getschemeuuid2.IconCompatParcelizer) ? fWrite3 : drmSessionAcquired.write(getschemeuuid2.IconCompatParcelizer);
                        if (z2) {
                            f16 = audioAttributesCompatParcelizer2 == postKeyRequest.AudioAttributesCompatParcelizer.LEFT_TO_RIGHT ? f3 + f21 : f3 - (fWrite5 - f21);
                            f15 = f18;
                            f14 = fAudioAttributesCompatParcelizer2;
                            audioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
                            AudioAttributesCompatParcelizer(canvas, f16, f20 + fAudioAttributesCompatParcelizer2, getschemeuuid2, this.AudioAttributesCompatParcelizer);
                            if (audioAttributesCompatParcelizer == postKeyRequest.AudioAttributesCompatParcelizer.LEFT_TO_RIGHT) {
                                f16 += fWrite5;
                            }
                            getschemeuuid = getschemeuuid2;
                        } else {
                            f14 = fAudioAttributesCompatParcelizer2;
                            f15 = f18;
                            audioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
                            getschemeuuid = getschemeuuid2;
                            f16 = f3;
                        }
                        if (getschemeuuid.AudioAttributesImplApi26Parcelizer != null) {
                            if (z2 && !z) {
                                f16 += audioAttributesCompatParcelizer == postKeyRequest.AudioAttributesCompatParcelizer.LEFT_TO_RIGHT ? fWrite : -fWrite;
                            } else if (z) {
                                f16 = f3;
                            }
                            if (audioAttributesCompatParcelizer == postKeyRequest.AudioAttributesCompatParcelizer.RIGHT_TO_LEFT) {
                                f16 -= drmSessionAcquired.read(this.RemoteActionCompatParcelizer, getschemeuuid.AudioAttributesImplApi26Parcelizer);
                            }
                            float f22 = f16;
                            if (!z) {
                                IconCompatParcelizer(canvas, f22, f20 + f, getschemeuuid.AudioAttributesImplApi26Parcelizer);
                            } else {
                                f20 += f + f2;
                                IconCompatParcelizer(canvas, f22, f20 + f, getschemeuuid.AudioAttributesImplApi26Parcelizer);
                            }
                            f20 += f + f2;
                            f21 = 0.0f;
                        } else {
                            f21 += fWrite5 + f15;
                            z = true;
                        }
                        i5++;
                        f18 = f15;
                        audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer;
                        fAudioAttributesCompatParcelizer2 = f14;
                    }
                    return;
                }
                return;
            }
            float f23 = f18;
            List<DrmSessionEventListener> listAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            List<DrmSessionEventListener> listRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            List<Boolean> listWrite = this.AudioAttributesCompatParcelizer.write();
            int i6 = AnonymousClass3.IconCompatParcelizer[writeVarHandleMediaPlayPauseIfPendingOnHandler.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    fOnPrepare = (this.MediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat() - fOnPrepare) - this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
                } else {
                    fOnPrepare = i6 != 3 ? 0.0f : fOnPrepare + ((this.MediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat() - this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer) / 2.0f);
                }
            }
            int length = getschemeuuidArrIconCompatParcelizer.length;
            float f24 = f3;
            int i7 = 0;
            int i8 = 0;
            while (i7 < length) {
                float f25 = f23;
                getSchemeUuid getschemeuuid3 = getschemeuuidArrIconCompatParcelizer[i7];
                int i9 = length;
                boolean z3 = getschemeuuid3.AudioAttributesCompatParcelizer != postKeyRequest.RemoteActionCompatParcelizer.NONE;
                float fWrite6 = Float.isNaN(getschemeuuid3.IconCompatParcelizer) ? fWrite3 : drmSessionAcquired.write(getschemeuuid3.IconCompatParcelizer);
                if (i7 >= listWrite.size() || !listWrite.get(i7).booleanValue()) {
                    f5 = f24;
                    f6 = fOnPrepare;
                } else {
                    f6 = fOnPrepare + f + f2;
                    f5 = f3;
                }
                if (f5 == f3 && readVarMediaBrowserCompatSearchResultReceiver == postKeyRequest.read.CENTER && i8 < listAudioAttributesCompatParcelizer.size()) {
                    if (audioAttributesCompatParcelizer2 == postKeyRequest.AudioAttributesCompatParcelizer.RIGHT_TO_LEFT) {
                        f13 = listAudioAttributesCompatParcelizer.get(i8).RemoteActionCompatParcelizer;
                    } else {
                        f13 = -listAudioAttributesCompatParcelizer.get(i8).RemoteActionCompatParcelizer;
                    }
                    f5 += f13 / 2.0f;
                    i8++;
                }
                int i10 = i8;
                boolean z4 = getschemeuuid3.AudioAttributesImplApi26Parcelizer == null;
                if (z3) {
                    if (audioAttributesCompatParcelizer2 == postKeyRequest.AudioAttributesCompatParcelizer.RIGHT_TO_LEFT) {
                        f5 -= fWrite6;
                    }
                    float f26 = f5;
                    f7 = f3;
                    i = i7;
                    list = listWrite;
                    list2 = listAudioAttributesCompatParcelizer;
                    canvas2 = canvas;
                    AudioAttributesCompatParcelizer(canvas, f26, f6 + fAudioAttributesCompatParcelizer2, getschemeuuid3, this.AudioAttributesCompatParcelizer);
                    f5 = audioAttributesCompatParcelizer2 == postKeyRequest.AudioAttributesCompatParcelizer.LEFT_TO_RIGHT ? f26 + fWrite6 : f26;
                } else {
                    list = listWrite;
                    f7 = f3;
                    list2 = listAudioAttributesCompatParcelizer;
                    canvas2 = canvas;
                    i = i7;
                }
                if (!z4) {
                    if (z3) {
                        f5 += audioAttributesCompatParcelizer2 == postKeyRequest.AudioAttributesCompatParcelizer.RIGHT_TO_LEFT ? -fWrite : fWrite;
                    }
                    if (audioAttributesCompatParcelizer2 == postKeyRequest.AudioAttributesCompatParcelizer.RIGHT_TO_LEFT) {
                        f5 -= listRemoteActionCompatParcelizer.get(i).RemoteActionCompatParcelizer;
                    }
                    IconCompatParcelizer(canvas2, f5, f6 + f, getschemeuuid3.AudioAttributesImplApi26Parcelizer);
                    if (audioAttributesCompatParcelizer2 == postKeyRequest.AudioAttributesCompatParcelizer.LEFT_TO_RIGHT) {
                        f5 += listRemoteActionCompatParcelizer.get(i).RemoteActionCompatParcelizer;
                    }
                    if (audioAttributesCompatParcelizer2 == postKeyRequest.AudioAttributesCompatParcelizer.RIGHT_TO_LEFT) {
                        f8 = f19;
                        f12 = -f8;
                    } else {
                        f8 = f19;
                        f12 = f8;
                    }
                    f11 = f5 + f12;
                    f9 = f25;
                } else {
                    f8 = f19;
                    if (audioAttributesCompatParcelizer2 == postKeyRequest.AudioAttributesCompatParcelizer.RIGHT_TO_LEFT) {
                        f9 = f25;
                        f10 = -f9;
                    } else {
                        f9 = f25;
                        f10 = f9;
                    }
                    f11 = f5 + f10;
                }
                f19 = f8;
                f23 = f9;
                i7 = i + 1;
                fOnPrepare = f6;
                i8 = i10;
                f3 = f7;
                listWrite = list;
                listAudioAttributesCompatParcelizer = list2;
                f24 = f11;
                length = i9;
            }
        }
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas, float f, float f2, getSchemeUuid getschemeuuid, postKeyRequest postkeyrequest) {
        if (getschemeuuid.write == 1122868 || getschemeuuid.write == 1122867 || getschemeuuid.write == 0) {
            return;
        }
        int iSave = canvas.save();
        postKeyRequest.RemoteActionCompatParcelizer remoteActionCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = getschemeuuid.AudioAttributesCompatParcelizer;
        if (remoteActionCompatParcelizerMediaBrowserCompatCustomActionResultReceiver == postKeyRequest.RemoteActionCompatParcelizer.DEFAULT) {
            remoteActionCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = postkeyrequest.MediaBrowserCompatCustomActionResultReceiver();
        }
        this.IconCompatParcelizer.setColor(getschemeuuid.write);
        float fWrite = drmSessionAcquired.write(Float.isNaN(getschemeuuid.IconCompatParcelizer) ? postkeyrequest.MediaBrowserCompatItemReceiver() : getschemeuuid.IconCompatParcelizer);
        float f3 = fWrite / 2.0f;
        int i = AnonymousClass3.RemoteActionCompatParcelizer[remoteActionCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.ordinal()];
        if (i == 3 || i == 4) {
            this.IconCompatParcelizer.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f + f3, f2, f3, this.IconCompatParcelizer);
        } else if (i == 5) {
            this.IconCompatParcelizer.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, f2 - f3, f + fWrite, f2 + f3, this.IconCompatParcelizer);
        } else if (i == 6) {
            float fWrite2 = drmSessionAcquired.write(Float.isNaN(getschemeuuid.RemoteActionCompatParcelizer) ? postkeyrequest.AudioAttributesImplBaseParcelizer() : getschemeuuid.RemoteActionCompatParcelizer);
            DashPathEffect dashPathEffectAudioAttributesImplApi26Parcelizer = getschemeuuid.read == null ? postkeyrequest.AudioAttributesImplApi26Parcelizer() : getschemeuuid.read;
            this.IconCompatParcelizer.setStyle(Paint.Style.STROKE);
            this.IconCompatParcelizer.setStrokeWidth(fWrite2);
            this.IconCompatParcelizer.setPathEffect(dashPathEffectAudioAttributesImplApi26Parcelizer);
            this.MediaBrowserCompatItemReceiver.reset();
            this.MediaBrowserCompatItemReceiver.moveTo(f, f2);
            this.MediaBrowserCompatItemReceiver.lineTo(f + fWrite, f2);
            canvas.drawPath(this.MediaBrowserCompatItemReceiver, this.IconCompatParcelizer);
        }
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: o.createSessionCreationData$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;
        static final /* synthetic */ int[] IconCompatParcelizer;
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[postKeyRequest.RemoteActionCompatParcelizer.values().length];
            RemoteActionCompatParcelizer = iArr;
            try {
                iArr[postKeyRequest.RemoteActionCompatParcelizer.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RemoteActionCompatParcelizer[postKeyRequest.RemoteActionCompatParcelizer.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RemoteActionCompatParcelizer[postKeyRequest.RemoteActionCompatParcelizer.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RemoteActionCompatParcelizer[postKeyRequest.RemoteActionCompatParcelizer.CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                RemoteActionCompatParcelizer[postKeyRequest.RemoteActionCompatParcelizer.SQUARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                RemoteActionCompatParcelizer[postKeyRequest.RemoteActionCompatParcelizer.LINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[postKeyRequest.IconCompatParcelizer.values().length];
            read = iArr2;
            try {
                iArr2[postKeyRequest.IconCompatParcelizer.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                read[postKeyRequest.IconCompatParcelizer.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[postKeyRequest.write.values().length];
            IconCompatParcelizer = iArr3;
            try {
                iArr3[postKeyRequest.write.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                IconCompatParcelizer[postKeyRequest.write.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                IconCompatParcelizer[postKeyRequest.write.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[postKeyRequest.read.values().length];
            AudioAttributesCompatParcelizer = iArr4;
            try {
                iArr4[postKeyRequest.read.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AudioAttributesCompatParcelizer[postKeyRequest.read.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AudioAttributesCompatParcelizer[postKeyRequest.read.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private void IconCompatParcelizer(Canvas canvas, float f, float f2, String str) {
        canvas.drawText(str, f, f2, this.RemoteActionCompatParcelizer);
    }
}
