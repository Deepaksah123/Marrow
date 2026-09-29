package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.CandleEntry;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultDrmSessionManagerReferenceCountListenerImplExternalSyntheticLambda0 extends setDrmUserAgent {
    private float[] AudioAttributesCompatParcelizer;
    private float[] IconCompatParcelizer;
    private float[] MediaBrowserCompatMediaItem;
    private float[] RemoteActionCompatParcelizer;
    private float[] read;
    protected setMode write;

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void RemoteActionCompatParcelizer() {
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void read(Canvas canvas) {
    }

    public DefaultDrmSessionManagerReferenceCountListenerImplExternalSyntheticLambda0(setMode setmode, onKeyResponse onkeyresponse, lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        super(onkeyresponse, lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        this.MediaBrowserCompatMediaItem = new float[8];
        this.AudioAttributesCompatParcelizer = new float[4];
        this.RemoteActionCompatParcelizer = new float[4];
        this.read = new float[4];
        this.IconCompatParcelizer = new float[4];
        this.write = setmode;
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void IconCompatParcelizer(Canvas canvas) {
        for (T t : this.write.IconCompatParcelizer().IconCompatParcelizer()) {
            if (t.handleMediaPlayPauseIfPendingOnHandler()) {
                read(canvas, t);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void read(Canvas canvas, DefaultDrmSessionManagerBuilder defaultDrmSessionManagerBuilder) {
        int iOnPrepareFromUri;
        int iOnRemoveQueueItem;
        int iOnPrepareFromUri2;
        int iOnPrepareFromSearch;
        int iOnPlayFromUri;
        drmSessionReleased drmsessionreleasedWrite = this.write.write(defaultDrmSessionManagerBuilder.IconCompatParcelizer());
        float f = this.MediaBrowserCompatItemReceiver.read();
        float fOnPrepareFromMediaId = defaultDrmSessionManagerBuilder.onPrepareFromMediaId();
        boolean zOnSetShuffleMode = defaultDrmSessionManagerBuilder.onSetShuffleMode();
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.write, defaultDrmSessionManagerBuilder);
        this.AudioAttributesImplBaseParcelizer.setStrokeWidth(defaultDrmSessionManagerBuilder.onRewind());
        for (int i = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer; i <= this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer + this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer; i++) {
            CandleEntry candleEntry = (CandleEntry) defaultDrmSessionManagerBuilder.IconCompatParcelizer(i);
            if (candleEntry != null) {
                float fMediaBrowserCompatCustomActionResultReceiver = candleEntry.MediaBrowserCompatCustomActionResultReceiver();
                float fAudioAttributesImplApi26Parcelizer = candleEntry.AudioAttributesImplApi26Parcelizer();
                float fWrite = candleEntry.write();
                float fRemoteActionCompatParcelizer = candleEntry.RemoteActionCompatParcelizer();
                float fAudioAttributesCompatParcelizer = candleEntry.AudioAttributesCompatParcelizer();
                if (zOnSetShuffleMode) {
                    float[] fArr = this.MediaBrowserCompatMediaItem;
                    fArr[0] = fMediaBrowserCompatCustomActionResultReceiver;
                    fArr[2] = fMediaBrowserCompatCustomActionResultReceiver;
                    fArr[4] = fMediaBrowserCompatCustomActionResultReceiver;
                    fArr[6] = fMediaBrowserCompatCustomActionResultReceiver;
                    if (fAudioAttributesImplApi26Parcelizer > fWrite) {
                        fArr[1] = fRemoteActionCompatParcelizer * f;
                        fArr[3] = fAudioAttributesImplApi26Parcelizer * f;
                        fArr[5] = fAudioAttributesCompatParcelizer * f;
                        fArr[7] = fWrite * f;
                    } else if (fAudioAttributesImplApi26Parcelizer < fWrite) {
                        fArr[1] = fRemoteActionCompatParcelizer * f;
                        fArr[3] = fWrite * f;
                        fArr[5] = fAudioAttributesCompatParcelizer * f;
                        fArr[7] = fAudioAttributesImplApi26Parcelizer * f;
                    } else {
                        fArr[1] = fRemoteActionCompatParcelizer * f;
                        float f2 = fAudioAttributesImplApi26Parcelizer * f;
                        fArr[3] = f2;
                        fArr[5] = fAudioAttributesCompatParcelizer * f;
                        fArr[7] = f2;
                    }
                    drmsessionreleasedWrite.RemoteActionCompatParcelizer(fArr);
                    if (!defaultDrmSessionManagerBuilder.onSeekTo()) {
                        Paint paint = this.AudioAttributesImplBaseParcelizer;
                        if (defaultDrmSessionManagerBuilder.onRemoveQueueItem() == 1122867) {
                            iOnRemoveQueueItem = defaultDrmSessionManagerBuilder.AudioAttributesCompatParcelizer(i);
                        } else {
                            iOnRemoveQueueItem = defaultDrmSessionManagerBuilder.onRemoveQueueItem();
                        }
                        paint.setColor(iOnRemoveQueueItem);
                    } else if (fAudioAttributesImplApi26Parcelizer > fWrite) {
                        Paint paint2 = this.AudioAttributesImplBaseParcelizer;
                        if (defaultDrmSessionManagerBuilder.onPlayFromUri() == 1122867) {
                            iOnPlayFromUri = defaultDrmSessionManagerBuilder.AudioAttributesCompatParcelizer(i);
                        } else {
                            iOnPlayFromUri = defaultDrmSessionManagerBuilder.onPlayFromUri();
                        }
                        paint2.setColor(iOnPlayFromUri);
                    } else if (fAudioAttributesImplApi26Parcelizer < fWrite) {
                        Paint paint3 = this.AudioAttributesImplBaseParcelizer;
                        if (defaultDrmSessionManagerBuilder.onPrepareFromSearch() == 1122867) {
                            iOnPrepareFromSearch = defaultDrmSessionManagerBuilder.AudioAttributesCompatParcelizer(i);
                        } else {
                            iOnPrepareFromSearch = defaultDrmSessionManagerBuilder.onPrepareFromSearch();
                        }
                        paint3.setColor(iOnPrepareFromSearch);
                    } else {
                        Paint paint4 = this.AudioAttributesImplBaseParcelizer;
                        if (defaultDrmSessionManagerBuilder.onPrepareFromUri() == 1122867) {
                            iOnPrepareFromUri2 = defaultDrmSessionManagerBuilder.AudioAttributesCompatParcelizer(i);
                        } else {
                            iOnPrepareFromUri2 = defaultDrmSessionManagerBuilder.onPrepareFromUri();
                        }
                        paint4.setColor(iOnPrepareFromUri2);
                    }
                    this.AudioAttributesImplBaseParcelizer.setStyle(Paint.Style.STROKE);
                    canvas.drawLines(this.MediaBrowserCompatMediaItem, this.AudioAttributesImplBaseParcelizer);
                    float[] fArr2 = this.AudioAttributesCompatParcelizer;
                    fArr2[0] = (fMediaBrowserCompatCustomActionResultReceiver - 0.5f) + fOnPrepareFromMediaId;
                    fArr2[1] = fWrite * f;
                    fArr2[2] = (fMediaBrowserCompatCustomActionResultReceiver + 0.5f) - fOnPrepareFromMediaId;
                    fArr2[3] = fAudioAttributesImplApi26Parcelizer * f;
                    drmsessionreleasedWrite.RemoteActionCompatParcelizer(fArr2);
                    if (fAudioAttributesImplApi26Parcelizer > fWrite) {
                        if (defaultDrmSessionManagerBuilder.onPlayFromUri() == 1122867) {
                            this.AudioAttributesImplBaseParcelizer.setColor(defaultDrmSessionManagerBuilder.AudioAttributesCompatParcelizer(i));
                        } else {
                            this.AudioAttributesImplBaseParcelizer.setColor(defaultDrmSessionManagerBuilder.onPlayFromUri());
                        }
                        this.AudioAttributesImplBaseParcelizer.setStyle(defaultDrmSessionManagerBuilder.onPrepare());
                        float[] fArr3 = this.AudioAttributesCompatParcelizer;
                        canvas.drawRect(fArr3[0], fArr3[3], fArr3[2], fArr3[1], this.AudioAttributesImplBaseParcelizer);
                    } else if (fAudioAttributesImplApi26Parcelizer < fWrite) {
                        if (defaultDrmSessionManagerBuilder.onPrepareFromSearch() == 1122867) {
                            this.AudioAttributesImplBaseParcelizer.setColor(defaultDrmSessionManagerBuilder.AudioAttributesCompatParcelizer(i));
                        } else {
                            this.AudioAttributesImplBaseParcelizer.setColor(defaultDrmSessionManagerBuilder.onPrepareFromSearch());
                        }
                        this.AudioAttributesImplBaseParcelizer.setStyle(defaultDrmSessionManagerBuilder.onRemoveQueueItemAt());
                        float[] fArr4 = this.AudioAttributesCompatParcelizer;
                        canvas.drawRect(fArr4[0], fArr4[1], fArr4[2], fArr4[3], this.AudioAttributesImplBaseParcelizer);
                    } else {
                        if (defaultDrmSessionManagerBuilder.onPrepareFromUri() == 1122867) {
                            this.AudioAttributesImplBaseParcelizer.setColor(defaultDrmSessionManagerBuilder.AudioAttributesCompatParcelizer(i));
                        } else {
                            this.AudioAttributesImplBaseParcelizer.setColor(defaultDrmSessionManagerBuilder.onPrepareFromUri());
                        }
                        float[] fArr5 = this.AudioAttributesCompatParcelizer;
                        canvas.drawLine(fArr5[0], fArr5[1], fArr5[2], fArr5[3], this.AudioAttributesImplBaseParcelizer);
                    }
                } else {
                    float[] fArr6 = this.RemoteActionCompatParcelizer;
                    fArr6[0] = fMediaBrowserCompatCustomActionResultReceiver;
                    fArr6[1] = fRemoteActionCompatParcelizer * f;
                    fArr6[2] = fMediaBrowserCompatCustomActionResultReceiver;
                    fArr6[3] = fAudioAttributesCompatParcelizer * f;
                    float[] fArr7 = this.read;
                    fArr7[0] = (fMediaBrowserCompatCustomActionResultReceiver - 0.5f) + fOnPrepareFromMediaId;
                    float f3 = fAudioAttributesImplApi26Parcelizer * f;
                    fArr7[1] = f3;
                    fArr7[2] = fMediaBrowserCompatCustomActionResultReceiver;
                    fArr7[3] = f3;
                    float[] fArr8 = this.IconCompatParcelizer;
                    fArr8[0] = (0.5f + fMediaBrowserCompatCustomActionResultReceiver) - fOnPrepareFromMediaId;
                    float f4 = fWrite * f;
                    fArr8[1] = f4;
                    fArr8[2] = fMediaBrowserCompatCustomActionResultReceiver;
                    fArr8[3] = f4;
                    drmsessionreleasedWrite.RemoteActionCompatParcelizer(fArr6);
                    drmsessionreleasedWrite.RemoteActionCompatParcelizer(this.read);
                    drmsessionreleasedWrite.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
                    if (fAudioAttributesImplApi26Parcelizer > fWrite) {
                        if (defaultDrmSessionManagerBuilder.onPlayFromUri() == 1122867) {
                            iOnPrepareFromUri = defaultDrmSessionManagerBuilder.AudioAttributesCompatParcelizer(i);
                        } else {
                            iOnPrepareFromUri = defaultDrmSessionManagerBuilder.onPlayFromUri();
                        }
                    } else if (fAudioAttributesImplApi26Parcelizer < fWrite) {
                        if (defaultDrmSessionManagerBuilder.onPrepareFromSearch() == 1122867) {
                            iOnPrepareFromUri = defaultDrmSessionManagerBuilder.AudioAttributesCompatParcelizer(i);
                        } else {
                            iOnPrepareFromUri = defaultDrmSessionManagerBuilder.onPrepareFromSearch();
                        }
                    } else if (defaultDrmSessionManagerBuilder.onPrepareFromUri() == 1122867) {
                        iOnPrepareFromUri = defaultDrmSessionManagerBuilder.AudioAttributesCompatParcelizer(i);
                    } else {
                        iOnPrepareFromUri = defaultDrmSessionManagerBuilder.onPrepareFromUri();
                    }
                    this.AudioAttributesImplBaseParcelizer.setColor(iOnPrepareFromUri);
                    float[] fArr9 = this.RemoteActionCompatParcelizer;
                    canvas.drawLine(fArr9[0], fArr9[1], fArr9[2], fArr9[3], this.AudioAttributesImplBaseParcelizer);
                    float[] fArr10 = this.read;
                    canvas.drawLine(fArr10[0], fArr10[1], fArr10[2], fArr10[3], this.AudioAttributesImplBaseParcelizer);
                    float[] fArr11 = this.IconCompatParcelizer;
                    canvas.drawLine(fArr11[0], fArr11[1], fArr11[2], fArr11[3], this.AudioAttributesImplBaseParcelizer);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void write(Canvas canvas) {
        DefaultDrmSessionManagerBuilder defaultDrmSessionManagerBuilder;
        CandleEntry candleEntry;
        float f;
        if (AudioAttributesCompatParcelizer(this.write)) {
            List<T> listIconCompatParcelizer = this.write.IconCompatParcelizer().IconCompatParcelizer();
            for (int i = 0; i < listIconCompatParcelizer.size(); i++) {
                DefaultDrmSessionManagerBuilder defaultDrmSessionManagerBuilder2 = (DefaultDrmSessionManagerBuilder) listIconCompatParcelizer.get(i);
                if (IconCompatParcelizer(defaultDrmSessionManagerBuilder2) && defaultDrmSessionManagerBuilder2.onMediaButtonEvent() > 0) {
                    RemoteActionCompatParcelizer(defaultDrmSessionManagerBuilder2);
                    drmSessionReleased drmsessionreleasedWrite = this.write.write(defaultDrmSessionManagerBuilder2.IconCompatParcelizer());
                    this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.write, defaultDrmSessionManagerBuilder2);
                    float[] fArrRemoteActionCompatParcelizer = drmsessionreleasedWrite.RemoteActionCompatParcelizer(defaultDrmSessionManagerBuilder2, this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(), this.MediaBrowserCompatItemReceiver.read(), this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer);
                    float fWrite = drmSessionAcquired.write(5.0f);
                    DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem = defaultDrmSessionManagerBuilder2.MediaBrowserCompatMediaItem();
                    lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(defaultDrmSessionManagerBuilder2.MediaDescriptionCompat());
                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = drmSessionAcquired.write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer);
                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = drmSessionAcquired.write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write);
                    int i2 = 0;
                    while (i2 < fArrRemoteActionCompatParcelizer.length) {
                        float f2 = fArrRemoteActionCompatParcelizer[i2];
                        float f3 = fArrRemoteActionCompatParcelizer[i2 + 1];
                        if (!this.MediaBrowserCompatSearchResultReceiver.write(f2)) {
                            break;
                        }
                        if (this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(f2) && this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(f3)) {
                            int i3 = i2 / 2;
                            CandleEntry candleEntry2 = (CandleEntry) defaultDrmSessionManagerBuilder2.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer + i3);
                            if (defaultDrmSessionManagerBuilder2.onAddQueueItem()) {
                                candleEntry = candleEntry2;
                                f = f3;
                                defaultDrmSessionManagerBuilder = defaultDrmSessionManagerBuilder2;
                                RemoteActionCompatParcelizer(canvas, defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(candleEntry2), f2, f3 - fWrite, defaultDrmSessionManagerBuilder2.write(i3));
                            } else {
                                candleEntry = candleEntry2;
                                f = f3;
                                defaultDrmSessionManagerBuilder = defaultDrmSessionManagerBuilder2;
                            }
                            if (candleEntry.AudioAttributesImplApi21Parcelizer() != null && defaultDrmSessionManagerBuilder.onCommand()) {
                                Drawable drawableAudioAttributesImplApi21Parcelizer = candleEntry.AudioAttributesImplApi21Parcelizer();
                                drmSessionAcquired.write(canvas, drawableAudioAttributesImplApi21Parcelizer, (int) (f2 + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer), (int) (f + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write), drawableAudioAttributesImplApi21Parcelizer.getIntrinsicWidth(), drawableAudioAttributesImplApi21Parcelizer.getIntrinsicHeight());
                            }
                        } else {
                            defaultDrmSessionManagerBuilder = defaultDrmSessionManagerBuilder2;
                        }
                        i2 += 2;
                        defaultDrmSessionManagerBuilder2 = defaultDrmSessionManagerBuilder;
                    }
                    lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
                }
            }
        }
    }

    private void RemoteActionCompatParcelizer(Canvas canvas, String str, float f, float f2, int i) {
        this.AudioAttributesImplApi21Parcelizer.setColor(i);
        canvas.drawText(str, f, f2, this.AudioAttributesImplApi21Parcelizer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void RemoteActionCompatParcelizer(Canvas canvas, createAndAcquireSessionWithRetry[] createandacquiresessionwithretryArr) {
        queryKeyStatus querykeystatusIconCompatParcelizer = this.write.IconCompatParcelizer();
        for (createAndAcquireSessionWithRetry createandacquiresessionwithretry : createandacquiresessionwithretryArr) {
            onEvent onevent = (DefaultDrmSessionManagerBuilder) querykeystatusIconCompatParcelizer.RemoteActionCompatParcelizer(createandacquiresessionwithretry.RemoteActionCompatParcelizer());
            if (onevent != null && onevent.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                CandleEntry candleEntry = (CandleEntry) onevent.read(createandacquiresessionwithretry.MediaBrowserCompatCustomActionResultReceiver(), createandacquiresessionwithretry.MediaBrowserCompatItemReceiver());
                if (RemoteActionCompatParcelizer(candleEntry, onevent)) {
                    drmKeysRemoved drmkeysremovedRemoteActionCompatParcelizer = this.write.write(onevent.IconCompatParcelizer()).RemoteActionCompatParcelizer(candleEntry.MediaBrowserCompatCustomActionResultReceiver(), ((candleEntry.AudioAttributesCompatParcelizer() * this.MediaBrowserCompatItemReceiver.read()) + (candleEntry.RemoteActionCompatParcelizer() * this.MediaBrowserCompatItemReceiver.read())) / 2.0f);
                    createandacquiresessionwithretry.write((float) drmkeysremovedRemoteActionCompatParcelizer.IconCompatParcelizer, (float) drmkeysremovedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
                    read(canvas, (float) drmkeysremovedRemoteActionCompatParcelizer.IconCompatParcelizer, (float) drmkeysremovedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, onevent);
                }
            }
        }
    }
}
