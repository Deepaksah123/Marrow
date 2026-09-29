package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a>\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a?\u0010\u000e\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u000f\u001a8\u0010\u0010\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t0\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aD\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00130\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aO\u0010\u0015\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0016*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00130\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u000f\u001a]\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0013\"\u0010\b\u0002\u0010\u0018*\n\u0012\u0006\b\u0000\u0012\u0002H\u00130\u0019*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u001a\u001a\u0002H\u00182\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00130\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\u001b\u001a?\u0010\u001c\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u000f\u001a>\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a`\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u00052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00130\u0005H\u0086\b\u0082\u0002\u0010\n\u0006\b\u0001\u0012\u0002\u0010\u0001\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001a`\u0010\u001f\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010 \u001a\u0002H\u00132'\u0010!\u001a#\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00130\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010%\u001aY\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00020\u00032'\u0010\u0014\u001a#\u0012\u0013\u0012\u00110\t¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b('\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00130\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a[\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00020\u00032)\u0010\u0014\u001a%\u0012\u0013\u0012\u00110\t¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b('\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00130\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aO\u0010)\u001a\u0004\u0018\u0001H\u0013\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0016*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00130\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010*\u001aU\u0010+\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0016*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010,\u001a\u0002H\u00132\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00130\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010-\u001aJ\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00130\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a\\\u0010/\u001a\u0002H0\"\u0004\b\u0000\u00100\"\b\b\u0001\u0010\u0002*\u0002H0*\b\u0012\u0004\u0012\u0002H\u00020\u00032'\u0010!\u001a#\u0012\u0013\u0012\u0011H0¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H00\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00101\u001a|\u00102\u001a\b\u0012\u0004\u0012\u0002H30\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0013\"\u0004\b\u0002\u00103*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H\u00130\u000326\u0010\u0014\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(5\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(6\u0012\u0004\u0012\u0002H30\bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001aF\u00107\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00130\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a`\u00108\u001a\u000209\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020\t2\b\b\u0002\u0010?\u001a\u00020;2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020;\u0018\u00010\u0005\u001aD\u0010@\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010A*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002HA0\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aO\u0010B\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0016*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00130\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u000f\u001aJ\u0010C\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130D0\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a\"\u0010E\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\b\b\u0000\u0010\u0002*\u00020F*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0003\u001a=\u0010G\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u000f\u001a}\u0010H\u001a\u0002HI\"\u0004\b\u0000\u0010\u0002\"\f\b\u0001\u0010I*\u00060Jj\u0002`K*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010L\u001a\u0002HI2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020\t2\b\b\u0002\u0010?\u001a\u00020;2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020;\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010M\u001a9\u0010N\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00060Jj\u0002`K2\u0006\u0010O\u001a\u0002H\u00022\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020;\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010P\u001a\u0010\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u000209H\u0001\u001a\u0010\u0010T\u001a\u00020\u00012\u0006\u0010S\u001a\u000209H\u0001¨\u0006U"}, d2 = {"fastForEach", "", "T", "", "action", "Lkotlin/Function1;", "fastForEachReversed", "fastForEachIndexed", "Lkotlin/Function2;", "", "fastAll", "", "predicate", "fastAny", "fastFirstOrNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "fastSumBy", "selector", "fastMap", "R", "transform", "fastMaxBy", "", "fastMapTo", "C", "", "destination", "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fastLastOrNull", "fastFilter", "fastFilteredMap", "fastFold", "initial", "operation", "Lkotlin/ParameterName;", "name", "acc", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastMapIndexed", "index", "fastMapIndexedNotNull", "fastMaxOfOrNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "fastMaxOfOrDefault", "defaultValue", "(Ljava/util/List;Ljava/lang/Comparable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "fastZipWithNext", "fastReduce", "S", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastZip", "V", "other", CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, "b", "fastMapNotNull", "fastJoinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "fastDistinctBy", "K", "fastMinByOrNull", "fastFlatMap", "", "fastFilterNotNull", "", "fastFirst", "fastJoinTo", "A", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "appendElement", "element", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "throwNoSuchElementException", "", "message", "throwUnsupportedOperationException", "ui-util"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ArrayBlockingQueueDeserializer {
    public static /* synthetic */ String RemoteActionCompatParcelizer(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap getanswermap, int i2, Object obj) {
        if ((i2 & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        CharSequence charSequence5 = charSequence2;
        if ((i2 & 4) != 0) {
        }
        CharSequence charSequence6 = charSequence3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            getanswermap = null;
        }
        return IconCompatParcelizer(list, charSequence, charSequence5, charSequence6, i3, charSequence7, getanswermap);
    }

    public static final <T> String IconCompatParcelizer(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super T, ? extends CharSequence> getanswermap) {
        return ((StringBuilder) RemoteActionCompatParcelizer(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, getanswermap)).toString();
    }

    public static final <T> List<T> RemoteActionCompatParcelizer(List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    private static final <T, A extends Appendable> A RemoteActionCompatParcelizer(List<? extends T> list, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, getAnswerMap<? super T, ? extends CharSequence> getanswermap) throws IOException {
        a.append(charSequence2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            write(a, t, getanswermap);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void write(Appendable appendable, T t, getAnswerMap<? super T, ? extends CharSequence> getanswermap) throws IOException {
        if (getanswermap != null) {
            appendable.append(getanswermap.invoke(t));
            return;
        }
        if (t == 0 || (t instanceof CharSequence)) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }

    public static final Void RemoteActionCompatParcelizer(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void write(String str) {
        throw new UnsupportedOperationException(str);
    }
}
