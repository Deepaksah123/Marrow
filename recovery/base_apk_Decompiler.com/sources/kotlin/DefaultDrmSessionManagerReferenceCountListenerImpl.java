package kotlin;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.CombinedChart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultDrmSessionManagerReferenceCountListenerImpl extends lambdaonReferenceCountDecremented0 {
    private WeakReference<Chart> RemoteActionCompatParcelizer;
    private List<createAndAcquireSessionWithRetry> read;
    private List<lambdaonReferenceCountDecremented0> write;

    public DefaultDrmSessionManagerReferenceCountListenerImpl(CombinedChart combinedChart, onKeyResponse onkeyresponse, lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        super(onkeyresponse, lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        this.write = new ArrayList(5);
        this.read = new ArrayList();
        this.RemoteActionCompatParcelizer = new WeakReference<>(combinedChart);
        read();
    }

    public final void read() {
        this.write.clear();
        CombinedChart combinedChart = (CombinedChart) this.RemoteActionCompatParcelizer.get();
        if (combinedChart != null) {
            for (CombinedChart.write writeVar : combinedChart.ParcelableVolumeInfo()) {
                int i = AnonymousClass4.IconCompatParcelizer[writeVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                if (combinedChart.IconCompatParcelizer() != null) {
                                    this.write.add(new DefaultDrmSessionManagerReferenceCountListenerImplExternalSyntheticLambda0(combinedChart, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatSearchResultReceiver));
                                }
                            } else if (i == 5 && combinedChart.PlaybackStateCompatCustomAction() != null) {
                                this.write.add(new copyWithSchemeType(combinedChart, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatSearchResultReceiver));
                            }
                        } else if (combinedChart.MediaSessionCompatToken() != null) {
                            this.write.add(new setDrmHttpDataSourceFactory(combinedChart, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatSearchResultReceiver));
                        }
                    } else if (combinedChart.J_() != null) {
                        this.write.add(new DefaultDrmSessionManagerProvider(combinedChart, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatSearchResultReceiver));
                    }
                } else if (combinedChart.write() != null) {
                    this.write.add(new DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1(combinedChart, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatSearchResultReceiver));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.DefaultDrmSessionManagerReferenceCountListenerImpl$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[CombinedChart.write.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[CombinedChart.write.BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[CombinedChart.write.BUBBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IconCompatParcelizer[CombinedChart.write.LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IconCompatParcelizer[CombinedChart.write.CANDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IconCompatParcelizer[CombinedChart.write.SCATTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void RemoteActionCompatParcelizer() {
        Iterator<lambdaonReferenceCountDecremented0> it = this.write.iterator();
        while (it.hasNext()) {
            it.next().RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void IconCompatParcelizer(Canvas canvas) {
        Iterator<lambdaonReferenceCountDecremented0> it = this.write.iterator();
        while (it.hasNext()) {
            it.next().IconCompatParcelizer(canvas);
        }
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void write(Canvas canvas) {
        Iterator<lambdaonReferenceCountDecremented0> it = this.write.iterator();
        while (it.hasNext()) {
            it.next().write(canvas);
        }
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void read(Canvas canvas) {
        Iterator<lambdaonReferenceCountDecremented0> it = this.write.iterator();
        while (it.hasNext()) {
            it.next().read(canvas);
        }
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void RemoteActionCompatParcelizer(Canvas canvas, createAndAcquireSessionWithRetry[] createandacquiresessionwithretryArr) {
        Object objJ_;
        Chart chart = this.RemoteActionCompatParcelizer.get();
        if (chart != null) {
            for (lambdaonReferenceCountDecremented0 lambdaonreferencecountdecremented0 : this.write) {
                if (lambdaonreferencecountdecremented0 instanceof DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1) {
                    objJ_ = ((DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1) lambdaonreferencecountdecremented0).RemoteActionCompatParcelizer.write();
                } else if (lambdaonreferencecountdecremented0 instanceof setDrmHttpDataSourceFactory) {
                    objJ_ = ((setDrmHttpDataSourceFactory) lambdaonreferencecountdecremented0).read.MediaSessionCompatToken();
                } else if (lambdaonreferencecountdecremented0 instanceof DefaultDrmSessionManagerReferenceCountListenerImplExternalSyntheticLambda0) {
                    objJ_ = ((DefaultDrmSessionManagerReferenceCountListenerImplExternalSyntheticLambda0) lambdaonreferencecountdecremented0).write.IconCompatParcelizer();
                } else if (lambdaonreferencecountdecremented0 instanceof copyWithSchemeType) {
                    objJ_ = ((copyWithSchemeType) lambdaonreferencecountdecremented0).IconCompatParcelizer.PlaybackStateCompatCustomAction();
                } else {
                    objJ_ = lambdaonreferencecountdecremented0 instanceof DefaultDrmSessionManagerProvider ? ((DefaultDrmSessionManagerProvider) lambdaonreferencecountdecremented0).write.J_() : null;
                }
                int iIndexOf = objJ_ == null ? -1 : ((DefaultDrmSessionExternalSyntheticLambda2) chart.onSeekTo()).AudioAttributesCompatParcelizer().indexOf(objJ_);
                this.read.clear();
                for (createAndAcquireSessionWithRetry createandacquiresessionwithretry : createandacquiresessionwithretryArr) {
                    if (createandacquiresessionwithretry.write() == iIndexOf || createandacquiresessionwithretry.write() == -1) {
                        this.read.add(createandacquiresessionwithretry);
                    }
                }
                List<createAndAcquireSessionWithRetry> list = this.read;
                lambdaonreferencecountdecremented0.RemoteActionCompatParcelizer(canvas, (createAndAcquireSessionWithRetry[]) list.toArray(new createAndAcquireSessionWithRetry[list.size()]));
            }
        }
    }
}
