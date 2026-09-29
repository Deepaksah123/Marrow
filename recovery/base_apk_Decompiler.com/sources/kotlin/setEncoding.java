package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u0000 Û\u00012\u00020\u0001:\u0002Û\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u00103\u001a\u00020/2\u0006\u00108\u001a\u00020\u0019J\u000e\u0010!\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u0019J\u000e\u00109\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u0019J\u0010\u0010:\u001a\u0004\u0018\u00010\u00012\u0006\u00108\u001a\u00020\u0019J\u000e\u0010;\u001a\u00020/2\u0006\u00108\u001a\u00020\u0019J\u000e\u0010<\u001a\u00020/2\u0006\u00108\u001a\u00020\u0019J\u000e\u0010=\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u0019J\u0010\u0010>\u001a\u0004\u0018\u00010\u00012\u0006\u00108\u001a\u00020\u0019J\u000e\u0010?\u001a\u00020/2\u0006\u00108\u001a\u00020\u0019J\u000e\u0010@\u001a\u00020/2\u0006\u00108\u001a\u00020\u0019J\u0016\u0010A\u001a\u00020/2\u0006\u00108\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u0019J\u0010\u0010C\u001a\u0004\u0018\u00010\u00012\u0006\u00108\u001a\u00020\u0019J\u0010\u0010C\u001a\u0004\u0018\u00010\u00012\u0006\u0010D\u001a\u00020\u000fJ\u000e\u0010E\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u0019J\u000e\u0010E\u001a\u00020\u00192\u0006\u0010D\u001a\u00020\u000fJ\u000e\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020/J\u0006\u0010L\u001a\u00020JJ\u0012\u0010M\u001a\u0004\u0018\u00010\u00012\b\u0010(\u001a\u0004\u0018\u00010\u0001J\u0014\u0010N\u001a\u0004\u0018\u00010\u00012\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0002J\u0018\u0010O\u001a\u00020J2\u0006\u0010D\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001J\u000e\u0010P\u001a\u00020J2\u0006\u0010Q\u001a\u00020\u0019J\u0010\u0010R\u001a\u00020J2\b\u0010(\u001a\u0004\u0018\u00010\u0001J\u0010\u0010S\u001a\u00020J2\b\u0010(\u001a\u0004\u0018\u00010\u0001J\u0006\u0010T\u001a\u00020JJ\u000e\u0010U\u001a\u00020J2\u0006\u0010V\u001a\u00020WJ\u0016\u0010X\u001a\u00020J2\u0006\u0010Y\u001a\u00020\u00192\u0006\u0010(\u001a\u00020WJ\u0006\u0010Z\u001a\u00020JJ\u001c\u0010[\u001a\u0004\u0018\u00010\u00132\u0006\u0010E\u001a\u00020\u00192\b\u0010V\u001a\u0004\u0018\u00010WH\u0002J\u0010\u0010\\\u001a\u00020J2\b\u0010(\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\\\u001a\u00020J2\u0006\u0010D\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001J\u0010\u0010]\u001a\u00020J2\b\u0010(\u001a\u0004\u0018\u00010\u0001J\u0010\u0010^\u001a\u00020J2\b\u0010(\u001a\u0004\u0018\u00010\u0001J\u001d\u0010^\u001a\u0004\u0018\u00010\u00012\u0006\u00108\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0086\bJ\u0016\u0010_\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u0019J\"\u0010^\u001a\u0004\u0018\u00010\u00012\u0006\u0010B\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u0001J\u0010\u0010`\u001a\u0004\u0018\u00010\u00012\u0006\u0010a\u001a\u00020\u0019J\b\u0010b\u001a\u0004\u0018\u00010\u0001J\u0018\u0010c\u001a\u0004\u0018\u00010\u00012\u0006\u0010D\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u0019J\u0018\u0010c\u001a\u0004\u0018\u00010\u00012\u0006\u0010d\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u0019J5\u0010e\u001a\u00020J2\u0006\u0010d\u001a\u00020\u00192\u0006\u0010Q\u001a\u00020\u00192\u001a\u0010f\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020J0gH\u0086\bJ\u0015\u0010h\u001a\u00020\u00192\u0006\u0010d\u001a\u00020\u0019H\u0000¢\u0006\u0002\biJ\u0015\u0010j\u001a\u00020\u00192\u0006\u0010d\u001a\u00020\u0019H\u0000¢\u0006\u0002\bkJ\u0015\u0010l\u001a\u00020\u00192\u0006\u0010d\u001a\u00020\u0019H\u0000¢\u0006\u0002\bmJ\u000e\u0010p\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u0019J\u000e\u0010q\u001a\u00020J2\u0006\u0010r\u001a\u00020\u0019J\u000e\u0010s\u001a\u00020J2\u0006\u0010D\u001a\u00020\u000fJ\u0006\u0010t\u001a\u00020JJ\u0006\u0010u\u001a\u00020JJ\u0006\u0010v\u001a\u00020JJ\u0006\u0010w\u001a\u00020JJ\u000e\u0010w\u001a\u00020J2\u0006\u0010Y\u001a\u00020\u0019J\u0018\u0010w\u001a\u00020J2\u0006\u0010Y\u001a\u00020\u00192\b\u0010x\u001a\u0004\u0018\u00010\u0001J\u0018\u0010y\u001a\u00020J2\u0006\u0010Y\u001a\u00020\u00192\b\u0010z\u001a\u0004\u0018\u00010\u0001J\"\u0010y\u001a\u00020J2\u0006\u0010Y\u001a\u00020\u00192\b\u0010z\u001a\u0004\u0018\u00010\u00012\b\u0010C\u001a\u0004\u0018\u00010\u0001J\"\u0010{\u001a\u00020J2\u0006\u0010Y\u001a\u00020\u00192\b\u0010z\u001a\u0004\u0018\u00010\u00012\b\u0010|\u001a\u0004\u0018\u00010\u0001J\u0018\u0010{\u001a\u00020J2\u0006\u0010Y\u001a\u00020\u00192\b\u0010|\u001a\u0004\u0018\u00010\u0001J,\u0010w\u001a\u00020J2\u0006\u0010Y\u001a\u00020\u00192\b\u0010z\u001a\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020/2\b\u0010|\u001a\u0004\u0018\u00010\u0001H\u0002J\u0006\u0010}\u001a\u00020\u0019J\u000e\u0010~\u001a\u00020J2\u0006\u00108\u001a\u00020\u0019J\u000e\u0010~\u001a\u00020J2\u0006\u0010D\u001a\u00020\u000fJ\u0006\u0010\u007f\u001a\u00020\u0019J\u0007\u0010\u0080\u0001\u001a\u00020/J\u0010\u0010\u0081\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0082\u0001JQ\u0010\u0083\u0001\u001a\u00020J2\u0006\u0010B\u001a\u00020\u00192=\u0010f\u001a9\u0012\u0015\u0012\u00130\u0019¢\u0006\u000e\b\u0084\u0001\u0012\t\b\u0085\u0001\u0012\u0004\b\b(8\u0012\u0018\u0012\u0016\u0018\u00010\u0001¢\u0006\u000f\b\u0084\u0001\u0012\n\b\u0085\u0001\u0012\u0005\b\b(\u0086\u0001\u0012\u0004\u0012\u00020J0gH\u0086\bJb\u0010\u0087\u0001\u001a\u00020J2\u0006\u0010B\u001a\u00020\u00192&\u0010\u0088\u0001\u001a!\u0012\u0016\u0012\u00140\u0019¢\u0006\u000f\b\u0084\u0001\u0012\n\b\u0085\u0001\u0012\u0005\b\b(\u008a\u0001\u0012\u0004\u0012\u00020J0\u0089\u00012&\u0010\u008b\u0001\u001a!\u0012\u0016\u0012\u00140\u0019¢\u0006\u000f\b\u0084\u0001\u0012\n\b\u0085\u0001\u0012\u0005\b\b(\u008a\u0001\u0012\u0004\u0012\u00020J0\u0089\u0001H\u0086\bJN\u0010\u008c\u0001\u001a\u00020J2\u0006\u0010B\u001a\u00020\u00192=\u0010f\u001a9\u0012\u0015\u0012\u00130\u0019¢\u0006\u000e\b\u0084\u0001\u0012\t\b\u0085\u0001\u0012\u0004\b\b(8\u0012\u0018\u0012\u0016\u0018\u00010\u0001¢\u0006\u000f\b\u0084\u0001\u0012\n\b\u0085\u0001\u0012\u0005\b\b(\u0086\u0001\u0012\u0004\u0012\u00020J0gJ\u0019\u0010\u008d\u0001\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u0019H\u0002J\u0010\u0010\u008e\u0001\u001a\u00020J2\u0007\u0010\u008f\u0001\u001a\u00020\u0019J\u0018\u0010\u0090\u0001\u001a\u00020/2\u0007\u0010\u0091\u0001\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020\u000fJ(\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0\u0093\u00012\u0006\u0010D\u001a\u00020\u000f2\u0007\u0010\u008f\u0001\u001a\u00020\u00192\u0007\u0010\u0094\u0001\u001a\u00020\u0000J)\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0\u0093\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00192\t\b\u0002\u0010\u0096\u0001\u001a\u00020/J\u0007\u0010\u0097\u0001\u001a\u00020JJ'\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0\u0093\u00012\u0007\u0010\u008f\u0001\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0019J\u0010\u0010D\u001a\u00020\u000f2\b\b\u0002\u00108\u001a\u00020\u0019J\u0011\u0010\u0099\u0001\u001a\u00020J2\b\b\u0002\u0010B\u001a\u00020\u0019J\u0011\u0010\u009a\u0001\u001a\u00020/2\u0006\u0010B\u001a\u00020\u0019H\u0002J\u0011\u0010\u009b\u0001\u001a\u00020/2\u0006\u0010B\u001a\u00020\u0019H\u0002J\t\u0010\u009f\u0001\u001a\u00020JH\u0002J\u0011\u0010 \u0001\u001a\u00020J2\u0006\u0010B\u001a\u00020\u0019H\u0002J#\u0010¡\u0001\u001a\u00020J2\u0006\u0010B\u001a\u00020\u00192\u0007\u0010^\u001a\u00030\u009d\u0001H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0011\u0010¤\u0001\u001a\u00020/2\u0006\u0010B\u001a\u00020\u0019H\u0002J\u000f\u0010¥\u0001\u001a\u00020\u00192\u0006\u0010D\u001a\u00020\u000fJ\t\u0010¦\u0001\u001a\u00020WH\u0016J\t\u0010§\u0001\u001a\u00020JH\u0002J\t\u0010¨\u0001\u001a\u00020\u0019H\u0002J\"\u0010©\u0001\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00192\u0006\u0010}\u001a\u00020\u00192\u0007\u0010ª\u0001\u001a\u00020\u0019H\u0002J\u0011\u0010«\u0001\u001a\u00020J2\u0006\u00108\u001a\u00020\u0019H\u0002J\u0019\u0010¬\u0001\u001a\u00020J2\u0006\u00108\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u0019H\u0002J\t\u0010\u00ad\u0001\u001a\u00020JH\u0002J\u0012\u0010®\u0001\u001a\u00020J2\u0007\u0010¯\u0001\u001a\u00020\u0019H\u0002J\u001a\u0010°\u0001\u001a\u00020J2\u0007\u0010¯\u0001\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u0019H\u0002J\u001b\u0010±\u0001\u001a\u00020/2\u0007\u0010²\u0001\u001a\u00020\u00192\u0007\u0010³\u0001\u001a\u00020\u0019H\u0002J\u0019\u0010´\u0001\u001a\u0004\u0018\u00010\u00132\u0006\u0010B\u001a\u00020\u0019H\u0000¢\u0006\u0003\bµ\u0001J\u0019\u0010¶\u0001\u001a\u0004\u0018\u00010\u000f2\u0006\u0010B\u001a\u00020\u0019H\u0000¢\u0006\u0003\b·\u0001J#\u0010¸\u0001\u001a\u00020J2\u0007\u0010²\u0001\u001a\u00020\u00192\u0007\u0010³\u0001\u001a\u00020\u00192\u0006\u0010B\u001a\u00020\u0019H\u0002J\u001b\u0010¹\u0001\u001a\u00020J2\u0006\u00108\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0002J\u001b\u0010º\u0001\u001a\u00020J2\u0007\u0010»\u0001\u001a\u00020\u00192\u0007\u0010¼\u0001\u001a\u00020\u0019H\u0002JC\u0010½\u0001\u001a\u00020/2\u0007\u0010¾\u0001\u001a\u00020\u00192\u0007\u0010¯\u0001\u001a\u00020\u00192&\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014H\u0002J$\u0010¿\u0001\u001a\u00020J2\u0007\u0010À\u0001\u001a\u00020\u00192\u0007\u0010Á\u0001\u001a\u00020\u00192\u0007\u0010¯\u0001\u001a\u00020\u0019H\u0002J\u0007\u0010Â\u0001\u001a\u00020WJ\u001b\u0010Ã\u0001\u001a\u00020J*\b0Ä\u0001j\u0003`Å\u00012\u0006\u00108\u001a\u00020\u0019H\u0002J\u000f\u0010Æ\u0001\u001a\u00020JH\u0000¢\u0006\u0003\bÇ\u0001J\u000f\u0010È\u0001\u001a\u00020JH\u0000¢\u0006\u0003\bÉ\u0001J\u0011\u0010Í\u0001\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u0019H\u0002J\u0012\u0010Î\u0001\u001a\u00020\u00192\u0007\u0010Ï\u0001\u001a\u00020\u0019H\u0002J\u0014\u0010E\u001a\u00020\u0019*\u00020\t2\u0006\u00108\u001a\u00020\u0019H\u0002J\u0011\u0010Ï\u0001\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u0019H\u0002J\u0016\u0010Ï\u0001\u001a\u00020\u0019*\u00020\t2\u0007\u0010Ð\u0001\u001a\u00020\u0019H\u0002J\u0015\u0010a\u001a\u00020\u0019*\u00020\t2\u0007\u0010Ð\u0001\u001a\u00020\u0019H\u0002J\u001f\u0010Ñ\u0001\u001a\u00020J*\u00020\t2\u0007\u0010Ð\u0001\u001a\u00020\u00192\u0007\u0010Ï\u0001\u001a\u00020\u0019H\u0002J\u0016\u0010Ò\u0001\u001a\u00020\u0019*\u00020\t2\u0007\u0010Ð\u0001\u001a\u00020\u0019H\u0002J\u0016\u0010Ó\u0001\u001a\u00020\u0019*\u00020\t2\u0007\u0010Ð\u0001\u001a\u00020\u0019H\u0002J\u0014\u0010Ô\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u0093\u0001*\u00020\tH\u0002J\u0010\u0010Õ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u0093\u0001H\u0002J,\u0010Ö\u0001\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00192\u0007\u0010¾\u0001\u001a\u00020\u00192\u0007\u0010×\u0001\u001a\u00020\u00192\u0007\u0010Ë\u0001\u001a\u00020\u0019H\u0002J#\u0010Ø\u0001\u001a\u00020\u00192\u0006\u0010D\u001a\u00020\u00192\u0007\u0010×\u0001\u001a\u00020\u00192\u0007\u0010Ë\u0001\u001a\u00020\u0019H\u0002J\u001a\u0010Ù\u0001\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u00192\u0007\u0010¾\u0001\u001a\u00020\u0019H\u0002J\u0011\u0010Ú\u0001\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u0019H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010'\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0019@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0019@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0011\u0010.\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b.\u00100R\u0011\u00101\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b2\u0010+R\u0011\u00103\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b3\u00100R\u0011\u00104\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b5\u00100R\u0011\u00106\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b7\u00100R\u001e\u0010E\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0019@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bF\u0010+R\u001e\u0010G\u001a\u00020/2\u0006\u0010(\u001a\u00020/@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u00100R\u0014\u0010n\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010+R\u0015\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u0001X\u0082\u000e¢\u0006\u0005\n\u0003\u0010\u009e\u0001R\u0016\u0010¯\u0001\u001a\u00020\u00198@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010+R\u0016\u0010Ë\u0001\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010+¨\u0006Ü\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "table", "Landroidx/compose/runtime/SlotTable;", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "getTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "groups", "", "slots", "", "[Ljava/lang/Object;", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "calledByMap", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "groupGapStart", "", "groupGapLen", "currentSlot", "currentSlotEnd", "slotsGapStart", "slotsGapLen", "slotsGapOwner", "insertCount", "nodeCount", "startStack", "Landroidx/compose/runtime/IntStack;", "endStack", "nodeCountStack", "deferredSlotWrites", "Landroidx/collection/MutableObjectList;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "currentGroup", "getCurrentGroup", "()I", "currentGroupEnd", "getCurrentGroupEnd", "isGroupEnd", "", "()Z", "slotsSize", "getSlotsSize", "isNode", "collectingSourceInformation", "getCollectingSourceInformation", "collectingCalledInformation", "getCollectingCalledInformation", "index", "groupKey", "groupObjectKey", "isValid", "hasObjectKey", "groupSize", "groupAux", "indexInParent", "indexInCurrentGroup", "indexInGroup", "group", "node", "anchor", "parent", "getParent", "closed", "getClosed", "close", "", "normalClose", CourseConfigKeyConstantsKt.KEY_RESET, "update", "rawUpdate", "appendSlot", "trimTailSlots", "count", "updateAux", "insertAux", "updateToTableMaps", "recordGroupSourceInformation", "sourceInformation", "", "recordGrouplessCallSourceInformationStart", "key", "recordGrouplessCallSourceInformationEnd", "groupSourceInformationFor", "updateNode", "updateParentNode", "set", "slotIndexOfGroupSlotIndex", "clear", "slotIndex", "skip", "slot", "groupIndex", "forEachTailSlot", "block", "Lkotlin/Function2;", "slotsStartIndex", "slotsStartIndex$runtime", "slotsEndIndex", "slotsEndIndex$runtime", "slotsEndAllIndex", "slotsEndAllIndex$runtime", "currentGroupSlotIndex", "getCurrentGroupSlotIndex", "groupSlotIndex", "advanceBy", "amount", "seek", "skipToGroupEnd", "beginInsert", "endInsert", "startGroup", "dataKey", "startNode", "objectKey", "startData", "aux", "endGroup", "ensureStarted", "skipGroup", "removeGroup", "groupSlots", "", "forAllData", "Lkotlin/ParameterName;", "name", "data", "traverseGroupAndChildren", "enter", "Lkotlin/Function1;", "child", "exit", "forAllDataInRememberOrder", "childGroupAtIndex", "moveGroup", "offset", "inGroup", "groupAnchor", "moveTo", "", "writer", "moveFrom", "removeSourceGroup", "bashCurrentGroup", "moveIntoGroupFrom", "markGroup", "containsGroupMark", "containsAnyGroupMarks", "pendingRecalculateMarks", "Landroidx/compose/runtime/PrioritySet;", "Landroidx/collection/MutableIntList;", "recalculateMarks", "updateContainsMark", "updateContainsMarkNow", "updateContainsMarkNow-XpTMRCE", "(ILandroidx/collection/MutableIntList;)V", "childContainsAnyMarks", "anchorIndex", "toString", "saveCurrentGroupEnd", "restoreCurrentGroupEnd", "fixParentAnchorsFor", "firstChild", "moveGroupGapTo", "moveSlotGapTo", "clearSlotGap", "insertGroups", "size", "insertSlots", "removeGroups", TtmlNode.START, "len", "sourceInformationOf", "sourceInformationOf$runtime", "tryAnchor", "tryAnchor$runtime", "removeSlots", "updateNodeOfGroup", "updateAnchors", "previousGapStart", "newGapStart", "removeAnchors", "gapStart", "moveAnchors", "originalLocation", "newLocation", "toDebugString", "groupAsString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "verifyDataAnchors", "verifyDataAnchors$runtime", "verifyParentAnchors", "verifyParentAnchors$runtime", "getSize$runtime", "capacity", "getCapacity", "groupIndexToAddress", "dataIndexToDataAddress", "dataIndex", "address", "updateDataIndex", "nodeIndex", "auxIndex", "dataIndexes", "keys", "dataIndexToDataAnchor", "gapLen", "dataAnchorToDataIndex", "parentIndexToAnchor", "parentAnchorToIndex", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setEncoding {
    public static final write AudioAttributesCompatParcelizer = new write(null);
    public static final int RemoteActionCompatParcelizer = 8;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private ArrayList<_parseSlowFloat> IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private setProvider<setDropDownBackgroundResource<Object>> MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private int[] MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private setExpandActivityOverflowButtonDrawable handleMediaPlayPauseIfPendingOnHandler;
    private Object[] onCustomAction;
    private int onFastForward;
    private int onMediaButtonEvent;
    private int onPause;
    private HashMap<_parseSlowFloat, filterFinishObject> onPlayFromMediaId;
    private final releaseTokenBuffer onPrepareFromMediaId;
    private setProvider<setBackgroundDrawable> read;
    private boolean write;
    private final filterFinishArray onPlay = new filterFinishArray();
    private final filterFinishArray RatingCompat = new filterFinishArray();
    private final filterFinishArray onAddQueueItem = new filterFinishArray();
    private int onCommand = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public final int RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    private final int write(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    public setEncoding(releaseTokenBuffer releasetokenbuffer) {
        this.onPrepareFromMediaId = releasetokenbuffer;
        this.MediaBrowserCompatSearchResultReceiver = releasetokenbuffer.getRead();
        this.onCustomAction = releasetokenbuffer.getMediaBrowserCompatCustomActionResultReceiver();
        this.IconCompatParcelizer = releasetokenbuffer.RemoteActionCompatParcelizer();
        this.onPlayFromMediaId = releasetokenbuffer.MediaBrowserCompatSearchResultReceiver();
        this.read = releasetokenbuffer.AudioAttributesImplApi26Parcelizer();
        this.MediaDescriptionCompat = releasetokenbuffer.getRemoteActionCompatParcelizer();
        this.MediaBrowserCompatMediaItem = (this.MediaBrowserCompatSearchResultReceiver.length / 5) - releasetokenbuffer.getRemoteActionCompatParcelizer();
        this.onMediaButtonEvent = releasetokenbuffer.getAudioAttributesImplBaseParcelizer();
        this.onPause = this.onCustomAction.length - releasetokenbuffer.getAudioAttributesImplBaseParcelizer();
        this.onFastForward = releasetokenbuffer.getRemoteActionCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = releasetokenbuffer.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final releaseTokenBuffer getOnPrepareFromMediaId() {
        return this.onPrepareFromMediaId;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean RatingCompat() {
        return this.AudioAttributesImplApi26Parcelizer == this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        int i = this.AudioAttributesImplApi26Parcelizer;
        return i < this.MediaBrowserCompatCustomActionResultReceiver && (this.MediaBrowserCompatSearchResultReceiver[(onPlayFromUri(i) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.onPlayFromMediaId != null;
    }

    public final boolean read() {
        return this.read != null;
    }

    public final boolean MediaMetadataCompat(int i) {
        return (this.MediaBrowserCompatSearchResultReceiver[(onPlayFromUri(i) * 5) + 1] & 1073741824) != 0;
    }

    public final int handleMediaPlayPauseIfPendingOnHandler(int i) {
        return this.MediaBrowserCompatSearchResultReceiver[(onPlayFromUri(i) * 5) + 1] & 67108863;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver(int i) {
        return this.MediaBrowserCompatSearchResultReceiver[onPlayFromUri(i) * 5];
    }

    public final Object AudioAttributesImplApi21Parcelizer(int i) {
        int iOnPlayFromUri = onPlayFromUri(i);
        int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
        if ((iArr[(iOnPlayFromUri * 5) + 1] & 536870912) != 0) {
            return this.onCustomAction[InputDecorator.AudioAttributesImplApi26Parcelizer(iArr, iOnPlayFromUri)];
        }
        return null;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver(int i) {
        return onPlayFromUri(i) * 5 < this.MediaBrowserCompatSearchResultReceiver.length;
    }

    public final boolean AudioAttributesImplApi26Parcelizer(int i) {
        return (this.MediaBrowserCompatSearchResultReceiver[(onPlayFromUri(i) * 5) + 1] & 536870912) != 0;
    }

    public final int AudioAttributesImplBaseParcelizer(int i) {
        return InputDecorator.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i));
    }

    public final Object IconCompatParcelizer(int i) {
        int iOnPlayFromUri = onPlayFromUri(i);
        int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
        return (iArr[(iOnPlayFromUri * 5) + 1] & 268435456) != 0 ? this.onCustomAction[AudioAttributesCompatParcelizer(iArr, iOnPlayFromUri)] : _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
    }

    public final boolean MediaDescriptionCompat(int i) {
        int i2 = this.onCommand;
        if (i <= i2 || i >= this.MediaBrowserCompatCustomActionResultReceiver) {
            return i2 == 0 && i == 0;
        }
        return true;
    }

    public final boolean RatingCompat(int i) {
        return write(i, this.AudioAttributesImplApi26Parcelizer);
    }

    public final boolean write(int i, int i2) {
        int i3;
        int iOnPlay;
        if (i2 == this.onCommand) {
            iOnPlay = this.MediaBrowserCompatCustomActionResultReceiver;
        } else if (i2 > this.onPlay.write(0) || (i3 = this.onPlay.read(i2)) < 0) {
            int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i2);
            iOnPlay = iAudioAttributesImplBaseParcelizer + i2;
        } else {
            iOnPlay = (onPlay() - this.MediaBrowserCompatMediaItem) - this.RatingCompat.AudioAttributesCompatParcelizer(i3);
        }
        return i > i2 && i < iOnPlay;
    }

    public final Object onCustomAction(int i) {
        int iOnPlayFromUri = onPlayFromUri(i);
        int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
        if ((iArr[(iOnPlayFromUri * 5) + 1] & 1073741824) != 0) {
            return this.onCustomAction[onPrepare(write(iArr, iOnPlayFromUri))];
        }
        return null;
    }

    public final Object write(_parseSlowFloat _parseslowfloat) {
        return onCustomAction(_parseslowfloat.IconCompatParcelizer(this));
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getOnCommand() {
        return this.onCommand;
    }

    public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(int i) {
        return IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, i);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public final void read(boolean z) {
        this.write = true;
        if (z && this.onPlay.AudioAttributesCompatParcelizer == 0) {
            onRemoveQueueItem(MediaBrowserCompatCustomActionResultReceiver());
            MediaBrowserCompatCustomActionResultReceiver(this.onCustomAction.length - this.onPause, this.MediaDescriptionCompat);
            onPause();
            onMediaButtonEvent();
        }
        this.onPrepareFromMediaId.AudioAttributesCompatParcelizer(this, this.MediaBrowserCompatSearchResultReceiver, this.MediaDescriptionCompat, this.onCustomAction, this.onMediaButtonEvent, this.IconCompatParcelizer, this.onPlayFromMediaId, this.read);
    }

    public final void MediaDescriptionCompat() {
        if (this.MediaMetadataCompat != 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Cannot reset when inserting");
        }
        onMediaButtonEvent();
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = onPlay() - this.MediaBrowserCompatMediaItem;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = 0;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
    }

    public final Object AudioAttributesCompatParcelizer(Object obj) {
        if (this.MediaMetadataCompat > 0 && this.AudioAttributesImplBaseParcelizer != this.onMediaButtonEvent) {
            setProvider<setDropDownBackgroundResource<Object>> setprovider = this.MediaBrowserCompatItemReceiver;
            MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
            int i = 1;
            int i2 = 0;
            if (setprovider == null) {
                setprovider = new setProvider<>(i2, i, magicModuleRepositoryImplExternalSyntheticLambda0);
            }
            this.MediaBrowserCompatItemReceiver = setprovider;
            int i3 = this.onCommand;
            setDropDownBackgroundResource<Object> setdropdownbackgroundresourceAudioAttributesCompatParcelizer = setprovider.AudioAttributesCompatParcelizer(i3);
            if (setdropdownbackgroundresourceAudioAttributesCompatParcelizer == null) {
                setdropdownbackgroundresourceAudioAttributesCompatParcelizer = new setDropDownBackgroundResource<>(i2, i, magicModuleRepositoryImplExternalSyntheticLambda0);
                setprovider.write(i3, setdropdownbackgroundresourceAudioAttributesCompatParcelizer);
            }
            setdropdownbackgroundresourceAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(obj);
            return _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
        }
        return RemoteActionCompatParcelizer(obj);
    }

    private final Object RemoteActionCompatParcelizer(Object obj) {
        Object objOnCustomAction = onCustomAction();
        write(obj);
        return objOnCustomAction;
    }

    public final void RemoteActionCompatParcelizer(_parseSlowFloat _parseslowfloat, Object obj) {
        if (this.MediaMetadataCompat != 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Can only append a slot if not current inserting");
        }
        int i = this.AudioAttributesImplBaseParcelizer;
        int i2 = this.AudioAttributesImplApi21Parcelizer;
        int i3 = read(_parseslowfloat);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i3 + 1));
        this.AudioAttributesImplBaseParcelizer = iRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = iRemoteActionCompatParcelizer;
        AudioAttributesCompatParcelizer(1, i3);
        if (i >= iRemoteActionCompatParcelizer) {
            i++;
            i2++;
        }
        this.onCustomAction[iRemoteActionCompatParcelizer] = obj;
        this.AudioAttributesImplBaseParcelizer = i;
        this.AudioAttributesImplApi21Parcelizer = i2;
    }

    public final void IconCompatParcelizer(Object obj) {
        int iOnPlayFromUri = onPlayFromUri(this.AudioAttributesImplApi26Parcelizer);
        if ((this.MediaBrowserCompatSearchResultReceiver[(iOnPlayFromUri * 5) + 1] & 268435456) == 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Updating the data of a group that was not created with a data slot");
        }
        this.onCustomAction[onPrepare(AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, iOnPlayFromUri))] = obj;
    }

    public final void handleMediaPlayPauseIfPendingOnHandler() {
        this.onPlayFromMediaId = this.onPrepareFromMediaId.MediaBrowserCompatSearchResultReceiver();
        this.read = this.onPrepareFromMediaId.AudioAttributesImplApi26Parcelizer();
    }

    public final void read(Object obj) {
        write(this.AudioAttributesImplApi26Parcelizer, obj);
    }

    public final void read(_parseSlowFloat _parseslowfloat, Object obj) {
        write(_parseslowfloat.IconCompatParcelizer(this), obj);
    }

    public final void write(Object obj) {
        if (this.AudioAttributesImplBaseParcelizer > this.AudioAttributesImplApi21Parcelizer) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Writing to an invalid slot");
        }
        this.onCustomAction[onPrepare(this.AudioAttributesImplBaseParcelizer - 1)] = obj;
    }

    public final int IconCompatParcelizer(int i, int i2) {
        int i3 = read(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i));
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i + 1));
        int i4 = i3 + i2;
        if (i4 < i3 || i4 >= iRemoteActionCompatParcelizer) {
            StringBuilder sb = new StringBuilder("Write to an invalid slot index ");
            sb.append(i2);
            sb.append(" for group ");
            sb.append(i);
            _validJsonValueList.AudioAttributesCompatParcelizer(sb.toString());
        }
        return i4;
    }

    public final Object RemoteActionCompatParcelizer(int i, int i2, Object obj) {
        int iOnPrepare = onPrepare(IconCompatParcelizer(i, i2));
        Object[] objArr = this.onCustomAction;
        Object obj2 = objArr[iOnPrepare];
        objArr[iOnPrepare] = obj;
        return obj2;
    }

    public final Object RemoteActionCompatParcelizer(int i) {
        int iOnPrepare = onPrepare(i);
        Object[] objArr = this.onCustomAction;
        Object obj = objArr[iOnPrepare];
        objArr[iOnPrepare] = _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
        return obj;
    }

    public final Object onCustomAction() {
        if (this.MediaMetadataCompat > 0) {
            AudioAttributesCompatParcelizer(1, this.onCommand);
        }
        Object[] objArr = this.onCustomAction;
        int i = this.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesImplBaseParcelizer = i + 1;
        return objArr[onPrepare(i)];
    }

    public final Object AudioAttributesCompatParcelizer(_parseSlowFloat _parseslowfloat, int i) {
        return RemoteActionCompatParcelizer(read(_parseslowfloat), i);
    }

    public final Object RemoteActionCompatParcelizer(int i, int i2) {
        int i3 = read(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i));
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i + 1));
        int i4 = i2 + i3;
        if (i3 > i4 || i4 >= iRemoteActionCompatParcelizer) {
            return _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
        }
        return this.onCustomAction[onPrepare(i4)];
    }

    public final int onMediaButtonEvent(int i) {
        return read(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i));
    }

    public final int onAddQueueItem(int i) {
        return RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i + 1));
    }

    public final int MediaBrowserCompatItemReceiver(int i) {
        setDropDownBackgroundResource<Object> setdropdownbackgroundresourceAudioAttributesCompatParcelizer;
        int i2 = this.AudioAttributesImplBaseParcelizer;
        int iOnMediaButtonEvent = onMediaButtonEvent(i);
        setProvider<setDropDownBackgroundResource<Object>> setprovider = this.MediaBrowserCompatItemReceiver;
        return (i2 - iOnMediaButtonEvent) + ((setprovider == null || (setdropdownbackgroundresourceAudioAttributesCompatParcelizer = setprovider.AudioAttributesCompatParcelizer(i)) == null) ? 0 : setdropdownbackgroundresourceAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer());
    }

    public final void IconCompatParcelizer(_parseSlowFloat _parseslowfloat) {
        write(_parseslowfloat.IconCompatParcelizer(this) - this.AudioAttributesImplApi26Parcelizer);
    }

    public final void onCommand() {
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        this.AudioAttributesImplApi26Parcelizer = i;
        this.AudioAttributesImplBaseParcelizer = RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i));
    }

    public final void AudioAttributesCompatParcelizer() {
        int i = this.MediaMetadataCompat;
        this.MediaMetadataCompat = i + 1;
        if (i == 0) {
            onPlayFromMediaId();
        }
    }

    public final void write() {
        if (this.MediaMetadataCompat <= 0) {
            getInputCodeUtf8JsNames.read("Unbalanced begin/end insert");
        }
        int i = this.MediaMetadataCompat - 1;
        this.MediaMetadataCompat = i;
        if (i == 0) {
            if (this.onAddQueueItem.AudioAttributesCompatParcelizer != this.onPlay.AudioAttributesCompatParcelizer) {
                _validJsonValueList.AudioAttributesCompatParcelizer("startGroup/endGroup mismatch while inserting");
            }
            onFastForward();
        }
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (this.MediaMetadataCompat != 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Key must be supplied when inserting");
        }
        write(0, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer(), false, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer());
    }

    public final void RemoteActionCompatParcelizer(int i, Object obj) {
        write(i, obj, false, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer());
    }

    public final void read(int i, Object obj) {
        write(i, obj, true, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer());
    }

    public final void write(int i, Object obj, Object obj2) {
        write(i, obj, false, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void write(int i, Object obj, boolean z, Object obj2) {
        int iAudioAttributesImplApi21Parcelizer;
        filterFinishObject filterfinishobjectOnPlay;
        int i2 = this.onCommand;
        Object[] objArr = this.MediaMetadataCompat > 0;
        this.onAddQueueItem.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (objArr != false) {
            int i3 = this.AudioAttributesImplApi26Parcelizer;
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i3));
            onSeekTo(1);
            this.AudioAttributesImplBaseParcelizer = iRemoteActionCompatParcelizer;
            this.AudioAttributesImplApi21Parcelizer = iRemoteActionCompatParcelizer;
            int iOnPlayFromUri = onPlayFromUri(i3);
            int i4 = obj != _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer() ? 1 : 0;
            int i5 = (z || obj2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) ? 0 : 1;
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, this.onMediaButtonEvent, this.onPause, this.onCustomAction.length);
            if (iRemoteActionCompatParcelizer2 >= 0 && this.onFastForward < i3) {
                iRemoteActionCompatParcelizer2 = -(((this.onCustomAction.length - this.onPause) - iRemoteActionCompatParcelizer2) + 1);
            }
            InputDecorator.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, iOnPlayFromUri, i, z, i4, i5, this.onCommand, iRemoteActionCompatParcelizer2);
            int i6 = (z ? 1 : 0) + i4 + i5;
            if (i6 > 0) {
                AudioAttributesCompatParcelizer(i6, i3);
                Object[] objArr2 = this.onCustomAction;
                int i7 = this.AudioAttributesImplBaseParcelizer;
                if (z) {
                    objArr2[i7] = obj2;
                    i7++;
                }
                if (i4 != 0) {
                    objArr2[i7] = obj;
                    i7++;
                }
                if (i5 != 0) {
                    objArr2[i7] = obj2;
                    i7++;
                }
                this.AudioAttributesImplBaseParcelizer = i7;
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
            iAudioAttributesImplApi21Parcelizer = i3 + 1;
            this.onCommand = i3;
            this.AudioAttributesImplApi26Parcelizer = iAudioAttributesImplApi21Parcelizer;
            if (i2 >= 0 && (filterfinishobjectOnPlay = onPlay(i2)) != null) {
                filterfinishobjectOnPlay.write(this, i3);
            }
        } else {
            this.onPlay.RemoteActionCompatParcelizer(i2);
            onPlayFromMediaId();
            int i8 = this.AudioAttributesImplApi26Parcelizer;
            int iOnPlayFromUri2 = onPlayFromUri(i8);
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer())) {
                if (z) {
                    read(obj2);
                } else {
                    IconCompatParcelizer(obj2);
                }
            }
            this.AudioAttributesImplBaseParcelizer = read(this.MediaBrowserCompatSearchResultReceiver, iOnPlayFromUri2);
            this.AudioAttributesImplApi21Parcelizer = RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(this.AudioAttributesImplApi26Parcelizer + 1));
            int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iArr[(iOnPlayFromUri2 * 5) + 1] & 67108863;
            this.onCommand = i8;
            this.AudioAttributesImplApi26Parcelizer = i8 + 1;
            iAudioAttributesImplApi21Parcelizer = i8 + InputDecorator.AudioAttributesImplApi21Parcelizer(iArr, iOnPlayFromUri2);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = iAudioAttributesImplApi21Parcelizer;
    }

    public final int RemoteActionCompatParcelizer() {
        setDropDownBackgroundResource<Object> setdropdownbackgroundresourceAudioAttributesCompatParcelizer;
        boolean z = this.MediaMetadataCompat > 0;
        int i = this.AudioAttributesImplApi26Parcelizer;
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i3 = this.onCommand;
        int iOnPlayFromUri = onPlayFromUri(i3);
        int i4 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i5 = i - i3;
        int i6 = (iOnPlayFromUri * 5) + 1;
        boolean z2 = (this.MediaBrowserCompatSearchResultReceiver[i6] & 1073741824) != 0;
        if (!z) {
            if (i != i2) {
                _validJsonValueList.AudioAttributesCompatParcelizer("Expected to be at the end of a group");
            }
            int iAudioAttributesImplApi21Parcelizer = InputDecorator.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver, iOnPlayFromUri);
            int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
            int i7 = iArr[i6] & 67108863;
            InputDecorator.write(iArr, iOnPlayFromUri, i5);
            InputDecorator.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, iOnPlayFromUri, i4);
            int iAudioAttributesCompatParcelizer = this.onPlay.AudioAttributesCompatParcelizer();
            onFastForward();
            this.onCommand = iAudioAttributesCompatParcelizer;
            int iIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, i3);
            int iAudioAttributesCompatParcelizer2 = this.onAddQueueItem.AudioAttributesCompatParcelizer();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iAudioAttributesCompatParcelizer2;
            if (iIconCompatParcelizer == iAudioAttributesCompatParcelizer) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iAudioAttributesCompatParcelizer2 + (z2 ? 0 : i4 - i7);
                return i4;
            }
            int i8 = i5 - iAudioAttributesImplApi21Parcelizer;
            int i9 = z2 ? 0 : i4 - i7;
            if (i8 != 0 || i9 != 0) {
                while (iIconCompatParcelizer != 0 && iIconCompatParcelizer != iAudioAttributesCompatParcelizer && (i9 != 0 || i8 != 0)) {
                    int iOnPlayFromUri2 = onPlayFromUri(iIconCompatParcelizer);
                    if (i8 != 0) {
                        InputDecorator.write(this.MediaBrowserCompatSearchResultReceiver, iOnPlayFromUri2, InputDecorator.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver, iOnPlayFromUri2) + i8);
                    }
                    if (i9 != 0) {
                        int[] iArr2 = this.MediaBrowserCompatSearchResultReceiver;
                        InputDecorator.RemoteActionCompatParcelizer(iArr2, iOnPlayFromUri2, (iArr2[(iOnPlayFromUri2 * 5) + 1] & 67108863) + i9);
                    }
                    int[] iArr3 = this.MediaBrowserCompatSearchResultReceiver;
                    if ((iArr3[(iOnPlayFromUri2 * 5) + 1] & 1073741824) != 0) {
                        i9 = 0;
                    }
                    iIconCompatParcelizer = IconCompatParcelizer(iArr3, iIconCompatParcelizer);
                }
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver += i9;
            return i4;
        }
        setProvider<setDropDownBackgroundResource<Object>> setprovider = this.MediaBrowserCompatItemReceiver;
        if (setprovider != null && (setdropdownbackgroundresourceAudioAttributesCompatParcelizer = setprovider.AudioAttributesCompatParcelizer(i3)) != null) {
            setDropDownBackgroundResource<Object> setdropdownbackgroundresource = setdropdownbackgroundresourceAudioAttributesCompatParcelizer;
            Object[] objArr = setdropdownbackgroundresource.IconCompatParcelizer;
            int i10 = setdropdownbackgroundresource.RemoteActionCompatParcelizer;
            for (int i11 = 0; i11 < i10; i11++) {
                RemoteActionCompatParcelizer(objArr[i11]);
            }
            setprovider.RemoteActionCompatParcelizer(i3);
        }
        InputDecorator.write(this.MediaBrowserCompatSearchResultReceiver, iOnPlayFromUri, i5);
        InputDecorator.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, iOnPlayFromUri, i4);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.onAddQueueItem.AudioAttributesCompatParcelizer() + (z2 ? 1 : i4);
        int iIconCompatParcelizer2 = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, i3);
        this.onCommand = iIconCompatParcelizer2;
        int iMediaBrowserCompatCustomActionResultReceiver = iIconCompatParcelizer2 < 0 ? MediaBrowserCompatCustomActionResultReceiver() : onPlayFromUri(iIconCompatParcelizer2 + 1);
        int iRemoteActionCompatParcelizer = iMediaBrowserCompatCustomActionResultReceiver >= 0 ? RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, iMediaBrowserCompatCustomActionResultReceiver) : 0;
        this.AudioAttributesImplBaseParcelizer = iRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = iRemoteActionCompatParcelizer;
        return i4;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        if (this.MediaMetadataCompat > 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.onCommand;
        if (i2 != i) {
            if (i < i2 || i >= this.MediaBrowserCompatCustomActionResultReceiver) {
                StringBuilder sb = new StringBuilder("Started group at ");
                sb.append(i);
                sb.append(" must be a subgroup of the group at ");
                sb.append(i2);
                _validJsonValueList.AudioAttributesCompatParcelizer(sb.toString());
            }
            int i3 = this.AudioAttributesImplApi26Parcelizer;
            int i4 = this.AudioAttributesImplBaseParcelizer;
            int i5 = this.AudioAttributesImplApi21Parcelizer;
            this.AudioAttributesImplApi26Parcelizer = i;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            this.AudioAttributesImplApi26Parcelizer = i3;
            this.AudioAttributesImplBaseParcelizer = i4;
            this.AudioAttributesImplApi21Parcelizer = i5;
        }
    }

    public final void RemoteActionCompatParcelizer(_parseSlowFloat _parseslowfloat) {
        AudioAttributesCompatParcelizer(_parseslowfloat.IconCompatParcelizer(this));
    }

    public final int onAddQueueItem() {
        int iOnPlayFromUri = onPlayFromUri(this.AudioAttributesImplApi26Parcelizer);
        int iAudioAttributesImplApi21Parcelizer = this.AudioAttributesImplApi26Parcelizer + InputDecorator.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver, iOnPlayFromUri);
        this.AudioAttributesImplApi26Parcelizer = iAudioAttributesImplApi21Parcelizer;
        this.AudioAttributesImplBaseParcelizer = RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(iAudioAttributesImplApi21Parcelizer));
        int i = this.MediaBrowserCompatSearchResultReceiver[(iOnPlayFromUri * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        _parseSlowFloat _parseslowfloatOnFastForward;
        if (this.MediaMetadataCompat != 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Cannot remove group while inserting");
        }
        int i = this.AudioAttributesImplApi26Parcelizer;
        int i2 = this.AudioAttributesImplBaseParcelizer;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i));
        int iOnAddQueueItem = onAddQueueItem();
        filterFinishObject filterfinishobjectOnPlay = onPlay(this.onCommand);
        if (filterfinishobjectOnPlay != null && (_parseslowfloatOnFastForward = onFastForward(i)) != null) {
            filterfinishobjectOnPlay.write(_parseslowfloatOnFastForward);
        }
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = this.handleMediaPlayPauseIfPendingOnHandler;
        if (setexpandactivityoverflowbuttondrawable != null) {
            while (getInputCodeLatin1JsNames.IconCompatParcelizer(setexpandactivityoverflowbuttondrawable) && getInputCodeLatin1JsNames.RemoteActionCompatParcelizer(setexpandactivityoverflowbuttondrawable) >= i) {
                getInputCodeLatin1JsNames.AudioAttributesCompatParcelizer(setexpandactivityoverflowbuttondrawable);
            }
        }
        boolean zAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i, this.AudioAttributesImplApi26Parcelizer - i);
        RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer - iRemoteActionCompatParcelizer, i - 1);
        this.AudioAttributesImplApi26Parcelizer = i;
        this.AudioAttributesImplBaseParcelizer = i2;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver -= iOnAddQueueItem;
        return zAudioAttributesImplApi26Parcelizer;
    }

    private final int read(int i, int i2) {
        int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i) + i;
        int iAudioAttributesImplApi21Parcelizer = i + 1;
        int i3 = 0;
        while (iAudioAttributesImplApi21Parcelizer < iAudioAttributesImplBaseParcelizer && i3 < i2) {
            int iOnPlayFromUri = onPlayFromUri(iAudioAttributesImplApi21Parcelizer);
            iAudioAttributesImplApi21Parcelizer += InputDecorator.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver, iOnPlayFromUri);
            if (iAudioAttributesImplApi21Parcelizer < iAudioAttributesImplBaseParcelizer && (this.MediaBrowserCompatSearchResultReceiver[(iOnPlayFromUri * 5) + 1] & 536870912) == 0) {
                i3++;
            }
        }
        return iAudioAttributesImplApi21Parcelizer;
    }

    public final void onCommand(int i) {
        int i2;
        if (this.MediaMetadataCompat != 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Cannot move a group while inserting");
        }
        if (i < 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Parameter offset is out of bounds");
        }
        if (i != 0) {
            int i3 = this.AudioAttributesImplApi26Parcelizer;
            int i4 = this.onCommand;
            int i5 = this.MediaBrowserCompatCustomActionResultReceiver;
            int iAudioAttributesImplApi21Parcelizer = i3;
            for (int i6 = i; i6 > 0; i6--) {
                iAudioAttributesImplApi21Parcelizer += InputDecorator.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(iAudioAttributesImplApi21Parcelizer));
                if (iAudioAttributesImplApi21Parcelizer > i5) {
                    _validJsonValueList.AudioAttributesCompatParcelizer("Parameter offset is out of bounds");
                }
            }
            int iAudioAttributesImplApi21Parcelizer2 = InputDecorator.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(iAudioAttributesImplApi21Parcelizer));
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(this.AudioAttributesImplApi26Parcelizer));
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(iAudioAttributesImplApi21Parcelizer));
            int i7 = iAudioAttributesImplApi21Parcelizer + iAudioAttributesImplApi21Parcelizer2;
            int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i7));
            int i8 = iRemoteActionCompatParcelizer3 - iRemoteActionCompatParcelizer2;
            int i9 = 0;
            AudioAttributesCompatParcelizer(i8, Math.max(this.AudioAttributesImplApi26Parcelizer - 1, 0));
            onSeekTo(iAudioAttributesImplApi21Parcelizer2);
            int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
            int iOnPlayFromUri = onPlayFromUri(i7) * 5;
            getOrderDetails.read(iArr, iArr, onPlayFromUri(i3) * 5, iOnPlayFromUri, (iAudioAttributesImplApi21Parcelizer2 * 5) + iOnPlayFromUri);
            if (i8 > 0) {
                Object[] objArr = this.onCustomAction;
                int iOnPrepare = onPrepare(iRemoteActionCompatParcelizer2 + i8);
                System.arraycopy(objArr, iOnPrepare, objArr, iRemoteActionCompatParcelizer, onPrepare(iRemoteActionCompatParcelizer3 + i8) - iOnPrepare);
            }
            int i10 = iRemoteActionCompatParcelizer2 + i8;
            int i11 = i10 - iRemoteActionCompatParcelizer;
            int i12 = this.onMediaButtonEvent;
            int i13 = this.onPause;
            int length = this.onCustomAction.length;
            int i14 = this.onFastForward;
            int i15 = i3;
            while (i15 < i3 + iAudioAttributesImplApi21Parcelizer2) {
                int iOnPlayFromUri2 = onPlayFromUri(i15);
                int iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(iArr, iOnPlayFromUri2);
                if (i14 < iOnPlayFromUri2) {
                    i2 = i12;
                } else {
                    i9 = i12;
                    i2 = i9;
                }
                read(iArr, iOnPlayFromUri2, RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer4 - i11, i9, i13, length));
                i15++;
                i12 = i2;
                i9 = 0;
            }
            read(i7, i3, iAudioAttributesImplApi21Parcelizer2);
            if (AudioAttributesImplApi26Parcelizer(i7, iAudioAttributesImplApi21Parcelizer2)) {
                _validJsonValueList.AudioAttributesCompatParcelizer("Unexpectedly removed anchors");
            }
            AudioAttributesCompatParcelizer(i4, this.MediaBrowserCompatCustomActionResultReceiver, i3);
            if (i8 > 0) {
                RemoteActionCompatParcelizer(i10, i8, i7 - 1);
            }
        }
    }

    public final boolean IconCompatParcelizer(_parseSlowFloat _parseslowfloat, _parseSlowFloat _parseslowfloat2) {
        int i = read(_parseslowfloat);
        int iAudioAttributesImplApi21Parcelizer = InputDecorator.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver, i);
        int iconCompatParcelizer = _parseslowfloat2.getIconCompatParcelizer();
        return i <= iconCompatParcelizer && iconCompatParcelizer < iAudioAttributesImplApi21Parcelizer + i;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/setEncoding$write;", "", "<init>", "()V", "Lo/setEncoding;", "p0", "", "p1", "p2", "", "p3", "p4", "p5", "", "Lo/_parseSlowFloat;", "IconCompatParcelizer", "(Lo/setEncoding;ILo/setEncoding;ZZZ)Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        static /* synthetic */ List IconCompatParcelizer$default(write writeVar, setEncoding setencoding, int i, setEncoding setencoding2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                z3 = true;
            }
            return writeVar.IconCompatParcelizer(setencoding, i, setencoding2, z, z2, z3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<_parseSlowFloat> IconCompatParcelizer(setEncoding p0, int p1, setEncoding p2, boolean p3, boolean p4, boolean p5) {
            ArrayList arrayListRemoteActionCompatParcelizer;
            boolean zMediaBrowserCompatSearchResultReceiver;
            int iAudioAttributesImplBaseParcelizer = p0.AudioAttributesImplBaseParcelizer(p1);
            int i = p1 + iAudioAttributesImplBaseParcelizer;
            int iOnPrepareFromSearch = p0.onPrepareFromSearch(p1);
            int iOnPrepareFromSearch2 = p0.onPrepareFromSearch(i);
            int i2 = iOnPrepareFromSearch2 - iOnPrepareFromSearch;
            boolean zOnPrepareFromMediaId = p0.onPrepareFromMediaId(p1);
            p2.onSeekTo(iAudioAttributesImplBaseParcelizer);
            p2.AudioAttributesCompatParcelizer(i2, p2.getAudioAttributesImplApi26Parcelizer());
            if (p0.MediaDescriptionCompat < i) {
                p0.onRemoveQueueItem(i);
            }
            if (p0.onMediaButtonEvent < iOnPrepareFromSearch2) {
                p0.MediaBrowserCompatCustomActionResultReceiver(iOnPrepareFromSearch2, i);
            }
            int[] iArr = p2.MediaBrowserCompatSearchResultReceiver;
            int audioAttributesImplApi26Parcelizer = p2.getAudioAttributesImplApi26Parcelizer();
            int i3 = audioAttributesImplApi26Parcelizer * 5;
            getOrderDetails.read(p0.MediaBrowserCompatSearchResultReceiver, iArr, i3, p1 * 5, i * 5);
            Object[] objArr = p2.onCustomAction;
            int i4 = p2.AudioAttributesImplBaseParcelizer;
            System.arraycopy(p0.onCustomAction, iOnPrepareFromSearch, objArr, i4, i2);
            int onCommand = p2.getOnCommand();
            iArr[i3 + 2] = onCommand;
            int i5 = audioAttributesImplApi26Parcelizer - p1;
            int i6 = audioAttributesImplApi26Parcelizer + iAudioAttributesImplBaseParcelizer;
            int iRemoteActionCompatParcelizer = p2.RemoteActionCompatParcelizer(iArr, audioAttributesImplApi26Parcelizer);
            int i7 = p2.onFastForward;
            int i8 = p2.onPause;
            int length = objArr.length;
            int i9 = i7;
            int i10 = audioAttributesImplApi26Parcelizer;
            while (true) {
                if (i10 >= i6) {
                    break;
                }
                if (i10 != audioAttributesImplApi26Parcelizer) {
                    int i11 = (i10 * 5) + 2;
                    iArr[i11] = iArr[i11] + i5;
                }
                int i12 = audioAttributesImplApi26Parcelizer;
                int i13 = i4;
                iArr[(i10 * 5) + 4] = p2.RemoteActionCompatParcelizer(p2.RemoteActionCompatParcelizer(iArr, i10) + (i4 - iRemoteActionCompatParcelizer), i9 >= i10 ? p2.onMediaButtonEvent : 0, i8, length);
                if (i10 == i9) {
                    i9++;
                }
                i10++;
                audioAttributesImplApi26Parcelizer = i12;
                i4 = i13;
            }
            int i14 = i4;
            p2.onFastForward = i9;
            int iIconCompatParcelizer = InputDecorator.IconCompatParcelizer((ArrayList<_parseSlowFloat>) p0.IconCompatParcelizer, p1, p0.MediaBrowserCompatCustomActionResultReceiver());
            int iIconCompatParcelizer2 = InputDecorator.IconCompatParcelizer((ArrayList<_parseSlowFloat>) p0.IconCompatParcelizer, i, p0.MediaBrowserCompatCustomActionResultReceiver());
            if (iIconCompatParcelizer < iIconCompatParcelizer2) {
                ArrayList arrayList = p0.IconCompatParcelizer;
                ArrayList arrayList2 = new ArrayList(iIconCompatParcelizer2 - iIconCompatParcelizer);
                for (int i15 = iIconCompatParcelizer; i15 < iIconCompatParcelizer2; i15++) {
                    _parseSlowFloat _parseslowfloat = (_parseSlowFloat) arrayList.get(i15);
                    _parseslowfloat.write(_parseslowfloat.getIconCompatParcelizer() + i5);
                    arrayList2.add(_parseslowfloat);
                }
                p2.IconCompatParcelizer.addAll(InputDecorator.IconCompatParcelizer((ArrayList<_parseSlowFloat>) p2.IconCompatParcelizer, p2.getAudioAttributesImplApi26Parcelizer(), p2.MediaBrowserCompatCustomActionResultReceiver()), arrayList2);
                arrayList.subList(iIconCompatParcelizer, iIconCompatParcelizer2).clear();
                arrayListRemoteActionCompatParcelizer = arrayList2;
            } else {
                arrayListRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            List<_parseSlowFloat> list = arrayListRemoteActionCompatParcelizer;
            if (!list.isEmpty()) {
                HashMap map = p0.onPlayFromMediaId;
                HashMap map2 = p2.onPlayFromMediaId;
                if (map != null && map2 != null) {
                    int size = list.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        _parseSlowFloat _parseslowfloat2 = arrayListRemoteActionCompatParcelizer.get(i16);
                        filterFinishObject filterfinishobject = (filterFinishObject) map.get(_parseslowfloat2);
                        if (filterfinishobject != null) {
                            map.remove(_parseslowfloat2);
                            map2.put(_parseslowfloat2, filterfinishobject);
                        }
                    }
                }
            }
            int onCommand2 = p2.getOnCommand();
            filterFinishObject filterfinishobjectOnPlay = p2.onPlay(onCommand);
            if (filterfinishobjectOnPlay != null) {
                int iAudioAttributesImplApi21Parcelizer = onCommand2 + 1;
                int audioAttributesImplApi26Parcelizer2 = p2.getAudioAttributesImplApi26Parcelizer();
                int i17 = -1;
                while (iAudioAttributesImplApi21Parcelizer < audioAttributesImplApi26Parcelizer2) {
                    i17 = iAudioAttributesImplApi21Parcelizer;
                    iAudioAttributesImplApi21Parcelizer = InputDecorator.AudioAttributesImplApi21Parcelizer(p2.MediaBrowserCompatSearchResultReceiver, iAudioAttributesImplApi21Parcelizer) + iAudioAttributesImplApi21Parcelizer;
                }
                filterfinishobjectOnPlay.read(p2, i17, audioAttributesImplApi26Parcelizer2);
            }
            int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = p0.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(p1);
            if (p5) {
                if (!p3) {
                    boolean zAudioAttributesImplApi26Parcelizer = p0.AudioAttributesImplApi26Parcelizer(p1, iAudioAttributesImplBaseParcelizer);
                    p0.RemoteActionCompatParcelizer(iOnPrepareFromSearch, i2, p1 - 1);
                    zMediaBrowserCompatSearchResultReceiver = zAudioAttributesImplApi26Parcelizer;
                } else {
                    int i18 = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver >= 0 ? 1 : 0;
                    if (i18 != 0) {
                        p0.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                        p0.write(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver - p0.getAudioAttributesImplApi26Parcelizer());
                        p0.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    }
                    p0.write(p1 - p0.getAudioAttributesImplApi26Parcelizer());
                    zMediaBrowserCompatSearchResultReceiver = p0.MediaBrowserCompatSearchResultReceiver();
                    if (i18 != 0) {
                        p0.onCommand();
                        p0.RemoteActionCompatParcelizer();
                        p0.onCommand();
                        p0.RemoteActionCompatParcelizer();
                    }
                }
                if (zMediaBrowserCompatSearchResultReceiver) {
                    _validJsonValueList.AudioAttributesCompatParcelizer("Unexpectedly removed anchors");
                }
            }
            int i19 = p2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            int i20 = iArr[i3 + 1];
            p2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i19 + ((1073741824 & i20) == 0 ? i20 & 67108863 : 1);
            if (p4) {
                p2.AudioAttributesImplApi26Parcelizer = i6;
                p2.AudioAttributesImplBaseParcelizer = i14 + i2;
            }
            if (zOnPrepareFromMediaId) {
                p2.onRewind(onCommand);
            }
            return arrayListRemoteActionCompatParcelizer;
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final List<_parseSlowFloat> read(_parseSlowFloat _parseslowfloat, int i, setEncoding setencoding) {
        if (setencoding.MediaMetadataCompat <= 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Check failed");
        }
        if (this.MediaMetadataCompat != 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Check failed");
        }
        if (!_parseslowfloat.write()) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Check failed");
        }
        int i2 = read(_parseslowfloat) + i;
        int i3 = this.AudioAttributesImplApi26Parcelizer;
        if (i3 > i2 || i2 >= this.MediaBrowserCompatCustomActionResultReceiver) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Check failed");
        }
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i2);
        int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i2);
        int iHandleMediaPlayPauseIfPendingOnHandler = MediaMetadataCompat(i2) ? 1 : handleMediaPlayPauseIfPendingOnHandler(i2);
        List<_parseSlowFloat> listIconCompatParcelizer$default = write.IconCompatParcelizer$default(AudioAttributesCompatParcelizer, this, i2, setencoding, false, false, false, 32, null);
        onRewind(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        boolean z = iHandleMediaPlayPauseIfPendingOnHandler > 0;
        while (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver >= i3) {
            int iOnPlayFromUri = onPlayFromUri(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
            InputDecorator.write(iArr, iOnPlayFromUri, InputDecorator.AudioAttributesImplApi21Parcelizer(iArr, iOnPlayFromUri) - iAudioAttributesImplBaseParcelizer);
            if (z) {
                int[] iArr2 = this.MediaBrowserCompatSearchResultReceiver;
                int i4 = iArr2[(iOnPlayFromUri * 5) + 1];
                if ((1073741824 & i4) != 0) {
                    z = false;
                } else {
                    InputDecorator.RemoteActionCompatParcelizer(iArr2, iOnPlayFromUri, (i4 & 67108863) - iHandleMediaPlayPauseIfPendingOnHandler);
                }
            }
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }
        if (z) {
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver < iHandleMediaPlayPauseIfPendingOnHandler) {
                _validJsonValueList.AudioAttributesCompatParcelizer("Check failed");
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver -= iHandleMediaPlayPauseIfPendingOnHandler;
        }
        return listIconCompatParcelizer$default;
    }

    public final List<_parseSlowFloat> read(releaseTokenBuffer releasetokenbuffer, int i, boolean z) {
        if (this.MediaMetadataCompat <= 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Check failed");
        }
        if (i == 0 && this.AudioAttributesImplApi26Parcelizer == 0 && this.onPrepareFromMediaId.getRemoteActionCompatParcelizer() == 0 && InputDecorator.AudioAttributesImplApi21Parcelizer(releasetokenbuffer.getRead(), i) == releasetokenbuffer.getRemoteActionCompatParcelizer()) {
            int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
            Object[] objArr = this.onCustomAction;
            ArrayList<_parseSlowFloat> arrayList = this.IconCompatParcelizer;
            HashMap<_parseSlowFloat, filterFinishObject> map = this.onPlayFromMediaId;
            setProvider<setBackgroundDrawable> setprovider = this.read;
            int[] read = releasetokenbuffer.getRead();
            int remoteActionCompatParcelizer = releasetokenbuffer.getRemoteActionCompatParcelizer();
            Object[] mediaBrowserCompatCustomActionResultReceiver = releasetokenbuffer.getMediaBrowserCompatCustomActionResultReceiver();
            int audioAttributesImplBaseParcelizer = releasetokenbuffer.getAudioAttributesImplBaseParcelizer();
            HashMap<_parseSlowFloat, filterFinishObject> mapMediaBrowserCompatSearchResultReceiver = releasetokenbuffer.MediaBrowserCompatSearchResultReceiver();
            setProvider<setBackgroundDrawable> setproviderAudioAttributesImplApi26Parcelizer = releasetokenbuffer.AudioAttributesImplApi26Parcelizer();
            this.MediaBrowserCompatSearchResultReceiver = read;
            this.onCustomAction = mediaBrowserCompatCustomActionResultReceiver;
            this.IconCompatParcelizer = releasetokenbuffer.RemoteActionCompatParcelizer();
            this.MediaDescriptionCompat = remoteActionCompatParcelizer;
            this.MediaBrowserCompatMediaItem = (read.length / 5) - remoteActionCompatParcelizer;
            this.onMediaButtonEvent = audioAttributesImplBaseParcelizer;
            this.onPause = mediaBrowserCompatCustomActionResultReceiver.length - audioAttributesImplBaseParcelizer;
            this.onFastForward = remoteActionCompatParcelizer;
            this.onPlayFromMediaId = mapMediaBrowserCompatSearchResultReceiver;
            this.read = setproviderAudioAttributesImplApi26Parcelizer;
            releasetokenbuffer.RemoteActionCompatParcelizer(iArr, 0, objArr, 0, arrayList, map, setprovider);
            return this.IconCompatParcelizer;
        }
        setEncoding setencodingOnAddQueueItem = releasetokenbuffer.onAddQueueItem();
        try {
            List<_parseSlowFloat> listIconCompatParcelizer = AudioAttributesCompatParcelizer.IconCompatParcelizer(setencodingOnAddQueueItem, i, this, true, true, z);
            setencodingOnAddQueueItem.read(true);
            return listIconCompatParcelizer;
        } catch (Throwable th) {
            setencodingOnAddQueueItem.read(false);
            throw th;
        }
    }

    public final List<_parseSlowFloat> AudioAttributesCompatParcelizer(int i, releaseTokenBuffer releasetokenbuffer, int i2) {
        if (this.MediaMetadataCompat > 0 || AudioAttributesImplBaseParcelizer(this.AudioAttributesImplApi26Parcelizer + i) != 1) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Check failed");
        }
        int i3 = this.AudioAttributesImplApi26Parcelizer;
        int i4 = this.AudioAttributesImplBaseParcelizer;
        int i5 = this.AudioAttributesImplApi21Parcelizer;
        write(i);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        AudioAttributesCompatParcelizer();
        setEncoding setencodingOnAddQueueItem = releasetokenbuffer.onAddQueueItem();
        try {
            List<_parseSlowFloat> listIconCompatParcelizer$default = write.IconCompatParcelizer$default(AudioAttributesCompatParcelizer, setencodingOnAddQueueItem, i2, this, false, true, false, 32, null);
            setencodingOnAddQueueItem.read(true);
            write();
            RemoteActionCompatParcelizer();
            this.AudioAttributesImplApi26Parcelizer = i3;
            this.AudioAttributesImplBaseParcelizer = i4;
            this.AudioAttributesImplApi21Parcelizer = i5;
            return listIconCompatParcelizer$default;
        } catch (Throwable th) {
            setencodingOnAddQueueItem.read(false);
            throw th;
        }
    }

    public final _parseSlowFloat read(int i) {
        ArrayList<_parseSlowFloat> arrayList = this.IconCompatParcelizer;
        int iAudioAttributesImplApi26Parcelizer = InputDecorator.AudioAttributesImplApi26Parcelizer(arrayList, i, MediaBrowserCompatCustomActionResultReceiver());
        if (iAudioAttributesImplApi26Parcelizer < 0) {
            if (i > this.MediaDescriptionCompat) {
                i = -(MediaBrowserCompatCustomActionResultReceiver() - i);
            }
            _parseSlowFloat _parseslowfloat = new _parseSlowFloat(i);
            arrayList.add(-(iAudioAttributesImplApi26Parcelizer + 1), _parseslowfloat);
            return _parseslowfloat;
        }
        return arrayList.get(iAudioAttributesImplApi26Parcelizer);
    }

    public static /* synthetic */ void write(setEncoding setencoding, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = setencoding.onCommand;
        }
        setencoding.MediaBrowserCompatMediaItem(i);
    }

    public final void MediaBrowserCompatMediaItem(int i) {
        int iOnPlayFromUri = onPlayFromUri(i);
        int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
        int i2 = (iOnPlayFromUri * 5) + 1;
        if ((iArr[i2] & C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
            return;
        }
        InputDecorator.read(iArr, iOnPlayFromUri, true);
        if ((this.MediaBrowserCompatSearchResultReceiver[i2] & 67108864) != 0) {
            return;
        }
        onRewind(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i));
    }

    private final boolean onPlayFromSearch(int i) {
        return i >= 0 && (this.MediaBrowserCompatSearchResultReceiver[(onPlayFromUri(i) * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onPrepareFromMediaId(int i) {
        return i >= 0 && (this.MediaBrowserCompatSearchResultReceiver[(onPlayFromUri(i) * 5) + 1] & 201326592) != 0;
    }

    private final void onMediaButtonEvent() {
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = this.handleMediaPlayPauseIfPendingOnHandler;
        if (setexpandactivityoverflowbuttondrawable != null) {
            while (getInputCodeLatin1JsNames.IconCompatParcelizer(setexpandactivityoverflowbuttondrawable)) {
                AudioAttributesCompatParcelizer(getInputCodeLatin1JsNames.AudioAttributesCompatParcelizer(setexpandactivityoverflowbuttondrawable), setexpandactivityoverflowbuttondrawable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRewind(int i) {
        if (i >= 0) {
            setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawableWrite = this.handleMediaPlayPauseIfPendingOnHandler;
            if (setexpandactivityoverflowbuttondrawableWrite == null) {
                setexpandactivityoverflowbuttondrawableWrite = getInputCodeLatin1JsNames.write(null, 1, null);
                this.handleMediaPlayPauseIfPendingOnHandler = setexpandactivityoverflowbuttondrawableWrite;
            }
            getInputCodeLatin1JsNames.IconCompatParcelizer(setexpandactivityoverflowbuttondrawableWrite, i);
        }
    }

    private final void AudioAttributesCompatParcelizer(int i, setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        int iOnPlayFromUri = onPlayFromUri(i);
        boolean zOnPause = onPause(i);
        int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
        if (((iArr[(iOnPlayFromUri * 5) + 1] & 67108864) != 0) != zOnPause) {
            InputDecorator.AudioAttributesCompatParcelizer(iArr, iOnPlayFromUri, zOnPause);
            int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i);
            if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver >= 0) {
                getInputCodeLatin1JsNames.IconCompatParcelizer(setexpandactivityoverflowbuttondrawable, iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            }
        }
    }

    private final boolean onPause(int i) {
        int iAudioAttributesImplBaseParcelizer = i + 1;
        int iAudioAttributesImplBaseParcelizer2 = AudioAttributesImplBaseParcelizer(i);
        while (iAudioAttributesImplBaseParcelizer < i + iAudioAttributesImplBaseParcelizer2) {
            if ((this.MediaBrowserCompatSearchResultReceiver[(onPlayFromUri(iAudioAttributesImplBaseParcelizer) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iAudioAttributesImplBaseParcelizer += AudioAttributesImplBaseParcelizer(iAudioAttributesImplBaseParcelizer);
        }
        return false;
    }

    public final int read(_parseSlowFloat _parseslowfloat) {
        int iconCompatParcelizer = _parseslowfloat.getIconCompatParcelizer();
        return iconCompatParcelizer < 0 ? MediaBrowserCompatCustomActionResultReceiver() + iconCompatParcelizer : iconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotWriter(current = ");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(" end=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(" size = ");
        sb.append(MediaBrowserCompatCustomActionResultReceiver());
        sb.append(" gap=");
        sb.append(this.MediaDescriptionCompat);
        sb.append('-');
        sb.append(this.MediaDescriptionCompat + this.MediaBrowserCompatMediaItem);
        sb.append(')');
        return sb.toString();
    }

    private final void onPlayFromMediaId() {
        this.RatingCompat.RemoteActionCompatParcelizer((onPlay() - this.MediaBrowserCompatMediaItem) - this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private final int onFastForward() {
        int iOnPlay = (onPlay() - this.MediaBrowserCompatMediaItem) - this.RatingCompat.AudioAttributesCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = iOnPlay;
        return iOnPlay;
    }

    private final void AudioAttributesCompatParcelizer(int i, int i2, int i3) {
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(i, this.MediaDescriptionCompat);
        while (i3 < i2) {
            this.MediaBrowserCompatSearchResultReceiver[(onPlayFromUri(i3) * 5) + 2] = iAudioAttributesImplApi21Parcelizer;
            int iAudioAttributesImplApi21Parcelizer2 = InputDecorator.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i3)) + i3;
            AudioAttributesCompatParcelizer(i3, iAudioAttributesImplApi21Parcelizer2, i3 + 1);
            i3 = iAudioAttributesImplApi21Parcelizer2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRemoveQueueItem(int i) {
        int i2 = this.MediaBrowserCompatMediaItem;
        int i3 = this.MediaDescriptionCompat;
        if (i3 != i) {
            if (!this.IconCompatParcelizer.isEmpty()) {
                MediaBrowserCompatItemReceiver(i3, i);
            }
            if (i2 > 0) {
                int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
                int i4 = i * 5;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                if (i < i3) {
                    getOrderDetails.read(iArr, iArr, i5 + i4, i4, i6);
                } else {
                    getOrderDetails.read(iArr, iArr, i6, i6 + i5, i4 + i5);
                }
            }
            if (i < i3) {
                i3 = i + i2;
            }
            int iOnPlay = onPlay();
            if (i3 >= iOnPlay) {
                _validJsonValueList.AudioAttributesCompatParcelizer("Check failed");
            }
            while (i3 < iOnPlay) {
                int i7 = (i3 * 5) + 2;
                int i8 = this.MediaBrowserCompatSearchResultReceiver[i7];
                int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(onRemoveQueueItemAt(i8), i);
                if (iAudioAttributesImplApi21Parcelizer != i8) {
                    this.MediaBrowserCompatSearchResultReceiver[i7] = iAudioAttributesImplApi21Parcelizer;
                }
                i3++;
                if (i3 == i) {
                    i3 += i2;
                }
            }
        }
        this.MediaDescriptionCompat = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaBrowserCompatCustomActionResultReceiver(int i, int i2) {
        int i3 = this.onPause;
        int i4 = this.onMediaButtonEvent;
        int i5 = this.onFastForward;
        if (i4 != i) {
            Object[] objArr = this.onCustomAction;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, MediaBrowserCompatCustomActionResultReceiver());
        if (i5 != iMin) {
            int length = this.onCustomAction.length - i3;
            if (iMin < i5) {
                int iOnPlayFromUri = onPlayFromUri(iMin);
                int iOnPlayFromUri2 = onPlayFromUri(i5);
                int i7 = this.MediaDescriptionCompat;
                while (iOnPlayFromUri < iOnPlayFromUri2) {
                    int i8 = (iOnPlayFromUri * 5) + 4;
                    int i9 = this.MediaBrowserCompatSearchResultReceiver[i8];
                    if (i9 < 0) {
                        _validJsonValueList.AudioAttributesCompatParcelizer("Unexpected anchor value, expected a positive anchor");
                    }
                    this.MediaBrowserCompatSearchResultReceiver[i8] = -((length - i9) + 1);
                    iOnPlayFromUri++;
                    if (iOnPlayFromUri == i7) {
                        iOnPlayFromUri += this.MediaBrowserCompatMediaItem;
                    }
                }
            } else {
                int iOnPlayFromUri3 = onPlayFromUri(i5);
                int iOnPlayFromUri4 = onPlayFromUri(iMin);
                while (iOnPlayFromUri3 < iOnPlayFromUri4) {
                    int i10 = (iOnPlayFromUri3 * 5) + 4;
                    int i11 = this.MediaBrowserCompatSearchResultReceiver[i10];
                    if (i11 >= 0) {
                        _validJsonValueList.AudioAttributesCompatParcelizer("Unexpected anchor value, expected a negative anchor");
                    }
                    this.MediaBrowserCompatSearchResultReceiver[i10] = i11 + length + 1;
                    iOnPlayFromUri3++;
                    if (iOnPlayFromUri3 == this.MediaDescriptionCompat) {
                        iOnPlayFromUri3 += this.MediaBrowserCompatMediaItem;
                    }
                }
            }
            this.onFastForward = iMin;
        }
        this.onMediaButtonEvent = i;
    }

    private final void onPause() {
        int i = this.onMediaButtonEvent;
        getOrderDetails.AudioAttributesCompatParcelizer(this.onCustomAction, (Object) null, i, this.onPause + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSeekTo(int i) {
        if (i > 0) {
            int i2 = this.AudioAttributesImplApi26Parcelizer;
            onRemoveQueueItem(i2);
            int i3 = this.MediaDescriptionCompat;
            int i4 = this.MediaBrowserCompatMediaItem;
            int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length << 1, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                getOrderDetails.read(iArr, iArr2, 0, 0, i3 * 5);
                getOrderDetails.read(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.MediaBrowserCompatSearchResultReceiver = iArr2;
                i4 = i6;
            }
            int i7 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i7 >= i3) {
                this.MediaBrowserCompatCustomActionResultReceiver = i7 + i;
            }
            int i8 = i3 + i;
            this.MediaDescriptionCompat = i8;
            this.MediaBrowserCompatMediaItem = i4 - i;
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i5 > 0 ? onPrepareFromSearch(i2 + i) : 0, this.onFastForward >= i3 ? this.onMediaButtonEvent : 0, this.onPause, this.onCustomAction.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.MediaBrowserCompatSearchResultReceiver[(i9 * 5) + 4] = iRemoteActionCompatParcelizer;
            }
            int i10 = this.onFastForward;
            if (i10 >= i3) {
                this.onFastForward = i10 + i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(int i, int i2) {
        if (i > 0) {
            MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplBaseParcelizer, i2);
            int i3 = this.onMediaButtonEvent;
            int i4 = this.onPause;
            if (i4 < i) {
                Object[] objArr = this.onCustomAction;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length << 1, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.onCustomAction = objArr2;
                i4 = i7;
            }
            int i9 = this.AudioAttributesImplApi21Parcelizer;
            if (i9 >= i3) {
                this.AudioAttributesImplApi21Parcelizer = i9 + i;
            }
            this.onMediaButtonEvent = i3 + i;
            this.onPause = i4 - i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AudioAttributesImplApi26Parcelizer(int i, int i2) {
        if (i2 > 0) {
            ArrayList<_parseSlowFloat> arrayList = this.IconCompatParcelizer;
            onRemoveQueueItem(i);
            zAudioAttributesCompatParcelizer = arrayList.isEmpty() ? false : AudioAttributesCompatParcelizer(i, i2, this.onPlayFromMediaId);
            this.MediaDescriptionCompat = i;
            this.MediaBrowserCompatMediaItem += i2;
            int i3 = this.onFastForward;
            if (i3 > i) {
                this.onFastForward = Math.max(i, i3 - i2);
            }
            int i4 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i4 >= this.MediaDescriptionCompat) {
                this.MediaBrowserCompatCustomActionResultReceiver = i4 - i2;
            }
            int i5 = this.onCommand;
            if (onPlayFromSearch(i5)) {
                onRewind(i5);
            }
        }
        return zAudioAttributesCompatParcelizer;
    }

    public final filterFinishObject onPlay(int i) {
        _parseSlowFloat _parseslowfloatOnFastForward;
        HashMap<_parseSlowFloat, filterFinishObject> map = this.onPlayFromMediaId;
        if (map == null || (_parseslowfloatOnFastForward = onFastForward(i)) == null) {
            return null;
        }
        return map.get(_parseslowfloatOnFastForward);
    }

    public final _parseSlowFloat onFastForward(int i) {
        if (i < 0 || i >= MediaBrowserCompatCustomActionResultReceiver()) {
            return null;
        }
        return InputDecorator.AudioAttributesCompatParcelizer((ArrayList<_parseSlowFloat>) this.IconCompatParcelizer, i, MediaBrowserCompatCustomActionResultReceiver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.onPause;
            int i5 = i + i2;
            MediaBrowserCompatCustomActionResultReceiver(i5, i3);
            this.onMediaButtonEvent = i;
            this.onPause = i4 + i2;
            getOrderDetails.AudioAttributesCompatParcelizer(this.onCustomAction, (Object) null, i, i5);
            int i6 = this.AudioAttributesImplApi21Parcelizer;
            if (i6 >= i) {
                this.AudioAttributesImplApi21Parcelizer = i6 - i2;
            }
        }
    }

    private final void write(int i, Object obj) {
        int iOnPlayFromUri = onPlayFromUri(i);
        int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
        if (iOnPlayFromUri >= iArr.length || (iArr[(iOnPlayFromUri * 5) + 1] & 1073741824) == 0) {
            StringBuilder sb = new StringBuilder("Updating the node of a group at ");
            sb.append(i);
            sb.append(" that was not created with as a node group");
            _validJsonValueList.AudioAttributesCompatParcelizer(sb.toString());
        }
        this.onCustomAction[onPrepare(write(this.MediaBrowserCompatSearchResultReceiver, iOnPlayFromUri))] = obj;
    }

    private final void MediaBrowserCompatItemReceiver(int i, int i2) {
        _parseSlowFloat _parseslowfloat;
        int iconCompatParcelizer;
        _parseSlowFloat _parseslowfloat2;
        int iconCompatParcelizer2;
        int i3;
        int iOnPlay = onPlay() - this.MediaBrowserCompatMediaItem;
        if (i < i2) {
            for (int iIconCompatParcelizer = InputDecorator.IconCompatParcelizer((ArrayList<_parseSlowFloat>) this.IconCompatParcelizer, i, iOnPlay); iIconCompatParcelizer < this.IconCompatParcelizer.size() && (iconCompatParcelizer2 = (_parseslowfloat2 = this.IconCompatParcelizer.get(iIconCompatParcelizer)).getIconCompatParcelizer()) < 0 && (i3 = iconCompatParcelizer2 + iOnPlay) < i2; iIconCompatParcelizer++) {
                _parseslowfloat2.write(i3);
            }
            return;
        }
        for (int iIconCompatParcelizer2 = InputDecorator.IconCompatParcelizer((ArrayList<_parseSlowFloat>) this.IconCompatParcelizer, i2, iOnPlay); iIconCompatParcelizer2 < this.IconCompatParcelizer.size() && (iconCompatParcelizer = (_parseslowfloat = this.IconCompatParcelizer.get(iIconCompatParcelizer2)).getIconCompatParcelizer()) >= 0; iIconCompatParcelizer2++) {
            _parseslowfloat.write(-(iOnPlay - iconCompatParcelizer));
        }
    }

    private final boolean AudioAttributesCompatParcelizer(int i, int i2, HashMap<_parseSlowFloat, filterFinishObject> map) {
        int i3 = i2 + i;
        int iIconCompatParcelizer = InputDecorator.IconCompatParcelizer((ArrayList<_parseSlowFloat>) this.IconCompatParcelizer, i3, onPlay() - this.MediaBrowserCompatMediaItem);
        if (iIconCompatParcelizer >= this.IconCompatParcelizer.size()) {
            iIconCompatParcelizer--;
        }
        int i4 = iIconCompatParcelizer + 1;
        int i5 = 0;
        while (iIconCompatParcelizer >= 0) {
            _parseSlowFloat _parseslowfloat = this.IconCompatParcelizer.get(iIconCompatParcelizer);
            int i6 = read(_parseslowfloat);
            if (i6 < i) {
                break;
            }
            if (i6 < i3) {
                _parseslowfloat.write(Integer.MIN_VALUE);
                if (map != null) {
                    map.remove(_parseslowfloat);
                }
                if (i5 == 0) {
                    i5 = iIconCompatParcelizer + 1;
                }
                i4 = iIconCompatParcelizer;
            }
            iIconCompatParcelizer--;
        }
        boolean z = i4 < i5;
        if (z) {
            this.IconCompatParcelizer.subList(i4, i5).clear();
        }
        return z;
    }

    private final void read(int i, int i2, int i3) {
        _parseSlowFloat _parseslowfloat;
        int i4;
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        int iIconCompatParcelizer = InputDecorator.IconCompatParcelizer((ArrayList<_parseSlowFloat>) this.IconCompatParcelizer, i, iMediaBrowserCompatCustomActionResultReceiver);
        ArrayList arrayList = new ArrayList();
        if (iIconCompatParcelizer >= 0) {
            while (iIconCompatParcelizer < this.IconCompatParcelizer.size() && (i4 = read((_parseslowfloat = this.IconCompatParcelizer.get(iIconCompatParcelizer)))) >= i && i4 < i3 + i) {
                arrayList.add(_parseslowfloat);
                this.IconCompatParcelizer.remove(iIconCompatParcelizer);
            }
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            _parseSlowFloat _parseslowfloat2 = (_parseSlowFloat) arrayList.get(i5);
            int i6 = read(_parseslowfloat2) + (i2 - i);
            if (i6 >= this.MediaDescriptionCompat) {
                _parseslowfloat2.write(-(iMediaBrowserCompatCustomActionResultReceiver - i6));
            } else {
                _parseslowfloat2.write(i6);
            }
            this.IconCompatParcelizer.add(InputDecorator.IconCompatParcelizer((ArrayList<_parseSlowFloat>) this.IconCompatParcelizer, i6, iMediaBrowserCompatCustomActionResultReceiver), _parseslowfloat2);
        }
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return onPlay() - this.MediaBrowserCompatMediaItem;
    }

    private final int onPlay() {
        return this.MediaBrowserCompatSearchResultReceiver.length / 5;
    }

    private final int onPlayFromUri(int i) {
        return i + (this.MediaBrowserCompatMediaItem * (i < this.MediaDescriptionCompat ? 0 : 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int onPrepare(int i) {
        return i + (this.onPause * (i < this.onMediaButtonEvent ? 0 : 1));
    }

    private final int IconCompatParcelizer(int[] iArr, int i) {
        return onRemoveQueueItemAt(iArr[(onPlayFromUri(i) * 5) + 2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int onPrepareFromSearch(int i) {
        return RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int RemoteActionCompatParcelizer(int[] iArr, int i) {
        return i >= onPlay() ? this.onCustomAction.length - this.onPause : write(iArr[(i * 5) + 4], this.onPause, this.onCustomAction.length);
    }

    private final int read(int[] iArr, int i) {
        return i >= onPlay() ? this.onCustomAction.length - this.onPause : write(InputDecorator.AudioAttributesImplBaseParcelizer(iArr, i), this.onPause, this.onCustomAction.length);
    }

    private final void read(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = RemoteActionCompatParcelizer(i2, this.onMediaButtonEvent, this.onPause, this.onCustomAction.length);
    }

    private final int write(int[] iArr, int i) {
        return RemoteActionCompatParcelizer(iArr, i);
    }

    private final int AudioAttributesCompatParcelizer(int[] iArr, int i) {
        return RemoteActionCompatParcelizer(iArr, i) + Integer.bitCount(iArr[(i * 5) + 1] >> 29);
    }

    private final int AudioAttributesImplApi21Parcelizer(int i, int i2) {
        return i < i2 ? i : -((MediaBrowserCompatCustomActionResultReceiver() - i) + 2);
    }

    private final int onRemoveQueueItemAt(int i) {
        return i > -2 ? i : MediaBrowserCompatCustomActionResultReceiver() + i + 2;
    }

    public final void onPlayFromMediaId(int i) {
        if (i <= 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Check failed");
        }
        int i2 = this.onCommand;
        int i3 = read(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i2));
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i2 + 1)) - i;
        if (iRemoteActionCompatParcelizer < i3) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Check failed");
        }
        RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, i, i2);
        int i4 = this.AudioAttributesImplBaseParcelizer;
        if (i4 >= i3) {
            this.AudioAttributesImplBaseParcelizer = i4 - i;
        }
    }

    public final void write(int i) {
        if (i < 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Cannot seek backwards");
        }
        if (this.MediaMetadataCompat > 0) {
            getInputCodeUtf8JsNames.read("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.AudioAttributesImplApi26Parcelizer + i;
        if (i2 < this.onCommand || i2 > this.MediaBrowserCompatCustomActionResultReceiver) {
            StringBuilder sb = new StringBuilder("Cannot seek outside the current group (");
            sb.append(this.onCommand);
            sb.append('-');
            sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
            sb.append(')');
            _validJsonValueList.AudioAttributesCompatParcelizer(sb.toString());
        }
        this.AudioAttributesImplApi26Parcelizer = i2;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, onPlayFromUri(i2));
        this.AudioAttributesImplBaseParcelizer = iRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = iRemoteActionCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(int i, MagicModuleSubmissionRequestBody<? super Integer, Object, getShowPopup> magicModuleSubmissionRequestBody) {
        int i2;
        int i3;
        int audioAttributesCompatParcelizer;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i);
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i);
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        int i4 = i;
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = null;
        setBackgroundDrawable setbackgrounddrawableAudioAttributesCompatParcelizer = null;
        while (i4 < iAudioAttributesImplBaseParcelizer + i) {
            int iOnPrepareFromSearch = onPrepareFromSearch(i4);
            int i5 = i4 + 1;
            int iOnPrepareFromSearch2 = onPrepareFromSearch(i5);
            while (true) {
                i2 = 0;
                if (iOnPrepareFromSearch >= iOnPrepareFromSearch2) {
                    break;
                }
                Object obj = this.onCustomAction[onPrepare(iOnPrepareFromSearch)];
                if ((obj instanceof constructReadConstrainedTextBuffer) && (audioAttributesCompatParcelizer = ((constructReadConstrainedTextBuffer) obj).getAudioAttributesCompatParcelizer()) >= 0) {
                    int i6 = read(i4, audioAttributesCompatParcelizer);
                    if (setbackgrounddrawableAudioAttributesCompatParcelizer == null) {
                        setbackgrounddrawableAudioAttributesCompatParcelizer = setPopupTheme.AudioAttributesCompatParcelizer();
                    }
                    if (setexpandactivityoverflowbuttondrawable == null) {
                        setexpandactivityoverflowbuttondrawable = new setExpandActivityOverflowButtonDrawable(i2, 1, magicModuleRepositoryImplExternalSyntheticLambda0);
                    }
                    setbackgrounddrawableAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i6);
                    setexpandactivityoverflowbuttondrawable.RemoteActionCompatParcelizer(i6);
                    setexpandactivityoverflowbuttondrawable.RemoteActionCompatParcelizer(iOnPrepareFromSearch);
                } else {
                    magicModuleSubmissionRequestBody.invoke(Integer.valueOf(iOnPrepareFromSearch), obj);
                }
                iOnPrepareFromSearch++;
            }
            int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = i5 < iMediaBrowserCompatCustomActionResultReceiver ? MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i5) : -1;
            if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 != i4) {
                while (true) {
                    if (setexpandactivityoverflowbuttondrawable == null || setbackgrounddrawableAudioAttributesCompatParcelizer == null || !setbackgrounddrawableAudioAttributesCompatParcelizer.read(i4)) {
                        i3 = iMediaBrowserCompatCustomActionResultReceiver;
                    } else {
                        int i7 = setexpandactivityoverflowbuttondrawable.AudioAttributesCompatParcelizer;
                        int i8 = i7 / 2;
                        int i9 = i2;
                        int i10 = i9;
                        while (i10 < i8) {
                            int i11 = i10 << 1;
                            int i12 = iMediaBrowserCompatCustomActionResultReceiver;
                            int i13 = setexpandactivityoverflowbuttondrawable.read(i11);
                            if (i13 == i4) {
                                int i14 = setexpandactivityoverflowbuttondrawable.read(i11 + 1);
                                magicModuleSubmissionRequestBody.invoke(Integer.valueOf(i14), this.onCustomAction[onPrepare(i14)]);
                            } else if (i11 != i9) {
                                setexpandactivityoverflowbuttondrawable.IconCompatParcelizer(i9, i13);
                                setexpandactivityoverflowbuttondrawable.IconCompatParcelizer(i9 + 1, setexpandactivityoverflowbuttondrawable.read(i11 + 1));
                                i9 += 2;
                            } else {
                                i9 += 2;
                            }
                            i10++;
                            iMediaBrowserCompatCustomActionResultReceiver = i12;
                        }
                        i3 = iMediaBrowserCompatCustomActionResultReceiver;
                        if (i9 != i7) {
                            setexpandactivityoverflowbuttondrawable.RemoteActionCompatParcelizer(i9, i7);
                        }
                    }
                    if (i4 == i || iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2) {
                        break;
                    }
                    i4 = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    iMediaBrowserCompatCustomActionResultReceiver = i3;
                    i2 = 0;
                }
            } else {
                i3 = iMediaBrowserCompatCustomActionResultReceiver;
            }
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2;
            i4 = i5;
            iMediaBrowserCompatCustomActionResultReceiver = i3;
            magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        }
    }
}
