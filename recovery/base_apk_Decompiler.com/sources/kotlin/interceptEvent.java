package kotlin;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u000e\u00143\f\u0013\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ-\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ5\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ-\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\tJ5\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\rJ5\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rJ%\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u0006¢\u0006\u0004\b\n\u0010\u000fJ-\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J-\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\b\u0010\u0012J-\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\tJU\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\f\u0010\u0019J-\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\tJ-\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\n\u0010\u0012J-\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J-\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0012J5\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u001bJM\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u001dJ-\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\tJ=\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u001f¢\u0006\u0004\b\u000e\u0010 JE\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020!¢\u0006\u0004\b\f\u0010\"J5\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\rJ=\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010#J-\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020$¢\u0006\u0004\b\u0013\u0010%J-\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020$¢\u0006\u0004\b\f\u0010%J-\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020$¢\u0006\u0004\b\n\u0010%J-\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020$¢\u0006\u0004\b\u000e\u0010%JM\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020&¢\u0006\u0004\b\u0014\u0010'J-\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\tJE\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010(JE\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010)JU\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020*¢\u0006\u0004\b\n\u0010+J-\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020,¢\u0006\u0004\b\u0013\u0010-J-\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020,¢\u0006\u0004\b\n\u0010-J=\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010#JM\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\f\u0010.J\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010/J=\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u000200¢\u0006\u0004\b\u0013\u00101J=\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u000200¢\u0006\u0004\b\f\u00101JG\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020,2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u000200H\u0002¢\u0006\u0004\b\u000e\u00102J%\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u0006¢\u0006\u0004\b\u0014\u0010\u000f"}, d2 = {"Lo/interceptEvent;", "", "<init>", "()V", "", "p0", "Lo/getSubscriptionExpiresOn;", "", "AudioAttributesImplApi26Parcelizer", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "read", "p1", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "write", "()Lo/getSubscriptionExpiresOn;", "", "AudioAttributesImplBaseParcelizer", "(I)Lo/getSubscriptionExpiresOn;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "p2", "p3", "p4", "p5", "(Ljava/lang/String;Ljava/lang/String;III)Lo/getSubscriptionExpiresOn;", "Lo/interceptEvent$read;", "(Lo/interceptEvent$read;I)Lo/getSubscriptionExpiresOn;", "Lo/interceptEvent$RemoteActionCompatParcelizer;", "(Lo/interceptEvent$RemoteActionCompatParcelizer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "MediaBrowserCompatItemReceiver", "Lo/AppMeasurementEventInterceptor;", "(Ljava/lang/String;Ljava/lang/String;Lo/AppMeasurementEventInterceptor;)Lo/getSubscriptionExpiresOn;", "Lo/AppMeasurementConditionalUserProperty;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/AppMeasurementConditionalUserProperty;)Lo/getSubscriptionExpiresOn;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "Lo/interceptEvent$write;", "(Lo/interceptEvent$write;)Lo/getSubscriptionExpiresOn;", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;D)Lo/getSubscriptionExpiresOn;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lo/getSubscriptionExpiresOn;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lo/getSubscriptionExpiresOn;", "Lo/setOnMaskChangedListener;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/setOnMaskChangedListener;)Lo/getSubscriptionExpiresOn;", "", "(Z)Lo/getSubscriptionExpiresOn;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lo/getSubscriptionExpiresOn;", "(I)Ljava/lang/String;", "", "(Ljava/lang/String;Ljava/lang/String;J)Lo/getSubscriptionExpiresOn;", "(ZLjava/lang/String;Ljava/lang/String;J)Lo/getSubscriptionExpiresOn;", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class interceptEvent {
    public static final interceptEvent INSTANCE = new interceptEvent();

    public static final /* synthetic */ class MediaBrowserCompatCustomActionResultReceiver {
        public static final /* synthetic */ int[] IconCompatParcelizer;
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[read.values().length];
            try {
                iArr[read.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[read.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IconCompatParcelizer = iArr;
            int[] iArr2 = new int[setOnMaskChangedListener.values().length];
            try {
                iArr2[setOnMaskChangedListener.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[setOnMaskChangedListener.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            RemoteActionCompatParcelizer = iArr2;
            int[] iArr3 = new int[IconCompatParcelizer.values().length];
            try {
                iArr3[IconCompatParcelizer.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[IconCompatParcelizer.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private interceptEvent() {
    }

    public static Pair<String, Map<String, String>> AudioAttributesImplApi26Parcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("source", p0);
        return new Pair<>("upcoming_tests_accessed", map);
    }

    public static Pair<String, Map<String, String>> read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("source", p0);
        return new Pair<>("previous_tests_accessed", map);
    }

    public static Pair<String, Map<String, String>> AudioAttributesCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("source", p0);
        map2.put("year", p1);
        return new Pair<>("old_tests_accessed", map);
    }

    public static Pair<String, Map<String, String>> AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("test_id", p0);
        return new Pair<>("test_play_start", map);
    }

    public static Pair<String, Map<String, String>> read(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("test_id", p0);
        map2.put("date", p1);
        return new Pair<>("test_submit", map);
    }

    public static Pair<String, Map<String, String>> write(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("test_id", p0);
        map2.put("date", p1);
        return new Pair<>("test_discard", map);
    }

    public static Pair<String, Map<String, Object>> write() {
        return new Pair<>("cm_exit", new HashMap());
    }

    public static Pair<String, Map<String, Object>> read() {
        return new Pair<>("gt_nudge_red_dot", new HashMap());
    }

    public static Pair<String, Map<String, Object>> AudioAttributesImplBaseParcelizer(int p0) {
        HashMap map = new HashMap();
        map.put("nudge_type", String.valueOf(p0));
        return new Pair<>("gt_nudge_prompt", map);
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(int p0) {
        HashMap map = new HashMap();
        map.put("nudge_type", String.valueOf(p0));
        return new Pair<>("gt_nudge_maybe_later", map);
    }

    public static Pair<String, Map<String, Object>> AudioAttributesImplApi26Parcelizer(int p0) {
        HashMap map = new HashMap();
        map.put("nudge_type", String.valueOf(p0));
        return new Pair<>("gt_nudge_start_test", map);
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("test_gt_progress_opened", VideoTimelineResponseBody.read(setAction.write("source", p0)));
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String str, String str2, int i, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return new Pair<>("test_gt_progress_subject_opened", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("subject_id", str), setAction.write("subject_title", str2), setAction.write("subject_percentile", Integer.valueOf(i)), setAction.write("subject_percentage", Integer.valueOf(i2)), setAction.write("filter_chosen", Integer.valueOf(i3))));
    }

    public static Pair<String, Map<String, Object>> write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("test_gt_progress_test_details", VideoTimelineResponseBody.read(setAction.write("test_id", p0)));
    }

    public static Pair<String, Map<String, Object>> read(int p0) {
        return new Pair<>("test_gt_progress_gt_filter_selected", VideoTimelineResponseBody.read(setAction.write("filter_chosen", Integer.valueOf(p0))));
    }

    public static Pair<String, Map<String, Object>> write(int p0) {
        return new Pair<>("test_gt_progress_percentage_viewed", VideoTimelineResponseBody.read(setAction.write("filter_chosen", Integer.valueOf(p0))));
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(int p0) {
        return new Pair<>("test_gt_progress_weak_lesson_viewed", VideoTimelineResponseBody.read(setAction.write("filter_chosen", Integer.valueOf(p0))));
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(read p0, int p1) {
        String str;
        toMagicModuleMetaRepoModel.write(p0, "");
        int i = MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer[p0.ordinal()];
        if (i == 1) {
            str = "subject_view";
        } else {
            if (i != 2) {
                throw new RenewEligibleCreator();
            }
            str = "topic_view";
        }
        return new Pair<>("test_gt_progress_sort_changed", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("source", str), setAction.write("filter_chosen", Integer.valueOf(p1))));
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(RemoteActionCompatParcelizer p0, int p1, String p2, String p3, String p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        String lowerCase = p0.toString().toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        Pair pairWrite = setAction.write("submission_status", lowerCase);
        String lowerCase2 = MediaBrowserCompatItemReceiver(p1).toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
        Pair pairWrite2 = setAction.write("test_status", lowerCase2);
        Pair pairWrite3 = setAction.write("test_id", p2);
        String lowerCase3 = p3.toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase3, "");
        return new Pair<>("test_opened", VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairWrite, pairWrite2, pairWrite3, setAction.write("test_type", lowerCase3), setAction.write("source", p4)));
    }

    public static Pair<String, Map<String, Object>> MediaBrowserCompatItemReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("test_start_attempted", VideoTimelineResponseBody.read(setAction.write("test_id", p0)));
    }

    public static Pair<String, Map<String, Object>> write(String p0, String p1, AppMeasurementEventInterceptor p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        Pair pairWrite = setAction.write("test_id", p0);
        Pair pairWrite2 = setAction.write("part_title", p1);
        String lowerCase = p2.name().toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        return new Pair<>("test_review_test_sheet", VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairWrite, pairWrite2, setAction.write("source", lowerCase)));
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String p0, String p1, String p2, AppMeasurementConditionalUserProperty p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        Pair pairWrite = setAction.write("test_id", p0);
        Pair pairWrite2 = setAction.write("current_part", p1);
        Pair pairWrite3 = setAction.write("part_accessed", p2);
        String lowerCase = p3.name().toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        return new Pair<>("test_access_other_parts", VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairWrite, pairWrite2, pairWrite3, setAction.write("source", lowerCase)));
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new Pair<>("test_part_shown", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("test_id", p0), setAction.write("part_title", p1)));
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String p0, String p1, String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new Pair<>("test_submit_attempted", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("test_id", p0), setAction.write("current_part", p1), setAction.write("source", p2)));
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(write p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("test_start", p0.write());
    }

    public static final class write {
        private final String AudioAttributesCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final int read;
        private final String write;

        public write(String str, String str2, int i, String str3) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.AudioAttributesCompatParcelizer = str;
            this.write = str2;
            this.read = i;
            this.RemoteActionCompatParcelizer = str3;
        }

        public final Map<String, Object> write() {
            Pair pairWrite = setAction.write("test_id", this.AudioAttributesCompatParcelizer);
            Pair pairWrite2 = setAction.write("test_type", this.write);
            interceptEvent interceptevent = interceptEvent.INSTANCE;
            return VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairWrite, pairWrite2, setAction.write("test_status", interceptEvent.MediaBrowserCompatItemReceiver(this.read)), setAction.write("academic_year", this.RemoteActionCompatParcelizer));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) writeVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) writeVar.write) && this.read == writeVar.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) writeVar.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            return (((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.read)) * 31) + this.RemoteActionCompatParcelizer.hashCode();
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            String str2 = this.write;
            int i = this.read;
            String str3 = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("TestAnalyticsStatus(testId=");
            sb.append(str);
            sb.append(", testType=");
            sb.append(str2);
            sb.append(", testStatus=");
            sb.append(i);
            sb.append(", academicYear=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(write p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("test_paused", p0.write());
    }

    public static Pair<String, Map<String, Object>> read(write p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("test_discard", p0.write());
    }

    public static Pair<String, Map<String, Object>> write(write p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("test_submit", p0.write());
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(String p0, String p1, int p2, String p3, double p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new Pair<>("test_result", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("test_id", p0), setAction.write("test_type", p1), setAction.write("test_status", MediaBrowserCompatItemReceiver(p2)), setAction.write("academic_year", p3), setAction.write("score", Double.valueOf(p4))));
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("test_previous_year_tests", VideoTimelineResponseBody.read(setAction.write("academic_year", p0)));
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(String p0, String p1, String p2, int p3) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        if (p3 == -5) {
            audioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        } else if (p3 == -4) {
            audioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.IconCompatParcelizer;
        } else if (p3 == -3) {
            audioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.read;
        } else {
            audioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        }
        Pair pairWrite = setAction.write("test_id", p0);
        Pair pairWrite2 = setAction.write("test_type", p1);
        Pair pairWrite3 = setAction.write("academic_year", p2);
        String lowerCase = audioAttributesCompatParcelizer.toString().toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        return new Pair<>("test_result_review_answers", VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairWrite, pairWrite2, pairWrite3, setAction.write("source", lowerCase)));
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String p0, String p1, int p2, String p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new Pair<>("test_result_staterank", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("test_id", p0), setAction.write("test_type", p1), setAction.write("test_status", MediaBrowserCompatItemReceiver(p2)), setAction.write("academic_year", p3)));
    }

    public static Pair<String, Map<String, Object>> read(String p0, String p1, String p2, String p3, String p4, setOnMaskChangedListener p5) {
        String str;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        int i = MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer[p5.ordinal()];
        if (i == 1) {
            str = "test_review_detail";
        } else {
            if (i != 2) {
                throw new RenewEligibleCreator();
            }
            str = "test_review_list";
        }
        Pair pairWrite = setAction.write("test_id", p0);
        Pair pairWrite2 = setAction.write("test_type", p1);
        Pair pairWrite3 = setAction.write("academic_year", p2);
        String lowerCase = p3.toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        Pair pairWrite4 = setAction.write("subject", lowerCase);
        String lowerCase2 = p4.toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
        return new Pair<>("test_review_filter", VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairWrite, pairWrite2, pairWrite3, pairWrite4, setAction.write("mcq_type", lowerCase2), setAction.write("source", str)));
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(boolean p0) {
        return new Pair<>("test_toggle_answer", VideoTimelineResponseBody.read(setAction.write("toggle", p0 ? "show" : "hide")));
    }

    public static Pair<String, Map<String, Object>> read(boolean p0) {
        return new Pair<>("test_toggle_grid", VideoTimelineResponseBody.read(setAction.write("toggle", p0 ? "single" : "multi")));
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(String p0, String p1, String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new Pair<>("test_result_compare_with_others", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("test_id", p0), setAction.write("test_type", p1), setAction.write("academic_year", p2)));
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String p0, String p1, String p2, String p3, int p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return setAction.write("test_result_subject_wise_performance", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("test_id", p0), setAction.write("test_type", p1), setAction.write("academic_year", p2), setAction.write("subject_id", p3), setAction.write("order", Integer.valueOf(p4))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String MediaBrowserCompatItemReceiver(int p0) {
        if (p0 == 1) {
            String lowerCase = AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer.toString().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            return lowerCase;
        }
        if (p0 == 2) {
            String lowerCase2 = AudioAttributesImplApi21Parcelizer.read.toString().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
            return lowerCase2;
        }
        if (p0 == 3) {
            String lowerCase3 = AudioAttributesImplApi21Parcelizer.write.toString().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase3, "");
            return lowerCase3;
        }
        String lowerCase4 = AudioAttributesImplApi21Parcelizer.IconCompatParcelizer.toString().toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase4, "");
        return lowerCase4;
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer(String p0, String p1, long p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return write(false, p0, p1, p2);
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String p0, String p1, long p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return write(true, p0, p1, p2);
    }

    private static Pair<String, Map<String, Object>> write(boolean p0, String p1, String p2, long p3) {
        return setAction.write(p0 ? "test_move_to_next_part_chosen" : "test_move_to_next_part_shown", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("test_id", p1), setAction.write("current_part", p2), setAction.write("time_remaining", Long.valueOf(Math.max(1L, p3)))));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/interceptEvent$RemoteActionCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private static final /* synthetic */ RemoteActionCompatParcelizer[] RemoteActionCompatParcelizer;
        public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer("UNATTEMPTED", 0);
        public static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer("DISCARDED", 1);
        public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer("PAUSED", 2);
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer("SUBMITTED", 3);

        private RemoteActionCompatParcelizer(String str, int i) {
        }

        static {
            RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = read();
            RemoteActionCompatParcelizer = remoteActionCompatParcelizerArr;
            getMagicModuleTimeline.IconCompatParcelizer(remoteActionCompatParcelizerArr);
        }

        private static final /* synthetic */ RemoteActionCompatParcelizer[] read() {
            return new RemoteActionCompatParcelizer[]{IconCompatParcelizer, write, AudioAttributesCompatParcelizer, read};
        }

        public static RemoteActionCompatParcelizer valueOf(String str) {
            return (RemoteActionCompatParcelizer) Enum.valueOf(RemoteActionCompatParcelizer.class, str);
        }

        public static RemoteActionCompatParcelizer[] values() {
            return (RemoteActionCompatParcelizer[]) RemoteActionCompatParcelizer.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/interceptEvent$AudioAttributesImplApi21Parcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "read", "AudioAttributesCompatParcelizer", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer {
        private static final /* synthetic */ AudioAttributesImplApi21Parcelizer[] RemoteActionCompatParcelizer;
        public static final AudioAttributesImplApi21Parcelizer read = new AudioAttributesImplApi21Parcelizer("EXPIRED", 0);
        public static final AudioAttributesImplApi21Parcelizer AudioAttributesCompatParcelizer = new AudioAttributesImplApi21Parcelizer("LIVE", 1);
        public static final AudioAttributesImplApi21Parcelizer write = new AudioAttributesImplApi21Parcelizer("UPCOMING", 2);
        public static final AudioAttributesImplApi21Parcelizer IconCompatParcelizer = new AudioAttributesImplApi21Parcelizer("NONE", 3);

        private AudioAttributesImplApi21Parcelizer(String str, int i) {
        }

        static {
            AudioAttributesImplApi21Parcelizer[] audioAttributesImplApi21ParcelizerArrWrite = write();
            RemoteActionCompatParcelizer = audioAttributesImplApi21ParcelizerArrWrite;
            getMagicModuleTimeline.IconCompatParcelizer(audioAttributesImplApi21ParcelizerArrWrite);
        }

        private static final /* synthetic */ AudioAttributesImplApi21Parcelizer[] write() {
            return new AudioAttributesImplApi21Parcelizer[]{read, AudioAttributesCompatParcelizer, write, IconCompatParcelizer};
        }

        public static AudioAttributesImplApi21Parcelizer valueOf(String str) {
            return (AudioAttributesImplApi21Parcelizer) Enum.valueOf(AudioAttributesImplApi21Parcelizer.class, str);
        }

        public static AudioAttributesImplApi21Parcelizer[] values() {
            return (AudioAttributesImplApi21Parcelizer[]) RemoteActionCompatParcelizer.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/interceptEvent$AudioAttributesCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private static final /* synthetic */ AudioAttributesCompatParcelizer[] write;
        public static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer("ALL", 0);
        public static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer("CORRECT", 1);
        public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer("WRONG", 2);
        public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer("SKIPPED", 3);

        private AudioAttributesCompatParcelizer(String str, int i) {
        }

        static {
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            write = audioAttributesCompatParcelizerArrAudioAttributesCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(audioAttributesCompatParcelizerArrAudioAttributesCompatParcelizer);
        }

        private static final /* synthetic */ AudioAttributesCompatParcelizer[] AudioAttributesCompatParcelizer() {
            return new AudioAttributesCompatParcelizer[]{AudioAttributesCompatParcelizer, IconCompatParcelizer, read, RemoteActionCompatParcelizer};
        }

        public static AudioAttributesCompatParcelizer valueOf(String str) {
            return (AudioAttributesCompatParcelizer) Enum.valueOf(AudioAttributesCompatParcelizer.class, str);
        }

        public static AudioAttributesCompatParcelizer[] values() {
            return (AudioAttributesCompatParcelizer[]) write.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/interceptEvent$IconCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private static final /* synthetic */ IconCompatParcelizer[] RemoteActionCompatParcelizer;
        public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer("REVIEW_LIST", 0);
        public static final IconCompatParcelizer write = new IconCompatParcelizer("REVIEW_DETAIL", 1);

        private IconCompatParcelizer(String str, int i) {
        }

        static {
            IconCompatParcelizer[] iconCompatParcelizerArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            RemoteActionCompatParcelizer = iconCompatParcelizerArrAudioAttributesCompatParcelizer;
            getMagicModuleTimeline.IconCompatParcelizer(iconCompatParcelizerArrAudioAttributesCompatParcelizer);
        }

        private static final /* synthetic */ IconCompatParcelizer[] AudioAttributesCompatParcelizer() {
            return new IconCompatParcelizer[]{AudioAttributesCompatParcelizer, write};
        }

        public static IconCompatParcelizer valueOf(String str) {
            return (IconCompatParcelizer) Enum.valueOf(IconCompatParcelizer.class, str);
        }

        public static IconCompatParcelizer[] values() {
            return (IconCompatParcelizer[]) RemoteActionCompatParcelizer.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/interceptEvent$read;", "", "<init>", "(Ljava/lang/String;I)V", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private static final /* synthetic */ read[] read;
        public static final read write = new read("SUBJECT_VIEW", 0);
        public static final read RemoteActionCompatParcelizer = new read("TOPIC_VIEW", 1);

        private read(String str, int i) {
        }

        static {
            read[] readVarArr = read();
            read = readVarArr;
            getMagicModuleTimeline.IconCompatParcelizer(readVarArr);
        }

        private static final /* synthetic */ read[] read() {
            return new read[]{write, RemoteActionCompatParcelizer};
        }

        public static read valueOf(String str) {
            return (read) Enum.valueOf(read.class, str);
        }

        public static read[] values() {
            return (read[]) read.clone();
        }
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer() {
        return new Pair<>("test_nudge_dismiss", VideoTimelineResponseBody.read());
    }
}
