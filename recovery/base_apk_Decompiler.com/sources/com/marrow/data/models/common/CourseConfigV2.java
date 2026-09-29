package com.marrow.data.models.common;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.buildResumeDownloadsIntent;
import kotlin.buildSetStopReasonIntent;
import kotlin.getMagicModuleSavedMcqCount;
import kotlin.getMagicModuleTimeline;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@JsonDeserialize(using = CourseConfigDeserializer.class)
@JsonSerialize(using = CourseConfigSerializer.class)
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\b\n\u0002\br\b\u0087\b\u0018\u0000 É\u00012\u00020\u0001::Ê\u0001Ë\u0001Ì\u0001Í\u0001Î\u0001Ï\u0001Ð\u0001Ñ\u0001Ò\u0001Ó\u0001Ô\u0001Õ\u0001Ö\u0001×\u0001Ø\u0001Ù\u0001Ú\u0001Û\u0001Ü\u0001Ý\u0001Þ\u0001ß\u0001à\u0001á\u0001â\u0001ã\u0001ä\u0001å\u0001É\u0001B\u008f\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0007\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020*\u0018\u00010)\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0007\u0012\u000e\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u0007\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\u0006\u00104\u001a\u00020\u0002\u0012\u000e\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u0007\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0007\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bC\u0010BJ\u0010\u0010D\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bH\u0010BJ\u0010\u0010I\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bI\u0010BJ\u0010\u0010J\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010BJ\u0010\u0010K\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007HÆ\u0003¢\u0006\u0004\bM\u0010GJ\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007HÆ\u0003¢\u0006\u0004\bN\u0010GJ\u0010\u0010O\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0016\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\bQ\u0010GJ\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007HÆ\u0003¢\u0006\u0004\bR\u0010GJ\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007HÆ\u0003¢\u0006\u0004\bS\u0010GJ\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007HÆ\u0003¢\u0006\u0004\bT\u0010GJ\u0016\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007HÆ\u0003¢\u0006\u0004\bU\u0010GJ\u0016\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007HÆ\u0003¢\u0006\u0004\bV\u0010GJ\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020 0\u0007HÆ\u0003¢\u0006\u0004\bW\u0010GJ\u0010\u0010X\u001a\u00020\"HÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bZ\u0010BJ\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00020%0\u0007HÆ\u0003¢\u0006\u0004\b[\u0010GJ\u0012\u0010\\\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\b\\\u0010]J\u001e\u0010^\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020*\u0018\u00010)HÆ\u0003¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0018\u0010b\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bb\u0010GJ\u0018\u0010c\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bc\u0010GJ\u0012\u0010d\u001a\u0004\u0018\u000102HÆ\u0003¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bf\u0010BJ\u0018\u0010g\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bg\u0010GJ\u0012\u0010h\u001a\u0004\u0018\u000107HÆ\u0003¢\u0006\u0004\bh\u0010iJ\u0016\u0010j\u001a\b\u0012\u0004\u0012\u0002090\u0007HÆ\u0003¢\u0006\u0004\bj\u0010GJ\u0012\u0010k\u001a\u0004\u0018\u00010;HÆ\u0003¢\u0006\u0004\bk\u0010lJ\u0012\u0010m\u001a\u0004\u0018\u00010=HÆ\u0003¢\u0006\u0004\bm\u0010nJÔ\u0003\u0010o\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00072\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00022\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020*\u0018\u00010)2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00072\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00072\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\b\b\u0002\u00104\u001a\u00020\u00022\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u00072\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00072\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=HÆ\u0001¢\u0006\u0004\bo\u0010pJ\u001a\u0010q\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bq\u0010rJ\u0010\u0010t\u001a\u00020sHÖ\u0001¢\u0006\u0004\bt\u0010uJ\u0010\u0010v\u001a\u00020 HÖ\u0001¢\u0006\u0004\bv\u0010wR\u0017\u0010x\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bx\u0010BR\u001a\u0010z\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bz\u0010y\u001a\u0004\b{\u0010BR\u001a\u0010|\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010ER\"\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010GR\u001d\u0010\u0082\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010y\u001a\u0005\b\u0082\u0001\u0010BR\u001d\u0010\u0083\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010y\u001a\u0005\b\u0084\u0001\u0010BR\u001d\u0010\u0085\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010y\u001a\u0005\b\u0086\u0001\u0010BR\u001e\u0010\u0087\u0001\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010LR$\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u0080\u0001\u001a\u0005\b\u008b\u0001\u0010GR$\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u008c\u0001\u0010\u0080\u0001\u001a\u0005\b\u008d\u0001\u0010GR\u001e\u0010\u008e\u0001\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010PR$\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0091\u0001\u0010\u0080\u0001\u001a\u0005\b\u0092\u0001\u0010GR$\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0093\u0001\u0010\u0080\u0001\u001a\u0005\b\u0094\u0001\u0010GR$\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0095\u0001\u0010\u0080\u0001\u001a\u0005\b\u0096\u0001\u0010GR$\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0097\u0001\u0010\u0080\u0001\u001a\u0005\b\u0098\u0001\u0010GR$\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0099\u0001\u0010\u0080\u0001\u001a\u0005\b\u009a\u0001\u0010GR$\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009b\u0001\u0010\u0080\u0001\u001a\u0005\b\u009c\u0001\u0010GR$\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020 0\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009d\u0001\u0010\u0080\u0001\u001a\u0005\b\u009e\u0001\u0010GR\u001e\u0010\u009f\u0001\u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0005\b¡\u0001\u0010YR\u001d\u0010¢\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¢\u0001\u0010y\u001a\u0005\b¢\u0001\u0010BR$\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b£\u0001\u0010\u0080\u0001\u001a\u0005\b¤\u0001\u0010GR \u0010¥\u0001\u001a\u0004\u0018\u00010'8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0005\b§\u0001\u0010]R,\u0010¨\u0001\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020*\u0018\u00010)8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0005\bª\u0001\u0010_R \u0010«\u0001\u001a\u0004\u0018\u00010,8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010aR&\u0010®\u0001\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b®\u0001\u0010\u0080\u0001\u001a\u0005\b¯\u0001\u0010GR&\u0010°\u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b°\u0001\u0010\u0080\u0001\u001a\u0005\b±\u0001\u0010GR \u0010²\u0001\u001a\u0004\u0018\u0001028\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b²\u0001\u0010³\u0001\u001a\u0005\b´\u0001\u0010eR\u001d\u0010µ\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\bµ\u0001\u0010y\u001a\u0005\b¶\u0001\u0010BR&\u0010·\u0001\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b·\u0001\u0010\u0080\u0001\u001a\u0005\b¸\u0001\u0010GR \u0010¹\u0001\u001a\u0004\u0018\u0001078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0005\b»\u0001\u0010iR$\u0010¼\u0001\u001a\b\u0012\u0004\u0012\u0002090\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b¼\u0001\u0010\u0080\u0001\u001a\u0005\b½\u0001\u0010GR \u0010¾\u0001\u001a\u0004\u0018\u00010;8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0005\bÀ\u0001\u0010lR \u0010Á\u0001\u001a\u0004\u0018\u00010=8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0005\bÃ\u0001\u0010nR(\u0010Ä\u0001\u001a\u00020s8\u0007@\u0007X\u0087\u000e¢\u0006\u0017\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0005\bÆ\u0001\u0010u\"\u0006\bÇ\u0001\u0010È\u0001"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2;", "", "", "p0", "p1", "Lcom/marrow/data/models/common/CourseConfigV2$BottomTabItem;", "p2", "", "Lcom/marrow/data/models/common/CourseConfigV2$SupportItem;", "p3", "p4", "p5", "p6", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItems;", "p7", "Lcom/marrow/data/models/common/CourseConfigV2$QbankItem;", "p8", "Lcom/marrow/data/models/common/CourseConfigV2$SearchItem;", "p9", "Lcom/marrow/data/models/common/CourseConfigV2$SettingsItems;", "p10", "p11", "Lcom/marrow/data/models/common/CourseConfigV2$TestItem;", "p12", "Lcom/marrow/data/models/common/CourseConfigV2$TestTabItem;", "p13", "Lcom/marrow/data/models/common/CourseConfigV2$VideoItem;", "p14", "Lcom/marrow/data/models/common/CourseConfigV2$VideoPageItem;", "p15", "Lcom/marrow/data/models/common/CourseConfigV2$HomePageItems;", "p16", "", "p17", "Lcom/marrow/data/models/common/CourseConfigV2$CourseStrings;", "p18", "p19", "Lcom/marrow/data/models/common/CourseConfigV2$AcademicYear;", "p20", "Lcom/marrow/data/models/common/CourseConfigV2$EditionSwitch;", "p21", "", "Lcom/marrow/data/models/common/CourseConfigV2$QBankGroupItem;", "p22", "Lcom/marrow/data/models/common/CourseConfigV2$CustomModuleConfig;", "p23", "Lcom/marrow/data/models/common/CourseConfigV2$PracticalItems;", "p24", "Lcom/marrow/data/models/common/CourseConfigV2$ZenAreaItem;", "p25", "Lcom/marrow/data/models/common/CourseConfigV2$VideoProperties;", "p26", "p27", "Lcom/marrow/data/models/common/CourseConfigV2$VideoSubjectPageItem;", "p28", "Lcom/marrow/data/models/common/CourseConfigV2$GtAnalyticsCard;", "p29", "Lcom/marrow/data/models/common/CourseConfigV2$AnnouncementBanner;", "p30", "Lcom/marrow/data/models/common/CourseConfigV2$EditionUpdatePopup;", "p31", "Lcom/marrow/data/models/common/CourseConfigV2$PlanScreenConfig;", "p32", "<init>", "(ZZLcom/marrow/data/models/common/CourseConfigV2$BottomTabItem;Ljava/util/List;ZZZLcom/marrow/data/models/common/CourseConfigV2$NavDrawerItems;Ljava/util/List;Ljava/util/List;Lcom/marrow/data/models/common/CourseConfigV2$SettingsItems;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/marrow/data/models/common/CourseConfigV2$CourseStrings;ZLjava/util/List;Lcom/marrow/data/models/common/CourseConfigV2$EditionSwitch;Ljava/util/Map;Lcom/marrow/data/models/common/CourseConfigV2$CustomModuleConfig;Ljava/util/List;Ljava/util/List;Lcom/marrow/data/models/common/CourseConfigV2$VideoProperties;ZLjava/util/List;Lcom/marrow/data/models/common/CourseConfigV2$GtAnalyticsCard;Ljava/util/List;Lcom/marrow/data/models/common/CourseConfigV2$EditionUpdatePopup;Lcom/marrow/data/models/common/CourseConfigV2$PlanScreenConfig;)V", "component1", "()Z", "component2", "component3", "()Lcom/marrow/data/models/common/CourseConfigV2$BottomTabItem;", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "()Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItems;", "component9", "component10", "component11", "()Lcom/marrow/data/models/common/CourseConfigV2$SettingsItems;", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Lcom/marrow/data/models/common/CourseConfigV2$CourseStrings;", "component20", "component21", "component22", "()Lcom/marrow/data/models/common/CourseConfigV2$EditionSwitch;", "component23", "()Ljava/util/Map;", "component24", "()Lcom/marrow/data/models/common/CourseConfigV2$CustomModuleConfig;", "component25", "component26", "component27", "()Lcom/marrow/data/models/common/CourseConfigV2$VideoProperties;", "component28", "component29", "component30", "()Lcom/marrow/data/models/common/CourseConfigV2$GtAnalyticsCard;", "component31", "component32", "()Lcom/marrow/data/models/common/CourseConfigV2$EditionUpdatePopup;", "component33", "()Lcom/marrow/data/models/common/CourseConfigV2$PlanScreenConfig;", "copy", "(ZZLcom/marrow/data/models/common/CourseConfigV2$BottomTabItem;Ljava/util/List;ZZZLcom/marrow/data/models/common/CourseConfigV2$NavDrawerItems;Ljava/util/List;Ljava/util/List;Lcom/marrow/data/models/common/CourseConfigV2$SettingsItems;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/marrow/data/models/common/CourseConfigV2$CourseStrings;ZLjava/util/List;Lcom/marrow/data/models/common/CourseConfigV2$EditionSwitch;Ljava/util/Map;Lcom/marrow/data/models/common/CourseConfigV2$CustomModuleConfig;Ljava/util/List;Ljava/util/List;Lcom/marrow/data/models/common/CourseConfigV2$VideoProperties;ZLjava/util/List;Lcom/marrow/data/models/common/CourseConfigV2$GtAnalyticsCard;Ljava/util/List;Lcom/marrow/data/models/common/CourseConfigV2$EditionUpdatePopup;Lcom/marrow/data/models/common/CourseConfigV2$PlanScreenConfig;)Lcom/marrow/data/models/common/CourseConfigV2;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "isTestIntroFooterEnabled", "Z", "showGoProButton", "getShowGoProButton", "defaultBottomTab", "Lcom/marrow/data/models/common/CourseConfigV2$BottomTabItem;", "getDefaultBottomTab", "supportViews", "Ljava/util/List;", "getSupportViews", "isBookmarkOnTestToolbar", "bookmarkOnHomeToolbarEnabled", "getBookmarkOnHomeToolbarEnabled", "defaultPlanBannerDesign", "getDefaultPlanBannerDesign", "navDrawerItems", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItems;", "getNavDrawerItems", "qbankItems", "getQbankItems", "searchItems", "getSearchItems", "settingsItems", "Lcom/marrow/data/models/common/CourseConfigV2$SettingsItems;", "getSettingsItems", "supportedBottomTabs", "getSupportedBottomTabs", "testItems", "getTestItems", "testTabItems", "getTestTabItems", "videoItems", "getVideoItems", "videoPageTabs", "getVideoPageTabs", "homePageItems", "getHomePageItems", CourseConfigKeyConstantsKt.KEY_DEEPLINKS, "getDeeplinks", "courseStrings", "Lcom/marrow/data/models/common/CourseConfigV2$CourseStrings;", "getCourseStrings", "isMagicModuleEnabled", "academicYears", "getAcademicYears", "editionSwitch", "Lcom/marrow/data/models/common/CourseConfigV2$EditionSwitch;", "getEditionSwitch", "qBankGroupMeta", "Ljava/util/Map;", "getQBankGroupMeta", "customModuleConfig", "Lcom/marrow/data/models/common/CourseConfigV2$CustomModuleConfig;", "getCustomModuleConfig", "practicalItems", "getPracticalItems", "zenArea", "getZenArea", "videoProperties", "Lcom/marrow/data/models/common/CourseConfigV2$VideoProperties;", "getVideoProperties", "showNotesWatermark", "getShowNotesWatermark", "videoSubjectPageItems", "getVideoSubjectPageItems", "gtAnalyticsCard", "Lcom/marrow/data/models/common/CourseConfigV2$GtAnalyticsCard;", "getGtAnalyticsCard", "announcementBanners", "getAnnouncementBanners", "editionUpdatePopup", "Lcom/marrow/data/models/common/CourseConfigV2$EditionUpdatePopup;", "getEditionUpdatePopup", "planScreenConfig", "Lcom/marrow/data/models/common/CourseConfigV2$PlanScreenConfig;", "getPlanScreenConfig", "version", "I", "getVersion", "setVersion", "(I)V", "Companion", "CustomModuleConfig", "CustomModuleQuestionSource", "CourseStrings", "NavDrawerItems", "SettingsItems", "EditionSwitch", "NavDrawerItem", "SettingsItem", "BottomTabItem", "SupportItem", "QbankItem", "SearchItem", "TestItem", "TestTabItem", "VideoItem", "VideoPageItem", "HomePageItems", "PracticalItems", "QBankGroupItem", "ZenAreaItem", "AcademicYear", "VideoProperties", "VideoSubjectPageItem", "GtAnalyticsCard", "AnnouncementBanner", "AnnouncementPopup", "EditionUpdatePopup", "PlanScreenConfig"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CourseConfigV2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String WORLD_OF_REVISION_ID = "world_of_revision_card";
    private final List<AcademicYear> academicYears;
    private final List<AnnouncementBanner> announcementBanners;
    private final boolean bookmarkOnHomeToolbarEnabled;
    private final CourseStrings courseStrings;
    private final CustomModuleConfig customModuleConfig;
    private final List<String> deeplinks;
    private final BottomTabItem defaultBottomTab;
    private final boolean defaultPlanBannerDesign;
    private final EditionSwitch editionSwitch;
    private final EditionUpdatePopup editionUpdatePopup;
    private final GtAnalyticsCard gtAnalyticsCard;
    private final List<HomePageItems> homePageItems;
    private final boolean isBookmarkOnTestToolbar;
    private final boolean isMagicModuleEnabled;
    private final boolean isTestIntroFooterEnabled;
    private final NavDrawerItems navDrawerItems;
    private final PlanScreenConfig planScreenConfig;
    private final List<PracticalItems> practicalItems;
    private final Map<String, QBankGroupItem> qBankGroupMeta;
    private final List<QbankItem> qbankItems;
    private final List<SearchItem> searchItems;
    private final SettingsItems settingsItems;
    private final boolean showGoProButton;
    private final boolean showNotesWatermark;
    private final List<SupportItem> supportViews;
    private final List<BottomTabItem> supportedBottomTabs;
    private final List<TestItem> testItems;
    private final List<TestTabItem> testTabItems;
    private int version;
    private final List<VideoItem> videoItems;
    private final List<VideoPageItem> videoPageTabs;
    private final VideoProperties videoProperties;
    private final List<VideoSubjectPageItem> videoSubjectPageItems;
    private final List<ZenAreaItem> zenArea;

    /* JADX WARN: Multi-variable type inference failed */
    public CourseConfigV2(boolean z, boolean z2, BottomTabItem bottomTabItem, List<? extends SupportItem> list, boolean z3, boolean z4, boolean z5, NavDrawerItems navDrawerItems, List<? extends QbankItem> list2, List<? extends SearchItem> list3, SettingsItems settingsItems, List<? extends BottomTabItem> list4, List<? extends TestItem> list5, List<? extends TestTabItem> list6, List<? extends VideoItem> list7, List<? extends VideoPageItem> list8, List<? extends HomePageItems> list9, List<String> list10, CourseStrings courseStrings, boolean z6, List<AcademicYear> list11, EditionSwitch editionSwitch, Map<String, QBankGroupItem> map, CustomModuleConfig customModuleConfig, List<? extends PracticalItems> list12, List<ZenAreaItem> list13, VideoProperties videoProperties, boolean z7, List<VideoSubjectPageItem> list14, GtAnalyticsCard gtAnalyticsCard, List<AnnouncementBanner> list15, EditionUpdatePopup editionUpdatePopup, PlanScreenConfig planScreenConfig) {
        toMagicModuleMetaRepoModel.write(bottomTabItem, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(navDrawerItems, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        toMagicModuleMetaRepoModel.write(settingsItems, "");
        toMagicModuleMetaRepoModel.write(list4, "");
        toMagicModuleMetaRepoModel.write(list5, "");
        toMagicModuleMetaRepoModel.write(list6, "");
        toMagicModuleMetaRepoModel.write(list7, "");
        toMagicModuleMetaRepoModel.write(list8, "");
        toMagicModuleMetaRepoModel.write(list9, "");
        toMagicModuleMetaRepoModel.write(list10, "");
        toMagicModuleMetaRepoModel.write(courseStrings, "");
        toMagicModuleMetaRepoModel.write(list11, "");
        toMagicModuleMetaRepoModel.write(list15, "");
        this.isTestIntroFooterEnabled = z;
        this.showGoProButton = z2;
        this.defaultBottomTab = bottomTabItem;
        this.supportViews = list;
        this.isBookmarkOnTestToolbar = z3;
        this.bookmarkOnHomeToolbarEnabled = z4;
        this.defaultPlanBannerDesign = z5;
        this.navDrawerItems = navDrawerItems;
        this.qbankItems = list2;
        this.searchItems = list3;
        this.settingsItems = settingsItems;
        this.supportedBottomTabs = list4;
        this.testItems = list5;
        this.testTabItems = list6;
        this.videoItems = list7;
        this.videoPageTabs = list8;
        this.homePageItems = list9;
        this.deeplinks = list10;
        this.courseStrings = courseStrings;
        this.isMagicModuleEnabled = z6;
        this.academicYears = list11;
        this.editionSwitch = editionSwitch;
        this.qBankGroupMeta = map;
        this.customModuleConfig = customModuleConfig;
        this.practicalItems = list12;
        this.zenArea = list13;
        this.videoProperties = videoProperties;
        this.showNotesWatermark = z7;
        this.videoSubjectPageItems = list14;
        this.gtAnalyticsCard = gtAnalyticsCard;
        this.announcementBanners = list15;
        this.editionUpdatePopup = editionUpdatePopup;
        this.planScreenConfig = planScreenConfig;
    }

    public final boolean isTestIntroFooterEnabled() {
        return this.isTestIntroFooterEnabled;
    }

    public final boolean getShowGoProButton() {
        return this.showGoProButton;
    }

    public final BottomTabItem getDefaultBottomTab() {
        return this.defaultBottomTab;
    }

    public final List<SupportItem> getSupportViews() {
        return this.supportViews;
    }

    public final boolean isBookmarkOnTestToolbar() {
        return this.isBookmarkOnTestToolbar;
    }

    public final boolean getBookmarkOnHomeToolbarEnabled() {
        return this.bookmarkOnHomeToolbarEnabled;
    }

    public final boolean getDefaultPlanBannerDesign() {
        return this.defaultPlanBannerDesign;
    }

    public final NavDrawerItems getNavDrawerItems() {
        return this.navDrawerItems;
    }

    public final List<QbankItem> getQbankItems() {
        return this.qbankItems;
    }

    public final List<SearchItem> getSearchItems() {
        return this.searchItems;
    }

    public final SettingsItems getSettingsItems() {
        return this.settingsItems;
    }

    public final List<BottomTabItem> getSupportedBottomTabs() {
        return this.supportedBottomTabs;
    }

    public final List<TestItem> getTestItems() {
        return this.testItems;
    }

    public final List<TestTabItem> getTestTabItems() {
        return this.testTabItems;
    }

    public final List<VideoItem> getVideoItems() {
        return this.videoItems;
    }

    public final List<VideoPageItem> getVideoPageTabs() {
        return this.videoPageTabs;
    }

    public final List<HomePageItems> getHomePageItems() {
        return this.homePageItems;
    }

    public final List<String> getDeeplinks() {
        return this.deeplinks;
    }

    public final CourseStrings getCourseStrings() {
        return this.courseStrings;
    }

    public final boolean isMagicModuleEnabled() {
        return this.isMagicModuleEnabled;
    }

    public final List<AcademicYear> getAcademicYears() {
        return this.academicYears;
    }

    public final EditionSwitch getEditionSwitch() {
        return this.editionSwitch;
    }

    public final Map<String, QBankGroupItem> getQBankGroupMeta() {
        return this.qBankGroupMeta;
    }

    public final CustomModuleConfig getCustomModuleConfig() {
        return this.customModuleConfig;
    }

    public final List<PracticalItems> getPracticalItems() {
        return this.practicalItems;
    }

    public final List<ZenAreaItem> getZenArea() {
        return this.zenArea;
    }

    public final VideoProperties getVideoProperties() {
        return this.videoProperties;
    }

    public final boolean getShowNotesWatermark() {
        return this.showNotesWatermark;
    }

    public final List<VideoSubjectPageItem> getVideoSubjectPageItems() {
        return this.videoSubjectPageItems;
    }

    public final GtAnalyticsCard getGtAnalyticsCard() {
        return this.gtAnalyticsCard;
    }

    public /* synthetic */ CourseConfigV2(boolean z, boolean z2, BottomTabItem bottomTabItem, List list, boolean z3, boolean z4, boolean z5, NavDrawerItems navDrawerItems, List list2, List list3, SettingsItems settingsItems, List list4, List list5, List list6, List list7, List list8, List list9, List list10, CourseStrings courseStrings, boolean z6, List list11, EditionSwitch editionSwitch, Map map, CustomModuleConfig customModuleConfig, List list12, List list13, VideoProperties videoProperties, boolean z7, List list14, GtAnalyticsCard gtAnalyticsCard, List list15, EditionUpdatePopup editionUpdatePopup, PlanScreenConfig planScreenConfig, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(z, z2, bottomTabItem, list, z3, z4, z5, navDrawerItems, list2, list3, settingsItems, list4, list5, list6, list7, list8, list9, list10, courseStrings, z6, list11, editionSwitch, map, customModuleConfig, list12, list13, videoProperties, z7, list14, gtAnalyticsCard, (i & 1073741824) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list15, (i & Integer.MIN_VALUE) != 0 ? null : editionUpdatePopup, (i2 & 1) != 0 ? null : planScreenConfig);
    }

    public final List<AnnouncementBanner> getAnnouncementBanners() {
        return this.announcementBanners;
    }

    public final EditionUpdatePopup getEditionUpdatePopup() {
        return this.editionUpdatePopup;
    }

    public final PlanScreenConfig getPlanScreenConfig() {
        return this.planScreenConfig;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$CustomModuleConfig;", "", "", "", "p0", "Lcom/marrow/data/models/common/CourseConfigV2$CustomModuleQuestionSource;", "p1", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/marrow/data/models/common/CourseConfigV2$CustomModuleConfig;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "questionLimit", "Ljava/util/List;", "getQuestionLimit", "questionSource", "getQuestionSource"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomModuleConfig {
        private final List<Integer> questionLimit;
        private final List<CustomModuleQuestionSource> questionSource;

        public CustomModuleConfig(List<Integer> list, List<CustomModuleQuestionSource> list2) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(list2, "");
            this.questionLimit = list;
            this.questionSource = list2;
        }

        public final List<Integer> getQuestionLimit() {
            return this.questionLimit;
        }

        public final List<CustomModuleQuestionSource> getQuestionSource() {
            return this.questionSource;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CustomModuleConfig copy$default(CustomModuleConfig customModuleConfig, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = customModuleConfig.questionLimit;
            }
            if ((i & 2) != 0) {
                list2 = customModuleConfig.questionSource;
            }
            return customModuleConfig.copy(list, list2);
        }

        public final List<Integer> component1() {
            return this.questionLimit;
        }

        public final List<CustomModuleQuestionSource> component2() {
            return this.questionSource;
        }

        public final CustomModuleConfig copy(List<Integer> p0, List<CustomModuleQuestionSource> p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new CustomModuleConfig(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof CustomModuleConfig)) {
                return false;
            }
            CustomModuleConfig customModuleConfig = (CustomModuleConfig) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.questionLimit, customModuleConfig.questionLimit) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.questionSource, customModuleConfig.questionSource);
        }

        public final int hashCode() {
            return (this.questionLimit.hashCode() * 31) + this.questionSource.hashCode();
        }

        public final String toString() {
            List<Integer> list = this.questionLimit;
            List<CustomModuleQuestionSource> list2 = this.questionSource;
            StringBuilder sb = new StringBuilder("CustomModuleConfig(questionLimit=");
            sb.append(list);
            sb.append(", questionSource=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsTestIntroFooterEnabled() {
        return this.isTestIntroFooterEnabled;
    }

    public final List<SearchItem> component10() {
        return this.searchItems;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SettingsItems getSettingsItems() {
        return this.settingsItems;
    }

    public final List<BottomTabItem> component12() {
        return this.supportedBottomTabs;
    }

    public final List<TestItem> component13() {
        return this.testItems;
    }

    public final List<TestTabItem> component14() {
        return this.testTabItems;
    }

    public final List<VideoItem> component15() {
        return this.videoItems;
    }

    public final List<VideoPageItem> component16() {
        return this.videoPageTabs;
    }

    public final List<HomePageItems> component17() {
        return this.homePageItems;
    }

    public final List<String> component18() {
        return this.deeplinks;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final CourseStrings getCourseStrings() {
        return this.courseStrings;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$CustomModuleQuestionSource;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/common/CourseConfigV2$CustomModuleQuestionSource;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "label", "Ljava/lang/String;", "getLabel", "type", "getType", "category", "getCategory"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomModuleQuestionSource {
        private final String category;
        private final String label;
        private final String type;

        public CustomModuleQuestionSource(String str, String str2, String str3) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.label = str;
            this.type = str2;
            this.category = str3;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getType() {
            return this.type;
        }

        public final String getCategory() {
            return this.category;
        }

        public static /* synthetic */ CustomModuleQuestionSource copy$default(CustomModuleQuestionSource customModuleQuestionSource, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customModuleQuestionSource.label;
            }
            if ((i & 2) != 0) {
                str2 = customModuleQuestionSource.type;
            }
            if ((i & 4) != 0) {
                str3 = customModuleQuestionSource.category;
            }
            return customModuleQuestionSource.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        public final CustomModuleQuestionSource copy(String p0, String p1, String p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            return new CustomModuleQuestionSource(p0, p1, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof CustomModuleQuestionSource)) {
                return false;
            }
            CustomModuleQuestionSource customModuleQuestionSource = (CustomModuleQuestionSource) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.label, (Object) customModuleQuestionSource.label) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.type, (Object) customModuleQuestionSource.type) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.category, (Object) customModuleQuestionSource.category);
        }

        public final int hashCode() {
            return (((this.label.hashCode() * 31) + this.type.hashCode()) * 31) + this.category.hashCode();
        }

        public final String toString() {
            String str = this.label;
            String str2 = this.type;
            String str3 = this.category;
            StringBuilder sb = new StringBuilder("CustomModuleQuestionSource(label=");
            sb.append(str);
            sb.append(", type=");
            sb.append(str2);
            sb.append(", category=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowGoProButton() {
        return this.showGoProButton;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getIsMagicModuleEnabled() {
        return this.isMagicModuleEnabled;
    }

    public final List<AcademicYear> component21() {
        return this.academicYears;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final EditionSwitch getEditionSwitch() {
        return this.editionSwitch;
    }

    public final Map<String, QBankGroupItem> component23() {
        return this.qBankGroupMeta;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJV\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u001d\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\rR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\rR\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\rR\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\rR\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010\r"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$CourseStrings;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/common/CourseConfigV2$CourseStrings;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "qbankHeaderTitle", "Ljava/lang/String;", "getQbankHeaderTitle", "testHeaderTitle", "getTestHeaderTitle", "videoHeaderTitle", "getVideoHeaderTitle", "searchDescription", "getSearchDescription", "searchHint", "getSearchHint", "videoPageNotesTitle", "getVideoPageNotesTitle", "buyNowHighlight", "getBuyNowHighlight"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CourseStrings {
        private final String buyNowHighlight;
        private final String qbankHeaderTitle;
        private final String searchDescription;
        private final String searchHint;
        private final String testHeaderTitle;
        private final String videoHeaderTitle;
        private final String videoPageNotesTitle;

        public CourseStrings(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            toMagicModuleMetaRepoModel.write(str5, "");
            toMagicModuleMetaRepoModel.write(str6, "");
            toMagicModuleMetaRepoModel.write(str7, "");
            this.qbankHeaderTitle = str;
            this.testHeaderTitle = str2;
            this.videoHeaderTitle = str3;
            this.searchDescription = str4;
            this.searchHint = str5;
            this.videoPageNotesTitle = str6;
            this.buyNowHighlight = str7;
        }

        public final String getQbankHeaderTitle() {
            return this.qbankHeaderTitle;
        }

        public final String getTestHeaderTitle() {
            return this.testHeaderTitle;
        }

        public final String getVideoHeaderTitle() {
            return this.videoHeaderTitle;
        }

        public final String getSearchDescription() {
            return this.searchDescription;
        }

        public final String getSearchHint() {
            return this.searchHint;
        }

        public final String getVideoPageNotesTitle() {
            return this.videoPageNotesTitle;
        }

        public final String getBuyNowHighlight() {
            return this.buyNowHighlight;
        }

        public static /* synthetic */ CourseStrings copy$default(CourseStrings courseStrings, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = courseStrings.qbankHeaderTitle;
            }
            if ((i & 2) != 0) {
                str2 = courseStrings.testHeaderTitle;
            }
            String str8 = str2;
            if ((i & 4) != 0) {
                str3 = courseStrings.videoHeaderTitle;
            }
            String str9 = str3;
            if ((i & 8) != 0) {
                str4 = courseStrings.searchDescription;
            }
            String str10 = str4;
            if ((i & 16) != 0) {
                str5 = courseStrings.searchHint;
            }
            String str11 = str5;
            if ((i & 32) != 0) {
                str6 = courseStrings.videoPageNotesTitle;
            }
            String str12 = str6;
            if ((i & 64) != 0) {
                str7 = courseStrings.buyNowHighlight;
            }
            return courseStrings.copy(str, str8, str9, str10, str11, str12, str7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getQbankHeaderTitle() {
            return this.qbankHeaderTitle;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTestHeaderTitle() {
            return this.testHeaderTitle;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getVideoHeaderTitle() {
            return this.videoHeaderTitle;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSearchDescription() {
            return this.searchDescription;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSearchHint() {
            return this.searchHint;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getVideoPageNotesTitle() {
            return this.videoPageNotesTitle;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getBuyNowHighlight() {
            return this.buyNowHighlight;
        }

        public final CourseStrings copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            toMagicModuleMetaRepoModel.write(p4, "");
            toMagicModuleMetaRepoModel.write(p5, "");
            toMagicModuleMetaRepoModel.write(p6, "");
            return new CourseStrings(p0, p1, p2, p3, p4, p5, p6);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof CourseStrings)) {
                return false;
            }
            CourseStrings courseStrings = (CourseStrings) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.qbankHeaderTitle, (Object) courseStrings.qbankHeaderTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.testHeaderTitle, (Object) courseStrings.testHeaderTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.videoHeaderTitle, (Object) courseStrings.videoHeaderTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.searchDescription, (Object) courseStrings.searchDescription) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.searchHint, (Object) courseStrings.searchHint) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.videoPageNotesTitle, (Object) courseStrings.videoPageNotesTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.buyNowHighlight, (Object) courseStrings.buyNowHighlight);
        }

        public final int hashCode() {
            return (((((((((((this.qbankHeaderTitle.hashCode() * 31) + this.testHeaderTitle.hashCode()) * 31) + this.videoHeaderTitle.hashCode()) * 31) + this.searchDescription.hashCode()) * 31) + this.searchHint.hashCode()) * 31) + this.videoPageNotesTitle.hashCode()) * 31) + this.buyNowHighlight.hashCode();
        }

        public final String toString() {
            String str = this.qbankHeaderTitle;
            String str2 = this.testHeaderTitle;
            String str3 = this.videoHeaderTitle;
            String str4 = this.searchDescription;
            String str5 = this.searchHint;
            String str6 = this.videoPageNotesTitle;
            String str7 = this.buyNowHighlight;
            StringBuilder sb = new StringBuilder("CourseStrings(qbankHeaderTitle=");
            sb.append(str);
            sb.append(", testHeaderTitle=");
            sb.append(str2);
            sb.append(", videoHeaderTitle=");
            sb.append(str3);
            sb.append(", searchDescription=");
            sb.append(str4);
            sb.append(", searchHint=");
            sb.append(str5);
            sb.append(", videoPageNotesTitle=");
            sb.append(str6);
            sb.append(", buyNowHighlight=");
            sb.append(str7);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final CustomModuleConfig getCustomModuleConfig() {
        return this.customModuleConfig;
    }

    public final List<PracticalItems> component25() {
        return this.practicalItems;
    }

    public final List<ZenAreaItem> component26() {
        return this.zenArea;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final VideoProperties getVideoProperties() {
        return this.videoProperties;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final boolean getShowNotesWatermark() {
        return this.showNotesWatermark;
    }

    public final List<VideoSubjectPageItem> component29() {
        return this.videoSubjectPageItems;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BottomTabItem getDefaultBottomTab() {
        return this.defaultBottomTab;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final GtAnalyticsCard getGtAnalyticsCard() {
        return this.gtAnalyticsCard;
    }

    public final List<AnnouncementBanner> component31() {
        return this.announcementBanners;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final EditionUpdatePopup getEditionUpdatePopup() {
        return this.editionUpdatePopup;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ@\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00028G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItems;", "", "", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "p0", "p1", "p2", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItems;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "bottomSection", "Ljava/util/List;", "getBottomSection", "middleSection", "getMiddleSection", "topSection", "getTopSection", "getAllItems", "allItems"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavDrawerItems {
        private final List<NavDrawerItem> bottomSection;
        private final List<NavDrawerItem> middleSection;
        private final List<NavDrawerItem> topSection;

        /* JADX WARN: Multi-variable type inference failed */
        public NavDrawerItems(List<? extends NavDrawerItem> list, List<? extends NavDrawerItem> list2, List<? extends NavDrawerItem> list3) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(list2, "");
            toMagicModuleMetaRepoModel.write(list3, "");
            this.bottomSection = list;
            this.middleSection = list2;
            this.topSection = list3;
        }

        public /* synthetic */ NavDrawerItems(List list, List list2, List list3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list3);
        }

        public final List<NavDrawerItem> getBottomSection() {
            return this.bottomSection;
        }

        public final List<NavDrawerItem> getMiddleSection() {
            return this.middleSection;
        }

        public final List<NavDrawerItem> getTopSection() {
            return this.topSection;
        }

        public final List<NavDrawerItem> getAllItems() {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.topSection);
            arrayList.addAll(this.middleSection);
            arrayList.addAll(this.bottomSection);
            return arrayList;
        }

        public NavDrawerItems() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NavDrawerItems copy$default(NavDrawerItems navDrawerItems, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = navDrawerItems.bottomSection;
            }
            if ((i & 2) != 0) {
                list2 = navDrawerItems.middleSection;
            }
            if ((i & 4) != 0) {
                list3 = navDrawerItems.topSection;
            }
            return navDrawerItems.copy(list, list2, list3);
        }

        public final List<NavDrawerItem> component1() {
            return this.bottomSection;
        }

        public final List<NavDrawerItem> component2() {
            return this.middleSection;
        }

        public final List<NavDrawerItem> component3() {
            return this.topSection;
        }

        public final NavDrawerItems copy(List<? extends NavDrawerItem> p0, List<? extends NavDrawerItem> p1, List<? extends NavDrawerItem> p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            return new NavDrawerItems(p0, p1, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof NavDrawerItems)) {
                return false;
            }
            NavDrawerItems navDrawerItems = (NavDrawerItems) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.bottomSection, navDrawerItems.bottomSection) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.middleSection, navDrawerItems.middleSection) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.topSection, navDrawerItems.topSection);
        }

        public final int hashCode() {
            return (((this.bottomSection.hashCode() * 31) + this.middleSection.hashCode()) * 31) + this.topSection.hashCode();
        }

        public final String toString() {
            List<NavDrawerItem> list = this.bottomSection;
            List<NavDrawerItem> list2 = this.middleSection;
            List<NavDrawerItem> list3 = this.topSection;
            StringBuilder sb = new StringBuilder("NavDrawerItems(bottomSection=");
            sb.append(list);
            sb.append(", middleSection=");
            sb.append(list2);
            sb.append(", topSection=");
            sb.append(list3);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final PlanScreenConfig getPlanScreenConfig() {
        return this.planScreenConfig;
    }

    public final List<SupportItem> component4() {
        return this.supportViews;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsBookmarkOnTestToolbar() {
        return this.isBookmarkOnTestToolbar;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getBookmarkOnHomeToolbarEnabled() {
        return this.bookmarkOnHomeToolbarEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getDefaultPlanBannerDesign() {
        return this.defaultPlanBannerDesign;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final NavDrawerItems getNavDrawerItems() {
        return this.navDrawerItems;
    }

    public final List<QbankItem> component9() {
        return this.qbankItems;
    }

    public final CourseConfigV2 copy(boolean p0, boolean p1, BottomTabItem p2, List<? extends SupportItem> p3, boolean p4, boolean p5, boolean p6, NavDrawerItems p7, List<? extends QbankItem> p8, List<? extends SearchItem> p9, SettingsItems p10, List<? extends BottomTabItem> p11, List<? extends TestItem> p12, List<? extends TestTabItem> p13, List<? extends VideoItem> p14, List<? extends VideoPageItem> p15, List<? extends HomePageItems> p16, List<String> p17, CourseStrings p18, boolean p19, List<AcademicYear> p20, EditionSwitch p21, Map<String, QBankGroupItem> p22, CustomModuleConfig p23, List<? extends PracticalItems> p24, List<ZenAreaItem> p25, VideoProperties p26, boolean p27, List<VideoSubjectPageItem> p28, GtAnalyticsCard p29, List<AnnouncementBanner> p30, EditionUpdatePopup p31, PlanScreenConfig p32) {
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p7, "");
        toMagicModuleMetaRepoModel.write(p8, "");
        toMagicModuleMetaRepoModel.write(p9, "");
        toMagicModuleMetaRepoModel.write(p10, "");
        toMagicModuleMetaRepoModel.write(p11, "");
        toMagicModuleMetaRepoModel.write(p12, "");
        toMagicModuleMetaRepoModel.write(p13, "");
        toMagicModuleMetaRepoModel.write(p14, "");
        toMagicModuleMetaRepoModel.write(p15, "");
        toMagicModuleMetaRepoModel.write(p16, "");
        toMagicModuleMetaRepoModel.write(p17, "");
        toMagicModuleMetaRepoModel.write(p18, "");
        toMagicModuleMetaRepoModel.write(p20, "");
        toMagicModuleMetaRepoModel.write(p30, "");
        return new CourseConfigV2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CourseConfigV2)) {
            return false;
        }
        CourseConfigV2 courseConfigV2 = (CourseConfigV2) p0;
        return this.isTestIntroFooterEnabled == courseConfigV2.isTestIntroFooterEnabled && this.showGoProButton == courseConfigV2.showGoProButton && this.defaultBottomTab == courseConfigV2.defaultBottomTab && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.supportViews, courseConfigV2.supportViews) && this.isBookmarkOnTestToolbar == courseConfigV2.isBookmarkOnTestToolbar && this.bookmarkOnHomeToolbarEnabled == courseConfigV2.bookmarkOnHomeToolbarEnabled && this.defaultPlanBannerDesign == courseConfigV2.defaultPlanBannerDesign && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.navDrawerItems, courseConfigV2.navDrawerItems) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.qbankItems, courseConfigV2.qbankItems) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.searchItems, courseConfigV2.searchItems) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.settingsItems, courseConfigV2.settingsItems) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.supportedBottomTabs, courseConfigV2.supportedBottomTabs) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.testItems, courseConfigV2.testItems) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.testTabItems, courseConfigV2.testTabItems) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.videoItems, courseConfigV2.videoItems) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.videoPageTabs, courseConfigV2.videoPageTabs) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.homePageItems, courseConfigV2.homePageItems) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.deeplinks, courseConfigV2.deeplinks) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.courseStrings, courseConfigV2.courseStrings) && this.isMagicModuleEnabled == courseConfigV2.isMagicModuleEnabled && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.academicYears, courseConfigV2.academicYears) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.editionSwitch, courseConfigV2.editionSwitch) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.qBankGroupMeta, courseConfigV2.qBankGroupMeta) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.customModuleConfig, courseConfigV2.customModuleConfig) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.practicalItems, courseConfigV2.practicalItems) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.zenArea, courseConfigV2.zenArea) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.videoProperties, courseConfigV2.videoProperties) && this.showNotesWatermark == courseConfigV2.showNotesWatermark && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.videoSubjectPageItems, courseConfigV2.videoSubjectPageItems) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.gtAnalyticsCard, courseConfigV2.gtAnalyticsCard) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.announcementBanners, courseConfigV2.announcementBanners) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.editionUpdatePopup, courseConfigV2.editionUpdatePopup) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.planScreenConfig, courseConfigV2.planScreenConfig);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.isTestIntroFooterEnabled);
        int iHashCode2 = Boolean.hashCode(this.showGoProButton);
        int iHashCode3 = this.defaultBottomTab.hashCode();
        int iHashCode4 = this.supportViews.hashCode();
        int iHashCode5 = Boolean.hashCode(this.isBookmarkOnTestToolbar);
        int iHashCode6 = Boolean.hashCode(this.bookmarkOnHomeToolbarEnabled);
        int iHashCode7 = Boolean.hashCode(this.defaultPlanBannerDesign);
        int iHashCode8 = this.navDrawerItems.hashCode();
        int iHashCode9 = this.qbankItems.hashCode();
        int iHashCode10 = this.searchItems.hashCode();
        int iHashCode11 = this.settingsItems.hashCode();
        int iHashCode12 = this.supportedBottomTabs.hashCode();
        int iHashCode13 = this.testItems.hashCode();
        int iHashCode14 = this.testTabItems.hashCode();
        int iHashCode15 = this.videoItems.hashCode();
        int iHashCode16 = this.videoPageTabs.hashCode();
        int iHashCode17 = this.homePageItems.hashCode();
        int iHashCode18 = this.deeplinks.hashCode();
        int iHashCode19 = this.courseStrings.hashCode();
        int iHashCode20 = Boolean.hashCode(this.isMagicModuleEnabled);
        int iHashCode21 = this.academicYears.hashCode();
        EditionSwitch editionSwitch = this.editionSwitch;
        int iHashCode22 = editionSwitch == null ? 0 : editionSwitch.hashCode();
        Map<String, QBankGroupItem> map = this.qBankGroupMeta;
        int iHashCode23 = map == null ? 0 : map.hashCode();
        CustomModuleConfig customModuleConfig = this.customModuleConfig;
        int iHashCode24 = customModuleConfig == null ? 0 : customModuleConfig.hashCode();
        List<PracticalItems> list = this.practicalItems;
        int iHashCode25 = list == null ? 0 : list.hashCode();
        List<ZenAreaItem> list2 = this.zenArea;
        int iHashCode26 = list2 == null ? 0 : list2.hashCode();
        VideoProperties videoProperties = this.videoProperties;
        int iHashCode27 = videoProperties == null ? 0 : videoProperties.hashCode();
        int iHashCode28 = Boolean.hashCode(this.showNotesWatermark);
        List<VideoSubjectPageItem> list3 = this.videoSubjectPageItems;
        int iHashCode29 = list3 == null ? 0 : list3.hashCode();
        GtAnalyticsCard gtAnalyticsCard = this.gtAnalyticsCard;
        int iHashCode30 = gtAnalyticsCard == null ? 0 : gtAnalyticsCard.hashCode();
        int iHashCode31 = this.announcementBanners.hashCode();
        EditionUpdatePopup editionUpdatePopup = this.editionUpdatePopup;
        int iHashCode32 = editionUpdatePopup == null ? 0 : editionUpdatePopup.hashCode();
        PlanScreenConfig planScreenConfig = this.planScreenConfig;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + (planScreenConfig != null ? planScreenConfig.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.isTestIntroFooterEnabled;
        boolean z2 = this.showGoProButton;
        BottomTabItem bottomTabItem = this.defaultBottomTab;
        List<SupportItem> list = this.supportViews;
        boolean z3 = this.isBookmarkOnTestToolbar;
        boolean z4 = this.bookmarkOnHomeToolbarEnabled;
        boolean z5 = this.defaultPlanBannerDesign;
        NavDrawerItems navDrawerItems = this.navDrawerItems;
        List<QbankItem> list2 = this.qbankItems;
        List<SearchItem> list3 = this.searchItems;
        SettingsItems settingsItems = this.settingsItems;
        List<BottomTabItem> list4 = this.supportedBottomTabs;
        List<TestItem> list5 = this.testItems;
        List<TestTabItem> list6 = this.testTabItems;
        List<VideoItem> list7 = this.videoItems;
        List<VideoPageItem> list8 = this.videoPageTabs;
        List<HomePageItems> list9 = this.homePageItems;
        List<String> list10 = this.deeplinks;
        CourseStrings courseStrings = this.courseStrings;
        boolean z6 = this.isMagicModuleEnabled;
        List<AcademicYear> list11 = this.academicYears;
        EditionSwitch editionSwitch = this.editionSwitch;
        Map<String, QBankGroupItem> map = this.qBankGroupMeta;
        CustomModuleConfig customModuleConfig = this.customModuleConfig;
        List<PracticalItems> list12 = this.practicalItems;
        List<ZenAreaItem> list13 = this.zenArea;
        VideoProperties videoProperties = this.videoProperties;
        boolean z7 = this.showNotesWatermark;
        List<VideoSubjectPageItem> list14 = this.videoSubjectPageItems;
        GtAnalyticsCard gtAnalyticsCard = this.gtAnalyticsCard;
        List<AnnouncementBanner> list15 = this.announcementBanners;
        EditionUpdatePopup editionUpdatePopup = this.editionUpdatePopup;
        PlanScreenConfig planScreenConfig = this.planScreenConfig;
        StringBuilder sb = new StringBuilder("CourseConfigV2(isTestIntroFooterEnabled=");
        sb.append(z);
        sb.append(", showGoProButton=");
        sb.append(z2);
        sb.append(", defaultBottomTab=");
        sb.append(bottomTabItem);
        sb.append(", supportViews=");
        sb.append(list);
        sb.append(", isBookmarkOnTestToolbar=");
        sb.append(z3);
        sb.append(", bookmarkOnHomeToolbarEnabled=");
        sb.append(z4);
        sb.append(", defaultPlanBannerDesign=");
        sb.append(z5);
        sb.append(", navDrawerItems=");
        sb.append(navDrawerItems);
        sb.append(", qbankItems=");
        sb.append(list2);
        sb.append(", searchItems=");
        sb.append(list3);
        sb.append(", settingsItems=");
        sb.append(settingsItems);
        sb.append(", supportedBottomTabs=");
        sb.append(list4);
        sb.append(", testItems=");
        sb.append(list5);
        sb.append(", testTabItems=");
        sb.append(list6);
        sb.append(", videoItems=");
        sb.append(list7);
        sb.append(", videoPageTabs=");
        sb.append(list8);
        sb.append(", homePageItems=");
        sb.append(list9);
        sb.append(", deeplinks=");
        sb.append(list10);
        sb.append(", courseStrings=");
        sb.append(courseStrings);
        sb.append(", isMagicModuleEnabled=");
        sb.append(z6);
        sb.append(", academicYears=");
        sb.append(list11);
        sb.append(", editionSwitch=");
        sb.append(editionSwitch);
        sb.append(", qBankGroupMeta=");
        sb.append(map);
        sb.append(", customModuleConfig=");
        sb.append(customModuleConfig);
        sb.append(", practicalItems=");
        sb.append(list12);
        sb.append(", zenArea=");
        sb.append(list13);
        sb.append(", videoProperties=");
        sb.append(videoProperties);
        sb.append(", showNotesWatermark=");
        sb.append(z7);
        sb.append(", videoSubjectPageItems=");
        sb.append(list14);
        sb.append(", gtAnalyticsCard=");
        sb.append(gtAnalyticsCard);
        sb.append(", announcementBanners=");
        sb.append(list15);
        sb.append(", editionUpdatePopup=");
        sb.append(editionUpdatePopup);
        sb.append(", planScreenConfig=");
        sb.append(planScreenConfig);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ@\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00028G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$SettingsItems;", "", "", "Lcom/marrow/data/models/common/CourseConfigV2$SettingsItem;", "p0", "p1", "p2", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/marrow/data/models/common/CourseConfigV2$SettingsItems;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "accountSettings", "Ljava/util/List;", "getAccountSettings", "appSettings", "getAppSettings", "mainSettings", "getMainSettings", "getAllSettings", "allSettings"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SettingsItems {
        private final List<SettingsItem> accountSettings;
        private final List<SettingsItem> appSettings;
        private final List<SettingsItem> mainSettings;

        /* JADX WARN: Multi-variable type inference failed */
        public SettingsItems(List<? extends SettingsItem> list, List<? extends SettingsItem> list2, List<? extends SettingsItem> list3) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(list2, "");
            toMagicModuleMetaRepoModel.write(list3, "");
            this.accountSettings = list;
            this.appSettings = list2;
            this.mainSettings = list3;
        }

        public /* synthetic */ SettingsItems(List list, List list2, List list3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list3);
        }

        public final List<SettingsItem> getAccountSettings() {
            return this.accountSettings;
        }

        public final List<SettingsItem> getAppSettings() {
            return this.appSettings;
        }

        public final List<SettingsItem> getMainSettings() {
            return this.mainSettings;
        }

        public final List<SettingsItem> getAllSettings() {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.accountSettings);
            arrayList.addAll(this.appSettings);
            arrayList.addAll(this.mainSettings);
            return arrayList;
        }

        public SettingsItems() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SettingsItems copy$default(SettingsItems settingsItems, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = settingsItems.accountSettings;
            }
            if ((i & 2) != 0) {
                list2 = settingsItems.appSettings;
            }
            if ((i & 4) != 0) {
                list3 = settingsItems.mainSettings;
            }
            return settingsItems.copy(list, list2, list3);
        }

        public final List<SettingsItem> component1() {
            return this.accountSettings;
        }

        public final List<SettingsItem> component2() {
            return this.appSettings;
        }

        public final List<SettingsItem> component3() {
            return this.mainSettings;
        }

        public final SettingsItems copy(List<? extends SettingsItem> p0, List<? extends SettingsItem> p1, List<? extends SettingsItem> p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            return new SettingsItems(p0, p1, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof SettingsItems)) {
                return false;
            }
            SettingsItems settingsItems = (SettingsItems) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.accountSettings, settingsItems.accountSettings) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.appSettings, settingsItems.appSettings) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.mainSettings, settingsItems.mainSettings);
        }

        public final int hashCode() {
            return (((this.accountSettings.hashCode() * 31) + this.appSettings.hashCode()) * 31) + this.mainSettings.hashCode();
        }

        public final String toString() {
            List<SettingsItem> list = this.accountSettings;
            List<SettingsItem> list2 = this.appSettings;
            List<SettingsItem> list3 = this.mainSettings;
            StringBuilder sb = new StringBuilder("SettingsItems(accountSettings=");
            sb.append(list);
            sb.append(", appSettings=");
            sb.append(list2);
            sb.append(", mainSettings=");
            sb.append(list3);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$EditionSwitch;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/marrow/data/models/common/CourseConfigV2$EditionSwitch;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "title", "Ljava/lang/String;", "getTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditionSwitch {
        private final String title;

        public EditionSwitch(String str) {
            this.title = str;
        }

        public final String getTitle() {
            return this.title;
        }

        public static /* synthetic */ EditionSwitch copy$default(EditionSwitch editionSwitch, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = editionSwitch.title;
            }
            return editionSwitch.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final EditionSwitch copy(String p0) {
            return new EditionSwitch(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof EditionSwitch) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) ((EditionSwitch) p0).title);
        }

        public final int hashCode() {
            String str = this.title;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            String str = this.title;
            StringBuilder sb = new StringBuilder("EditionSwitch(title=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "", "<init>", "()V", "YourCourse", "MyPlan", "BuyNow", "AddVideo", "MarrowNotes", "DownloadPdfNotes", "FreeExtension", "KnowMore", "Faq", "ContactUs", "AboutUs", "RateUs", "Tnc", "Share", "ReportPiracy", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$AboutUs;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$AddVideo;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$BuyNow;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$ContactUs;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$DownloadPdfNotes;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$Faq;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$FreeExtension;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$KnowMore;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$MarrowNotes;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$MyPlan;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$RateUs;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$ReportPiracy;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$Share;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$Tnc;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$YourCourse;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class NavDrawerItem {

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$YourCourse;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class YourCourse extends NavDrawerItem {
            public static final YourCourse INSTANCE = new YourCourse();

            private YourCourse() {
                super(null);
            }
        }

        private NavDrawerItem() {
        }

        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$MyPlan;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class MyPlan extends NavDrawerItem {
            public static final MyPlan INSTANCE = new MyPlan();

            private MyPlan() {
                super(null);
            }
        }

        public /* synthetic */ NavDrawerItem(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$BuyNow;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class BuyNow extends NavDrawerItem {
            public static final BuyNow INSTANCE = new BuyNow();

            private BuyNow() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes5.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$AddVideo;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AddVideo extends NavDrawerItem {
            public static final AddVideo INSTANCE = new AddVideo();

            private AddVideo() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$MarrowNotes;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class MarrowNotes extends NavDrawerItem {
            public static final MarrowNotes INSTANCE = new MarrowNotes();

            private MarrowNotes() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$DownloadPdfNotes;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "title", "getTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class DownloadPdfNotes extends NavDrawerItem {
            private final String title;
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DownloadPdfNotes(String str, String str2) {
                super(null);
                toMagicModuleMetaRepoModel.write(str, "");
                toMagicModuleMetaRepoModel.write(str2, "");
                this.url = str;
                this.title = str2;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getUrl() {
                return this.url;
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$FreeExtension;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class FreeExtension extends NavDrawerItem {
            public static final FreeExtension INSTANCE = new FreeExtension();

            private FreeExtension() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$KnowMore;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class KnowMore extends NavDrawerItem {
            public static final KnowMore INSTANCE = new KnowMore();

            private KnowMore() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$Faq;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Faq extends NavDrawerItem {
            public static final Faq INSTANCE = new Faq();

            private Faq() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$ContactUs;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ContactUs extends NavDrawerItem {
            public static final ContactUs INSTANCE = new ContactUs();

            private ContactUs() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$AboutUs;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AboutUs extends NavDrawerItem {
            public static final AboutUs INSTANCE = new AboutUs();

            private AboutUs() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$RateUs;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class RateUs extends NavDrawerItem {
            public static final RateUs INSTANCE = new RateUs();

            private RateUs() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$Tnc;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Tnc extends NavDrawerItem {
            public static final Tnc INSTANCE = new Tnc();

            private Tnc() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$Share;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Share extends NavDrawerItem {
            public static final Share INSTANCE = new Share();

            private Share() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes3.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem$ReportPiracy;", "Lcom/marrow/data/models/common/CourseConfigV2$NavDrawerItem;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ReportPiracy extends NavDrawerItem {
            public static final ReportPiracy INSTANCE = new ReportPiracy();

            private ReportPiracy() {
                super(null);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$SettingsItem;", "", "<init>", "(Ljava/lang/String;I)V", "PLAN_PAGE", "THEME", "VIBRATION", "RESET", "CHANGE_PASSWORD", "CHANGE_PH_NO", "KYC_VERIFICATION", "PLAN_UPGRADE"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SettingsItem {
        private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
        private static final /* synthetic */ SettingsItem[] $VALUES;
        public static final SettingsItem PLAN_PAGE = new SettingsItem("PLAN_PAGE", 0);
        public static final SettingsItem THEME = new SettingsItem("THEME", 1);
        public static final SettingsItem VIBRATION = new SettingsItem("VIBRATION", 2);
        public static final SettingsItem RESET = new SettingsItem("RESET", 3);
        public static final SettingsItem CHANGE_PASSWORD = new SettingsItem("CHANGE_PASSWORD", 4);
        public static final SettingsItem CHANGE_PH_NO = new SettingsItem("CHANGE_PH_NO", 5);
        public static final SettingsItem KYC_VERIFICATION = new SettingsItem("KYC_VERIFICATION", 6);
        public static final SettingsItem PLAN_UPGRADE = new SettingsItem("PLAN_UPGRADE", 7);

        private SettingsItem(String str, int i) {
        }

        static {
            SettingsItem[] settingsItemArr$values = $values();
            $VALUES = settingsItemArr$values;
            $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(settingsItemArr$values);
        }

        private static final /* synthetic */ SettingsItem[] $values() {
            return new SettingsItem[]{PLAN_PAGE, THEME, VIBRATION, RESET, CHANGE_PASSWORD, CHANGE_PH_NO, KYC_VERIFICATION, PLAN_UPGRADE};
        }

        public static getMagicModuleSavedMcqCount<SettingsItem> getEntries() {
            return $ENTRIES;
        }

        public static SettingsItem valueOf(String str) {
            return (SettingsItem) Enum.valueOf(SettingsItem.class, str);
        }

        public static SettingsItem[] values() {
            return (SettingsItem[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$BottomTabItem;", "", "<init>", "(Ljava/lang/String;I)V", "HOME", "QBANK", "TEST", "VIDEO"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BottomTabItem {
        private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
        private static final /* synthetic */ BottomTabItem[] $VALUES;
        public static final BottomTabItem HOME = new BottomTabItem("HOME", 0);
        public static final BottomTabItem QBANK = new BottomTabItem("QBANK", 1);
        public static final BottomTabItem TEST = new BottomTabItem("TEST", 2);
        public static final BottomTabItem VIDEO = new BottomTabItem("VIDEO", 3);

        private BottomTabItem(String str, int i) {
        }

        static {
            BottomTabItem[] bottomTabItemArr$values = $values();
            $VALUES = bottomTabItemArr$values;
            $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(bottomTabItemArr$values);
        }

        private static final /* synthetic */ BottomTabItem[] $values() {
            return new BottomTabItem[]{HOME, QBANK, TEST, VIDEO};
        }

        public static getMagicModuleSavedMcqCount<BottomTabItem> getEntries() {
            return $ENTRIES;
        }

        public static BottomTabItem valueOf(String str) {
            return (BottomTabItem) Enum.valueOf(BottomTabItem.class, str);
        }

        public static BottomTabItem[] values() {
            return (BottomTabItem[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$SupportItem;", "", "<init>", "(Ljava/lang/String;I)V", "FAQ", "GET_CALL", "SUPPORT_MAIL", "PRIVACY_POLICY", "CANCEL_POLICY"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SupportItem {
        private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
        private static final /* synthetic */ SupportItem[] $VALUES;
        public static final SupportItem FAQ = new SupportItem("FAQ", 0);
        public static final SupportItem GET_CALL = new SupportItem("GET_CALL", 1);
        public static final SupportItem SUPPORT_MAIL = new SupportItem("SUPPORT_MAIL", 2);
        public static final SupportItem PRIVACY_POLICY = new SupportItem("PRIVACY_POLICY", 3);
        public static final SupportItem CANCEL_POLICY = new SupportItem("CANCEL_POLICY", 4);

        private SupportItem(String str, int i) {
        }

        static {
            SupportItem[] supportItemArr$values = $values();
            $VALUES = supportItemArr$values;
            $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(supportItemArr$values);
        }

        private static final /* synthetic */ SupportItem[] $values() {
            return new SupportItem[]{FAQ, GET_CALL, SUPPORT_MAIL, PRIVACY_POLICY, CANCEL_POLICY};
        }

        public static getMagicModuleSavedMcqCount<SupportItem> getEntries() {
            return $ENTRIES;
        }

        public static SupportItem valueOf(String str) {
            return (SupportItem) Enum.valueOf(SupportItem.class, str);
        }

        public static SupportItem[] values() {
            return (SupportItem[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$QbankItem;", "", "<init>", "(Ljava/lang/String;I)V", "WOQ", "QBANK_MANIFESTO", "CUSTOM_MODULE", "SCHEMA"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QbankItem {
        private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
        private static final /* synthetic */ QbankItem[] $VALUES;
        public static final QbankItem WOQ = new QbankItem("WOQ", 0);
        public static final QbankItem QBANK_MANIFESTO = new QbankItem("QBANK_MANIFESTO", 1);
        public static final QbankItem CUSTOM_MODULE = new QbankItem("CUSTOM_MODULE", 2);
        public static final QbankItem SCHEMA = new QbankItem("SCHEMA", 3);

        private QbankItem(String str, int i) {
        }

        static {
            QbankItem[] qbankItemArr$values = $values();
            $VALUES = qbankItemArr$values;
            $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(qbankItemArr$values);
        }

        private static final /* synthetic */ QbankItem[] $values() {
            return new QbankItem[]{WOQ, QBANK_MANIFESTO, CUSTOM_MODULE, SCHEMA};
        }

        public static getMagicModuleSavedMcqCount<QbankItem> getEntries() {
            return $ENTRIES;
        }

        public static QbankItem valueOf(String str) {
            return (QbankItem) Enum.valueOf(QbankItem.class, str);
        }

        public static QbankItem[] values() {
            return (QbankItem[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$SearchItem;", "", "<init>", "(Ljava/lang/String;I)V", "QBANK", "VIDEO", "TEST", "PEARL", "MCQ"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SearchItem {
        private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
        private static final /* synthetic */ SearchItem[] $VALUES;
        public static final SearchItem QBANK = new SearchItem("QBANK", 0);
        public static final SearchItem VIDEO = new SearchItem("VIDEO", 1);
        public static final SearchItem TEST = new SearchItem("TEST", 2);
        public static final SearchItem PEARL = new SearchItem("PEARL", 3);
        public static final SearchItem MCQ = new SearchItem("MCQ", 4);

        private SearchItem(String str, int i) {
        }

        static {
            SearchItem[] searchItemArr$values = $values();
            $VALUES = searchItemArr$values;
            $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(searchItemArr$values);
        }

        private static final /* synthetic */ SearchItem[] $values() {
            return new SearchItem[]{QBANK, VIDEO, TEST, PEARL, MCQ};
        }

        public static getMagicModuleSavedMcqCount<SearchItem> getEntries() {
            return $ENTRIES;
        }

        public static SearchItem valueOf(String str) {
            return (SearchItem) Enum.valueOf(SearchItem.class, str);
        }

        public static SearchItem[] values() {
            return (SearchItem[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$TestItem;", "", "<init>", "(Ljava/lang/String;I)V", "STATE_RANK"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TestItem {
        private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
        private static final /* synthetic */ TestItem[] $VALUES;
        public static final TestItem STATE_RANK = new TestItem("STATE_RANK", 0);

        private TestItem(String str, int i) {
        }

        static {
            TestItem[] testItemArr$values = $values();
            $VALUES = testItemArr$values;
            $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(testItemArr$values);
        }

        private static final /* synthetic */ TestItem[] $values() {
            return new TestItem[]{STATE_RANK};
        }

        public static getMagicModuleSavedMcqCount<TestItem> getEntries() {
            return $ENTRIES;
        }

        public static TestItem valueOf(String str) {
            return (TestItem) Enum.valueOf(TestItem.class, str);
        }

        public static TestItem[] values() {
            return (TestItem[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$TestTabItem;", "", "<init>", "(Ljava/lang/String;I)V", "MCQ_200", "GRAND", "ALL", "MINI", "SUBJECT"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TestTabItem {
        private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
        private static final /* synthetic */ TestTabItem[] $VALUES;
        public static final TestTabItem MCQ_200 = new TestTabItem("MCQ_200", 0);
        public static final TestTabItem GRAND = new TestTabItem("GRAND", 1);
        public static final TestTabItem ALL = new TestTabItem("ALL", 2);
        public static final TestTabItem MINI = new TestTabItem("MINI", 3);
        public static final TestTabItem SUBJECT = new TestTabItem("SUBJECT", 4);

        private TestTabItem(String str, int i) {
        }

        static {
            TestTabItem[] testTabItemArr$values = $values();
            $VALUES = testTabItemArr$values;
            $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(testTabItemArr$values);
        }

        private static final /* synthetic */ TestTabItem[] $values() {
            return new TestTabItem[]{MCQ_200, GRAND, ALL, MINI, SUBJECT};
        }

        public static getMagicModuleSavedMcqCount<TestTabItem> getEntries() {
            return $ENTRIES;
        }

        public static TestTabItem valueOf(String str) {
            return (TestTabItem) Enum.valueOf(TestTabItem.class, str);
        }

        public static TestTabItem[] values() {
            return (TestTabItem[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$VideoItem;", "", "<init>", "(Ljava/lang/String;I)V", "EDITION_SWITCH", "INTERN_MODE", "SAMPLE_VIDEO", "OPTIONAL_VIDEO", "GO_PRO", "KEY_VIDEO_BOOKMARKS"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class VideoItem {
        private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
        private static final /* synthetic */ VideoItem[] $VALUES;
        public static final VideoItem EDITION_SWITCH = new VideoItem("EDITION_SWITCH", 0);
        public static final VideoItem INTERN_MODE = new VideoItem("INTERN_MODE", 1);
        public static final VideoItem SAMPLE_VIDEO = new VideoItem("SAMPLE_VIDEO", 2);
        public static final VideoItem OPTIONAL_VIDEO = new VideoItem("OPTIONAL_VIDEO", 3);
        public static final VideoItem GO_PRO = new VideoItem("GO_PRO", 4);
        public static final VideoItem KEY_VIDEO_BOOKMARKS = new VideoItem("KEY_VIDEO_BOOKMARKS", 5);

        private VideoItem(String str, int i) {
        }

        static {
            VideoItem[] videoItemArr$values = $values();
            $VALUES = videoItemArr$values;
            $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(videoItemArr$values);
        }

        private static final /* synthetic */ VideoItem[] $values() {
            return new VideoItem[]{EDITION_SWITCH, INTERN_MODE, SAMPLE_VIDEO, OPTIONAL_VIDEO, GO_PRO, KEY_VIDEO_BOOKMARKS};
        }

        public static getMagicModuleSavedMcqCount<VideoItem> getEntries() {
            return $ENTRIES;
        }

        public static VideoItem valueOf(String str) {
            return (VideoItem) Enum.valueOf(VideoItem.class, str);
        }

        public static VideoItem[] values() {
            return (VideoItem[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$VideoPageItem;", "", "<init>", "(Ljava/lang/String;I)V", "OVERVIEW", "NOTES", "RELATED_MODULE"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class VideoPageItem {
        private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
        private static final /* synthetic */ VideoPageItem[] $VALUES;
        public static final VideoPageItem OVERVIEW = new VideoPageItem("OVERVIEW", 0);
        public static final VideoPageItem NOTES = new VideoPageItem("NOTES", 1);
        public static final VideoPageItem RELATED_MODULE = new VideoPageItem("RELATED_MODULE", 2);

        private VideoPageItem(String str, int i) {
        }

        static {
            VideoPageItem[] videoPageItemArr$values = $values();
            $VALUES = videoPageItemArr$values;
            $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(videoPageItemArr$values);
        }

        private static final /* synthetic */ VideoPageItem[] $values() {
            return new VideoPageItem[]{OVERVIEW, NOTES, RELATED_MODULE};
        }

        public static getMagicModuleSavedMcqCount<VideoPageItem> getEntries() {
            return $ENTRIES;
        }

        public static VideoPageItem valueOf(String str) {
            return (VideoPageItem) Enum.valueOf(VideoPageItem.class, str);
        }

        public static VideoPageItem[] values() {
            return (VideoPageItem[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$HomePageItems;", "", "<init>", "(Ljava/lang/String;I)V", "MCQ_OF_THE_DAY", "FEATURED_CARD", "SUGGESTED_TEST", "SUGGESTED_QBANK", "SUGGESTED_VIDEO", "PEARLS", "RECENT_UPDATES", "RENEW_CARD", "MAGIC_MODULE"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HomePageItems {
        private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
        private static final /* synthetic */ HomePageItems[] $VALUES;
        public static final HomePageItems MCQ_OF_THE_DAY = new HomePageItems("MCQ_OF_THE_DAY", 0);
        public static final HomePageItems FEATURED_CARD = new HomePageItems("FEATURED_CARD", 1);
        public static final HomePageItems SUGGESTED_TEST = new HomePageItems("SUGGESTED_TEST", 2);
        public static final HomePageItems SUGGESTED_QBANK = new HomePageItems("SUGGESTED_QBANK", 3);
        public static final HomePageItems SUGGESTED_VIDEO = new HomePageItems("SUGGESTED_VIDEO", 4);
        public static final HomePageItems PEARLS = new HomePageItems("PEARLS", 5);
        public static final HomePageItems RECENT_UPDATES = new HomePageItems("RECENT_UPDATES", 6);
        public static final HomePageItems RENEW_CARD = new HomePageItems("RENEW_CARD", 7);
        public static final HomePageItems MAGIC_MODULE = new HomePageItems("MAGIC_MODULE", 8);

        private HomePageItems(String str, int i) {
        }

        static {
            HomePageItems[] homePageItemsArr$values = $values();
            $VALUES = homePageItemsArr$values;
            $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(homePageItemsArr$values);
        }

        private static final /* synthetic */ HomePageItems[] $values() {
            return new HomePageItems[]{MCQ_OF_THE_DAY, FEATURED_CARD, SUGGESTED_TEST, SUGGESTED_QBANK, SUGGESTED_VIDEO, PEARLS, RECENT_UPDATES, RENEW_CARD, MAGIC_MODULE};
        }

        public static getMagicModuleSavedMcqCount<HomePageItems> getEntries() {
            return $ENTRIES;
        }

        public static HomePageItems valueOf(String str) {
            return (HomePageItems) Enum.valueOf(HomePageItems.class, str);
        }

        public static HomePageItems[] values() {
            return (HomePageItems[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$PracticalItems;", "", "<init>", "(Ljava/lang/String;I)V", "MCQ_OF_THE_DAY", "SUBJECT_LIST"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PracticalItems {
        private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
        private static final /* synthetic */ PracticalItems[] $VALUES;
        public static final PracticalItems MCQ_OF_THE_DAY = new PracticalItems("MCQ_OF_THE_DAY", 0);
        public static final PracticalItems SUBJECT_LIST = new PracticalItems("SUBJECT_LIST", 1);

        private PracticalItems(String str, int i) {
        }

        static {
            PracticalItems[] practicalItemsArr$values = $values();
            $VALUES = practicalItemsArr$values;
            $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(practicalItemsArr$values);
        }

        private static final /* synthetic */ PracticalItems[] $values() {
            return new PracticalItems[]{MCQ_OF_THE_DAY, SUBJECT_LIST};
        }

        public static getMagicModuleSavedMcqCount<PracticalItems> getEntries() {
            return $ENTRIES;
        }

        public static PracticalItems valueOf(String str) {
            return (PracticalItems) Enum.valueOf(PracticalItems.class, str);
        }

        public static PracticalItems[] values() {
            return (PracticalItems[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$QBankGroupItem;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/marrow/data/models/common/CourseConfigV2$QBankGroupItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "subjectPrefix", "Ljava/lang/String;", "getSubjectPrefix"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QBankGroupItem {
        private final String subjectPrefix;

        public QBankGroupItem(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.subjectPrefix = str;
        }

        public final String getSubjectPrefix() {
            return this.subjectPrefix;
        }

        public static /* synthetic */ QBankGroupItem copy$default(QBankGroupItem qBankGroupItem, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = qBankGroupItem.subjectPrefix;
            }
            return qBankGroupItem.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSubjectPrefix() {
            return this.subjectPrefix;
        }

        public final QBankGroupItem copy(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new QBankGroupItem(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof QBankGroupItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subjectPrefix, (Object) ((QBankGroupItem) p0).subjectPrefix);
        }

        public final int hashCode() {
            return this.subjectPrefix.hashCode();
        }

        public final String toString() {
            String str = this.subjectPrefix;
            StringBuilder sb = new StringBuilder("QBankGroupItem(subjectPrefix=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$ZenAreaItem;", "", "", "", "p0", "p1", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "component1", "()Ljava/util/Map;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/Map;Ljava/lang/String;)Lcom/marrow/data/models/common/CourseConfigV2$ZenAreaItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "meta", "Ljava/util/Map;", "getMeta", "type", "Ljava/lang/String;", "getType"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ZenAreaItem {
        private final Map<String, Object> meta;
        private final String type;

        public ZenAreaItem(Map<String, ? extends Object> map, String str) {
            toMagicModuleMetaRepoModel.write(map, "");
            toMagicModuleMetaRepoModel.write(str, "");
            this.meta = map;
            this.type = str;
        }

        public final Map<String, Object> getMeta() {
            return this.meta;
        }

        public final String getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ZenAreaItem copy$default(ZenAreaItem zenAreaItem, Map map, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                map = zenAreaItem.meta;
            }
            if ((i & 2) != 0) {
                str = zenAreaItem.type;
            }
            return zenAreaItem.copy(map, str);
        }

        public final Map<String, Object> component1() {
            return this.meta;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final ZenAreaItem copy(Map<String, ? extends Object> p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new ZenAreaItem(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof ZenAreaItem)) {
                return false;
            }
            ZenAreaItem zenAreaItem = (ZenAreaItem) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.meta, zenAreaItem.meta) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.type, (Object) zenAreaItem.type);
        }

        public final int hashCode() {
            return (this.meta.hashCode() * 31) + this.type.hashCode();
        }

        public final String toString() {
            Map<String, Object> map = this.meta;
            String str = this.type;
            StringBuilder sb = new StringBuilder("ZenAreaItem(meta=");
            sb.append(map);
            sb.append(", type=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u001c\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$AcademicYear;", "", "", "p0", "p1", "", "p2", "<init>", "(JJLjava/lang/String;)V", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "copy", "(JJLjava/lang/String;)Lcom/marrow/data/models/common/CourseConfigV2$AcademicYear;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "startDate", "J", "getStartDate", "endDate", "getEndDate", "label", "Ljava/lang/String;", "getLabel"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcademicYear {
        private final long endDate;
        private final String label;
        private final long startDate;

        public AcademicYear(long j, long j2, String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.startDate = j;
            this.endDate = j2;
            this.label = str;
        }

        public final long getStartDate() {
            return this.startDate;
        }

        public final long getEndDate() {
            return this.endDate;
        }

        public final String getLabel() {
            return this.label;
        }

        public static /* synthetic */ AcademicYear copy$default(AcademicYear academicYear, long j, long j2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = academicYear.startDate;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = academicYear.endDate;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = academicYear.label;
            }
            return academicYear.copy(j3, j4, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getStartDate() {
            return this.startDate;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getEndDate() {
            return this.endDate;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final AcademicYear copy(long p0, long p1, String p2) {
            toMagicModuleMetaRepoModel.write(p2, "");
            return new AcademicYear(p0, p1, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AcademicYear)) {
                return false;
            }
            AcademicYear academicYear = (AcademicYear) p0;
            return this.startDate == academicYear.startDate && this.endDate == academicYear.endDate && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.label, (Object) academicYear.label);
        }

        public final int hashCode() {
            return (((Long.hashCode(this.startDate) * 31) + Long.hashCode(this.endDate)) * 31) + this.label.hashCode();
        }

        public final String toString() {
            long j = this.startDate;
            long j2 = this.endDate;
            String str = this.label;
            StringBuilder sb = new StringBuilder("AcademicYear(startDate=");
            sb.append(j);
            sb.append(", endDate=");
            sb.append(j2);
            sb.append(", label=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$VideoProperties;", "", "", "p0", "<init>", "(Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/marrow/data/models/common/CourseConfigV2$VideoProperties;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "introDurationSeconds", "Ljava/lang/Integer;", "getIntroDurationSeconds"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VideoProperties {
        private final Integer introDurationSeconds;

        public VideoProperties(Integer num) {
            this.introDurationSeconds = num;
        }

        public final Integer getIntroDurationSeconds() {
            return this.introDurationSeconds;
        }

        public static /* synthetic */ VideoProperties copy$default(VideoProperties videoProperties, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = videoProperties.introDurationSeconds;
            }
            return videoProperties.copy(num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getIntroDurationSeconds() {
            return this.introDurationSeconds;
        }

        public final VideoProperties copy(Integer p0) {
            return new VideoProperties(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof VideoProperties) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.introDurationSeconds, ((VideoProperties) p0).introDurationSeconds);
        }

        public final int hashCode() {
            Integer num = this.introDurationSeconds;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            Integer num = this.introDurationSeconds;
            StringBuilder sb = new StringBuilder("VideoProperties(introDurationSeconds=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JX\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000eR\u0017\u0010\u001d\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000eR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u000eR\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010\u000eR \u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0014"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$VideoSubjectPageItem;", "", "", "p0", "p1", "p2", "p3", "p4", "", "", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/marrow/data/models/common/CourseConfigV2$VideoSubjectPageItem;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", CourseConfigKeyConstantsKt.KEY_VIDEO_SUBJECT_ITEM_CHILD_TARGET, "getTarget", "title", "getTitle", "badgeText", "getBadgeText", "subText", "getSubText", "linkedGroupIds", "Ljava/util/List;", "getLinkedGroupIds"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VideoSubjectPageItem {
        private final String badgeText;
        private final String id;
        private final List<Integer> linkedGroupIds;
        private final String subText;
        private final String target;
        private final String title;

        public VideoSubjectPageItem(String str, String str2, String str3, String str4, String str5, List<Integer> list) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.id = str;
            this.target = str2;
            this.title = str3;
            this.badgeText = str4;
            this.subText = str5;
            this.linkedGroupIds = list;
        }

        public final String getId() {
            return this.id;
        }

        public final String getTarget() {
            return this.target;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getBadgeText() {
            return this.badgeText;
        }

        public final String getSubText() {
            return this.subText;
        }

        public /* synthetic */ VideoSubjectPageItem(String str, String str2, String str3, String str4, String str5, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(str, str2, str3, str4, str5, (i & 32) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
        }

        public final List<Integer> getLinkedGroupIds() {
            return this.linkedGroupIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VideoSubjectPageItem copy$default(VideoSubjectPageItem videoSubjectPageItem, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = videoSubjectPageItem.id;
            }
            if ((i & 2) != 0) {
                str2 = videoSubjectPageItem.target;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = videoSubjectPageItem.title;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = videoSubjectPageItem.badgeText;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = videoSubjectPageItem.subText;
            }
            String str9 = str5;
            if ((i & 32) != 0) {
                list = videoSubjectPageItem.linkedGroupIds;
            }
            return videoSubjectPageItem.copy(str, str6, str7, str8, str9, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getBadgeText() {
            return this.badgeText;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSubText() {
            return this.subText;
        }

        public final List<Integer> component6() {
            return this.linkedGroupIds;
        }

        public final VideoSubjectPageItem copy(String p0, String p1, String p2, String p3, String p4, List<Integer> p5) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p5, "");
            return new VideoSubjectPageItem(p0, p1, p2, p3, p4, p5);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof VideoSubjectPageItem)) {
                return false;
            }
            VideoSubjectPageItem videoSubjectPageItem = (VideoSubjectPageItem) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) videoSubjectPageItem.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.target, (Object) videoSubjectPageItem.target) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) videoSubjectPageItem.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.badgeText, (Object) videoSubjectPageItem.badgeText) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subText, (Object) videoSubjectPageItem.subText) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.linkedGroupIds, videoSubjectPageItem.linkedGroupIds);
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode();
            String str = this.target;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            int iHashCode3 = this.title.hashCode();
            String str2 = this.badgeText;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.subText;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.linkedGroupIds.hashCode();
        }

        public final String toString() {
            String str = this.id;
            String str2 = this.target;
            String str3 = this.title;
            String str4 = this.badgeText;
            String str5 = this.subText;
            List<Integer> list = this.linkedGroupIds;
            StringBuilder sb = new StringBuilder("VideoSubjectPageItem(id=");
            sb.append(str);
            sb.append(", target=");
            sb.append(str2);
            sb.append(", title=");
            sb.append(str3);
            sb.append(", badgeText=");
            sb.append(str4);
            sb.append(", subText=");
            sb.append(str5);
            sb.append(", linkedGroupIds=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$Companion;", "", "<init>", "()V", "", "p0", "Lcom/marrow/data/models/common/CourseConfigV2;", "fromJson", "(Ljava/lang/String;)Lcom/marrow/data/models/common/CourseConfigV2;", "toJson", "(Lcom/marrow/data/models/common/CourseConfigV2;)Ljava/lang/String;", "WORLD_OF_REVISION_ID", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private static short[] write;
        private static final byte[] $$c = {77, 21, 89, -51};
        private static final int $$f = 227;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {67, -110, -113, 74, -19, -10, -3, -8, 9, 20, -6, 5};
        private static final int $$e = 239;
        private static final byte[] $$a = {18, -64, -35, -97, 11, -19, 23, TarConstants.LF_DIR, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1, 1, 21, -15, 0};
        private static final int $$b = 52;
        private static int MediaBrowserCompatCustomActionResultReceiver = 0;
        private static int AudioAttributesImplBaseParcelizer = 1;
        private static int RemoteActionCompatParcelizer = -1966636080;
        private static int IconCompatParcelizer = -819363194;
        private static int read = -472363600;
        private static byte[] AudioAttributesCompatParcelizer = {57, 71, 32, 89, 56, 71, 63, 112, -11, TarConstants.LF_CHR, 28, -50, -52, 16, 32, 31, TarConstants.LF_FIFO, -64, 18, 28, -59, 10, -9, 32, 59, 32, -60, -52, 31, 95, -118, -52, 73, 60, -79, 65, -14, -7, 66, -8, 74, -21, 69, -7, -113, -79, 65, 71, -8, -123, 3, -13, 67, -3, -126, -76, 87, -9, -114, -33, 19, -33, -36, 39, -11, -72, -11, -119, -69, -68, -102, -8, -111, -102, -117, -82, -9, -118, 121, 77, 115, 78, 127, 25, 2, 89, 1, TarConstants.LF_GNUTYPE_SPARSE, -94, TarConstants.LF_CONTIG, -67, -82, -119, -98, -2, -85, -12, 12, -111, 12, 8, 2, -121, -35, -20, 101, -35, 109, -21, 111, -46, -24, 110, 111, -22, 97, -37, 10, -47, -60, 8, -44, 109, TarConstants.LF_FIFO, -40, 90, TarConstants.LF_FIFO, -11, -96, 58, 80, -58, 98, TarConstants.LF_NORMAL, 96, 58, 93, -76, -43, -73, -19, -26, -26, 73, -70, 100, -66, 25, -69, 33, 40, 40, 69, -76, -81, -34, -109, -96, -47, -60, -109, -40, -81, -33, 74, 27, 70, 77, 27, 69, 20, -76, 28, 41, 70, 21, 74, 26, 79, -74, -92, 82, -74, -119, 126, TarConstants.LF_GNUTYPE_LONGLINK, 72, 67, -119, 113, 89, 66, -77, -10, TarConstants.LF_GNUTYPE_LONGLINK, 82, 66, 93, 65, -113, -50, -53, -52, -55, 25, 119, -64, 123, -48, 59, -76, 114, -42, -95, -69, -81, -24, -96, -39, -95, 96, -6, -40, -94, 96, 41, -70, -22, -96, -11, 97, -9, 108, -11, 111, TarConstants.LF_NORMAL, 58, 62, TarConstants.LF_NORMAL, 62, 62, 69, TarConstants.LF_CHR, TarConstants.LF_NORMAL, 107, -12, -107, 86, TarConstants.LF_SYMLINK, -13, -106, 63, 38, 98, 63, 59, 99, -124, -52, -103, -109, -60, -38, -119, -86, TarConstants.LF_BLK, -102, -46, -117, -73, 73, -99, -115, -75, -62, -40, 77, -113, -14, -33, -67, -49, -121, 8, -76, -78, 70, -36, 26, 27, -13, 13, -55, TarConstants.LF_CONTIG, 59, -78, -54, -120, -103, 117, 112, 112, 114, -20, 58, -82, -86, -88, 112, -86, 125, -41, 63, -96, -70, 63, 117, -87, -41, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73};
        private static char[] AudioAttributesImplApi21Parcelizer = {44830, 44719, 44706, 44717, 44707, 44729, 45050, 44911, 44909, 44904, 44885, 44907, 44898, 44909, 44976, 45030, 45027, 45050, 45051, 44997, 44996, 45050, 45048, 45025, 45025, 45049, 45054, 45025, 45032, 45033, 45031, 45051, 45037, 45037, 44999, 44999, 45027, 45030, 45049, 45052, 45052, 45018, 45019, 45025, 45001, 44814, 44813, 45040, 44811, 45053, 45052, 45046, 45046, 44800, 45053, 45040, 45043, 44690, 44692, 44696, 44703, 44701, 44702, 44716, 44710, 45007, 44824, 45042, 45048, 44828, 44825, 44801, 44806, 45050, 45042, 44828, 44825, 44825, 44990, 45030, 45051, 45051, 45029, 44990, 45050, 45030, 44883, 44893, 44893, 44892, 44893, 44884, 44880, 44880, 44885, 44855, 44854, 44885, 44892, 44895, 44885, 44987, 45024, 45027, 45037, 45030, 45031, 45051, 45050, 44987, 45038, 45024, 45050, 45051, 45024, 45030, 45025, 45038, 45026, 45030, 45031, 45035, 44873, 44872, 44854, 44860, 44849, 44853, 44852, 44848, 44860, 44855, 44855, 44855, 44872, 44981, 45040, 45029, 45050, 45043, 45055, 45049, 45047, 44915, 44927, 44923, 44927, 44921, 44889, 44979, 45049, 44994, 44824, 44816, 44843, 44843, 44829, 45004, 44804, 45001, 44815, 45041, 45054, 45052, 45047, 44808, 44814, 44812, 45044, 45013, 44979, 45029, 45031, 45026, 45037, 45049, 45052, 45027, 45035, 45027, 45025, 45050, 45048, 45051, 44983, 45041, 44823, 44872, 44872, 44853, 44850, 44863, 44816, 44830, 44859, 44861, 44987, 45024, 45050, 45024, 45024, 45027, 44992, 45017, 45052, 45051, 45025, 45024, 45026, 45030, 45019, 45019, 45030, 44992, 45019, 45052, 45052, 45019, 44992, 44977, 45031, 45038, 44995, 44871, 44803, 44866, 44873, 44854, 44803, 44877, 44853, 44868, 44871, 44889, 44899, 44898, 44900, 44898, 44846, 44905, 44884, 44893, 44898, 44846, 44904, 44880, 44957, 44996, 45027, 45030, 45049, 45052, 45052, 45019, 44996, 45025, 45039, 45031, 44990, 45039, 44994, 45018, 45050, 45027, 45027, 45027, 45031, 45016, 44996, 45008, 44892, 44901, 44896, 44922, 44976, 45030, 44992, 44995, 44989, 45028, 45037, 45031, 45028, 45033, 45027, 45028, 45031, 45027, 45036, 44957, 44995, 45032, 45024, 45024, 44994, 44999, 45031, 45027, 45032, 45036, 44999, 45017, 45031, 45039, 45025, 44996, 44957, 45019, 45024, 45039, 45025, 44996, 44982, 45052, 45049, 45030, 45027, 44996, 44994, 45039, 45025, 44996, 44964, 44995, 45028, 45052, 45019, 44965, 45019, 44957, 44992, 45039, 45033, 45024, 45029, 45024, 45039, 45033, 44992, 44996, 45025, 45039, 44994, 44996, 45027, 45030, 45049, 45052, 45052, 45019, 44917, 44687, 44917, 44849, 44849, 44912, 44927, 44900, 44686, 44849, 44922, 44917, 44849, 44915, 44923, 44682, 45035, 44910, 44675, 44675, 44684, 44917, 44918, 44907, 44911, 44685, 44687, 44905, 44908, 44683, 44886, 44906, 44918, 44914, 44925, 44881, 44904, 44681, 44680, 44686, 44910, 44814, 44682, 44919, 44904, 44909, 44683, 44915, 44917, 44904, 44873, 44911, 44672, 44672, 44978, 44997, 45019, 45049, 45051, 45051, 45048, 45028, 44996, 44992, 45027, 45026, 45030, 45019, 44995, 45027, 45050, 44967, 45007, 44964, 44985, 44993, 45006, 45052, 44678, 44708, 44711, 44716, 44684, 44979, 45049, 45051, 45051, 45048, 45028, 44996, 45035, 44878, 44864, 44865, 44835, 44847, 44874, 44867, 44836, 44858, 44895};

        private static String $$g(byte b, short s, byte b2) {
            int i = 3 - (b * 3);
            byte[] bArr = $$c;
            int i2 = 112 - (s * 3);
            int i3 = b2 * 3;
            byte[] bArr2 = new byte[i3 + 1];
            int i4 = -1;
            if (bArr == null) {
                i4 = -1;
                i2 = i + i2;
                i = i;
            }
            while (true) {
                int i5 = i4 + 1;
                bArr2[i5] = (byte) i2;
                if (i5 == i3) {
                    return new String(bArr2, 0);
                }
                int i6 = i + 1;
                i4 = i5;
                i2 = bArr[i6] + i2;
                i = i6;
            }
        }

        private static void a(byte b, short s, short s2, Object[] objArr) {
            int i = b + TarConstants.LF_GNUTYPE_LONGLINK;
            byte[] bArr = $$d;
            int i2 = s + 4;
            byte[] bArr2 = new byte[s2 + 3];
            int i3 = s2 + 2;
            int i4 = -1;
            if (bArr == null) {
                i = i + i3 + 6;
            }
            while (true) {
                i4++;
                i2++;
                bArr2[i4] = (byte) i;
                if (i4 == i3) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i = i + bArr[i2] + 6;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(byte r5, int r6, byte r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 9
                int r7 = r7 + 106
                int r6 = r6 * 11
                int r0 = r6 + 5
                byte[] r1 = com.marrow.data.models.common.CourseConfigV2.Companion.$$a
                int r5 = r5 * 15
                int r5 = r5 + 4
                byte[] r0 = new byte[r0]
                int r6 = r6 + 4
                r2 = 0
                if (r1 != 0) goto L18
                r4 = r5
                r3 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L26:
                r4 = r1[r5]
                int r3 = r3 + 1
            L2a:
                int r5 = r5 + 1
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + 2
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow.data.models.common.CourseConfigV2.Companion.d(byte, int, byte, java.lang.Object[]):void");
        }

        private static void c(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2;
            int i3 = 2 % 2;
            buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr = AudioAttributesImplApi21Parcelizer;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $10 + 17;
                    $11 = i9 % 128;
                    if (i9 % i2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                            if (objRemoteActionCompatParcelizer == null) {
                                objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.getSize(0) + 11613, 20 - View.MeasureSpec.makeMeasureSpec(0, 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                            }
                            cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-338863922);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 1), Color.rgb(0, 0, 0) + 16788829, 20 - KeyEvent.getDeadChar(0, 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                            }
                            cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                            i8++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i2 = 2;
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i5];
            System.arraycopy(cArr, i4, cArr3, 0, i5);
            if (bArr != null) {
                char[] cArr4 = new char[i5];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                int i10 = $10 + 89;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char c = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                    if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                        int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 22958 - TextUtils.indexOf((CharSequence) "", '0'), 42 - TextUtils.lastIndexOf("", '0'), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                    } else {
                        int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr5 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1859710730);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (31589 - TextUtils.getCapsMode("", 0, 0)), 9863 - Gravity.getAbsoluteGravity(0, 0), Color.red(0) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                    }
                    c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                    Object[] objArr6 = {buildsetstopreasonintent, buildsetstopreasonintent};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1104966666);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (37822 - View.combineMeasuredStates(0, 0)), View.MeasureSpec.getMode(0) + 9754, TextUtils.lastIndexOf("", '0', 0, 0) + 28, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                    int i14 = $11 + 7;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                }
                cArr3 = cArr4;
            }
            if (i7 > 0) {
                int i16 = $11 + 19;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr3, 0, cArr5, 0, i5);
                int i18 = i5 - i7;
                System.arraycopy(cArr5, 0, cArr3, i18, i7);
                System.arraycopy(cArr5, i7, cArr3, 0, i18);
            }
            if (z) {
                char[] cArr6 = new char[i5];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                    cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i5 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                    buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                }
                cArr3 = cArr6;
            }
            if (i6 > 0) {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                    int i19 = $10 + 43;
                    $11 = i19 % 128;
                    if (i19 % 2 == 0) {
                        cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] << iArr[3]);
                        i = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    } else {
                        cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                        i = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                    }
                    buildsetstopreasonintent.RemoteActionCompatParcelizer = i;
                }
            }
            objArr[0] = new String(cArr3);
        }

        private static void b(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
            int i4;
            int length;
            byte[] bArr;
            int i5;
            int i6 = 2 % 2;
            buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IconCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Process.myPid() >> 22), 24298 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                int i7 = iIntValue == -1 ? 1 : 0;
                if (i7 != 1) {
                    i4 = 2;
                } else {
                    byte[] bArr2 = AudioAttributesCompatParcelizer;
                    if (bArr2 != null) {
                        int i8 = $10 + 41;
                        $11 = i8 % 128;
                        if (i8 % 2 == 0) {
                            length = bArr2.length;
                            bArr = new byte[length];
                            i5 = 1;
                        } else {
                            length = bArr2.length;
                            bArr = new byte[length];
                            i5 = 0;
                        }
                        while (i5 < length) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i5])};
                                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                                if (objRemoteActionCompatParcelizer2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 3082 - View.getDefaultSize(0, 0), TextUtils.getOffsetBefore("", 0) + 128, 2145850993, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr[i5] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                                i5++;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr2 = bArr;
                    }
                    if (bArr2 != null) {
                        byte[] bArr3 = AudioAttributesCompatParcelizer;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(RemoteActionCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) View.combineMeasuredStates(0, 0), ExpandableListView.getPackedPositionChild(0L) + 24298, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L)));
                        i4 = 2;
                    } else {
                        iIntValue = (short) (((short) (((long) write[i2 + ((int) (((long) RemoteActionCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L)));
                        int i9 = $10 + 121;
                        $11 = i9 % 128;
                        i4 = 2;
                        int i10 = i9 % 2;
                    }
                }
                if (iIntValue > 0) {
                    int i11 = $10 + 25;
                    $11 = i11 % 128;
                    int i12 = i11 % i4;
                    buildresumedownloadsintent.read = ((i2 + iIntValue) - i4) + ((int) (((long) RemoteActionCompatParcelizer) ^ 7899112766888837815L)) + i7;
                    Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(read), sb};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 34134), (ViewConfiguration.getPressedStateDuration() >> 16) + 13432, 21 - (ViewConfiguration.getPressedStateDuration() >> 16), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    byte[] bArr4 = AudioAttributesCompatParcelizer;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i13 = 0; i13 < length2; i13++) {
                            int i14 = $11 + 35;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                            bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 7899112766888837815L);
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                    while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                        if (z) {
                            byte[] bArr6 = AudioAttributesCompatParcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                        } else {
                            short[] sArr = write;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                        }
                        sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                        buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                        buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                    }
                }
                String string = sb.toString();
                int i16 = $11 + 95;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                objArr[0] = string;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        private Companion() {
        }

        public final CourseConfigV2 fromJson(String p0) throws JsonProcessingException {
            int i = 2 % 2;
            toMagicModuleMetaRepoModel.write(p0, "");
            Object value = new ObjectMapper().readValue(p0, (Class<Object>) CourseConfigV2.class);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(value, "");
            CourseConfigV2 courseConfigV2 = (CourseConfigV2) value;
            int i2 = AudioAttributesImplBaseParcelizer + 113;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            return courseConfigV2;
        }

        public final String toJson(CourseConfigV2 p0) throws JsonProcessingException {
            int i = 2 % 2;
            toMagicModuleMetaRepoModel.write(p0, "");
            String strWriteValueAsString = new ObjectMapper().writeValueAsString(p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWriteValueAsString, "");
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 117;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                return strWriteValueAsString;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(72:551|3|4|(1:6)|7|8|9|(1:11)|12|13|(5:15|(2:17|(14:565|19|20|(1:22)|23|24|25|(1:27)|28|(5:30|(1:32)(1:33)|34|35|(0)(3:38|66|(6:68|69|(1:71)|72|73|(1:83)(1:86))(6:76|77|(1:79)|80|81|(0)(0))))(1:39)|(8:41|42|(1:44)|45|46|(0)(0)|66|(0)(0))|(6:49|50|(1:52)|53|54|(0)(2:66|(0)(0)))(1:57)|(6:59|60|(1:62)|63|64|(0))|86)(1:84))|564|85|86)(2:85|86)|87|88|(1:90)|91|(6:93|94|(1:96)|97|98|(10:100|101|(1:103)(1:104)|105|106|107|(1:109)(1:110)|111|(65:113|(1:115)|116|117|(0)(1:120)|130|(10:133|(1:135)(1:136)|137|138|(1:140)|141|142|(2:144|568)(2:145|567)|146|131)|566|147|(1:149)|153|154|(1:156)|157|158|159|(1:161)|162|163|(1:170)(1:169)|171|172|(1:174)(1:175)|176|177|178|(1:180)(1:181)|182|183|(1:190)(1:189)|191|(2:192|(6:194|195|(1:197)(1:198)|199|200|(2:570|202)(1:203))(2:569|204))|205|549|206|547|207|(2:539|209)|213|(7:215|216|(1:(2:218|(2:572|220)(1:221))(2:571|222))|223|(1:225)(8:227|228|533|229|(2:531|231)|235|(11:237|238|239|240|241|(1:243)(1:244)|245|246|247|248|(1:250)(9:251|252|(2:254|255)(1:256)|257|552|258|(1:260)|261|(0)(1:265)))|283)|226|283)(0)|284|(1:286)(1:287)|288|289|(1:291)|292|(3:294|(1:(2:296|(1:574)(1:299))(4:573|300|(6:302|303|(1:305)|306|307|(2:575|309)(1:310))|576))|311)(1:311)|312|560|313|314|(3:558|315|(3:317|(4:320|321|(5:577|323|537|324|(1:326))(1:327)|318)|578)(2:545|328))|340|(1:342)(12:343|(3:345|(3:348|(3:350|(1:585)(7:356|556|357|358|(4:562|359|360|(3:362|(4:365|366|(5:586|368|554|369|(3:581|371|(1:373)(1:374))(0))(1:375)|363)|587)(2:529|376))|388|582)|389)(1:580)|346)|579)|391|(1:393)(1:394)|395|396|(1:398)|399|400|(1:402)(1:403)|404|(6:406|407|(1:409)|410|411|412)(64:413|414|(1:416)|417|418|(1:420)(1:421)|422|423|(1:425)(1:426)|427|(1:429)(1:430)|431|(1:433)|434|435|436|(1:438)|439|440|441|(1:443)(1:444)|445|446|(1:448)|449|450|(1:452)(1:453)|454|455|456|(1:458)(1:459)|460|461|462|(1:464)|465|466|467|(1:469)|470|471|(1:473)(1:474)|475|476|(1:478)|479|480|(1:482)(1:483)|484|(5:486|487|(1:489)|490|491)|492|493|(1:495)|496|497|(1:499)(1:500)|501|502|(1:504)|505|543|506|507|508))|390|391|(0)(0)|395|396|(0)|399|400|(0)(0)|404|(0)(0))(1:121)|(61:123|124|(1:126)|127|128|(5:130|(1:131)|566|147|(0)(0))|153|154|(0)|157|158|159|(0)|162|163|(2:165|170)(0)|171|172|(0)(0)|176|177|178|(0)(0)|182|183|(2:185|190)(0)|191|(3:192|(0)(0)|203)|205|549|206|547|207|(0)|213|(0)(0)|284|(0)(0)|288|289|(0)|292|(0)(0)|312|560|313|314|(4:558|315|(0)(0)|578)|340|(0)(0)|390|391|(0)(0)|395|396|(0)|399|400|(0)(0)|404|(0)(0)))(1:150))(1:151)|152|153|154|(0)|157|158|159|(0)|162|163|(0)(0)|171|172|(0)(0)|176|177|178|(0)(0)|182|183|(0)(0)|191|(3:192|(0)(0)|203)|205|549|206|547|207|(0)|213|(0)(0)|284|(0)(0)|288|289|(0)|292|(0)(0)|312|560|313|314|(4:558|315|(0)(0)|578)|340|(0)(0)|390|391|(0)(0)|395|396|(0)|399|400|(0)(0)|404|(0)(0)) */
        /* JADX WARN: Can't wrap try/catch for region: R(75:0|2|551|3|4|(1:6)|7|8|9|(1:11)|12|13|(5:15|(2:17|(14:565|19|20|(1:22)|23|24|25|(1:27)|28|(5:30|(1:32)(1:33)|34|35|(0)(3:38|66|(6:68|69|(1:71)|72|73|(1:83)(1:86))(6:76|77|(1:79)|80|81|(0)(0))))(1:39)|(8:41|42|(1:44)|45|46|(0)(0)|66|(0)(0))|(6:49|50|(1:52)|53|54|(0)(2:66|(0)(0)))(1:57)|(6:59|60|(1:62)|63|64|(0))|86)(1:84))|564|85|86)(2:85|86)|87|88|(1:90)|91|(6:93|94|(1:96)|97|98|(10:100|101|(1:103)(1:104)|105|106|107|(1:109)(1:110)|111|(65:113|(1:115)|116|117|(0)(1:120)|130|(10:133|(1:135)(1:136)|137|138|(1:140)|141|142|(2:144|568)(2:145|567)|146|131)|566|147|(1:149)|153|154|(1:156)|157|158|159|(1:161)|162|163|(1:170)(1:169)|171|172|(1:174)(1:175)|176|177|178|(1:180)(1:181)|182|183|(1:190)(1:189)|191|(2:192|(6:194|195|(1:197)(1:198)|199|200|(2:570|202)(1:203))(2:569|204))|205|549|206|547|207|(2:539|209)|213|(7:215|216|(1:(2:218|(2:572|220)(1:221))(2:571|222))|223|(1:225)(8:227|228|533|229|(2:531|231)|235|(11:237|238|239|240|241|(1:243)(1:244)|245|246|247|248|(1:250)(9:251|252|(2:254|255)(1:256)|257|552|258|(1:260)|261|(0)(1:265)))|283)|226|283)(0)|284|(1:286)(1:287)|288|289|(1:291)|292|(3:294|(1:(2:296|(1:574)(1:299))(4:573|300|(6:302|303|(1:305)|306|307|(2:575|309)(1:310))|576))|311)(1:311)|312|560|313|314|(3:558|315|(3:317|(4:320|321|(5:577|323|537|324|(1:326))(1:327)|318)|578)(2:545|328))|340|(1:342)(12:343|(3:345|(3:348|(3:350|(1:585)(7:356|556|357|358|(4:562|359|360|(3:362|(4:365|366|(5:586|368|554|369|(3:581|371|(1:373)(1:374))(0))(1:375)|363)|587)(2:529|376))|388|582)|389)(1:580)|346)|579)|391|(1:393)(1:394)|395|396|(1:398)|399|400|(1:402)(1:403)|404|(6:406|407|(1:409)|410|411|412)(64:413|414|(1:416)|417|418|(1:420)(1:421)|422|423|(1:425)(1:426)|427|(1:429)(1:430)|431|(1:433)|434|435|436|(1:438)|439|440|441|(1:443)(1:444)|445|446|(1:448)|449|450|(1:452)(1:453)|454|455|456|(1:458)(1:459)|460|461|462|(1:464)|465|466|467|(1:469)|470|471|(1:473)(1:474)|475|476|(1:478)|479|480|(1:482)(1:483)|484|(5:486|487|(1:489)|490|491)|492|493|(1:495)|496|497|(1:499)(1:500)|501|502|(1:504)|505|543|506|507|508))|390|391|(0)(0)|395|396|(0)|399|400|(0)(0)|404|(0)(0))(1:121)|(61:123|124|(1:126)|127|128|(5:130|(1:131)|566|147|(0)(0))|153|154|(0)|157|158|159|(0)|162|163|(2:165|170)(0)|171|172|(0)(0)|176|177|178|(0)(0)|182|183|(2:185|190)(0)|191|(3:192|(0)(0)|203)|205|549|206|547|207|(0)|213|(0)(0)|284|(0)(0)|288|289|(0)|292|(0)(0)|312|560|313|314|(4:558|315|(0)(0)|578)|340|(0)(0)|390|391|(0)(0)|395|396|(0)|399|400|(0)(0)|404|(0)(0)))(1:150))(1:151)|152|153|154|(0)|157|158|159|(0)|162|163|(0)(0)|171|172|(0)(0)|176|177|178|(0)(0)|182|183|(0)(0)|191|(3:192|(0)(0)|203)|205|549|206|547|207|(0)|213|(0)(0)|284|(0)(0)|288|289|(0)|292|(0)(0)|312|560|313|314|(4:558|315|(0)(0)|578)|340|(0)(0)|390|391|(0)(0)|395|396|(0)|399|400|(0)(0)|404|(0)(0)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:332:0x2ba5, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:333:0x2ba6, code lost:
        
            r1 = r0;
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:337:0x2bae, code lost:
        
            r4 = null;
         */
        /* JADX WARN: Multi-variable search skipped. Vars limit reached: 6717 (expected less than 5000) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:133:0x16ef  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x18b8  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x1912 A[Catch: all -> 0x3ff6, TryCatch #19 {all -> 0x3ff6, blocks: (B:3:0x0014, B:6:0x0025, B:7:0x0057, B:9:0x015b, B:11:0x016b, B:12:0x01b0, B:20:0x0263, B:22:0x0270, B:23:0x02b1, B:25:0x02d4, B:27:0x02e1, B:28:0x0329, B:30:0x0332, B:32:0x034a, B:34:0x039a, B:69:0x07ca, B:71:0x07d7, B:72:0x081c, B:88:0x120a, B:90:0x1217, B:91:0x125d, B:94:0x1298, B:96:0x12a5, B:97:0x12f4, B:101:0x13fb, B:103:0x1408, B:105:0x1457, B:107:0x147a, B:109:0x1487, B:111:0x14ce, B:113:0x14d7, B:115:0x14ef, B:116:0x153c, B:138:0x17b0, B:140:0x17bd, B:141:0x17fd, B:154:0x1905, B:156:0x1912, B:157:0x1955, B:159:0x1a63, B:161:0x1a70, B:162:0x1ab4, B:172:0x1ba9, B:174:0x1bb6, B:176:0x1c01, B:178:0x1cdb, B:180:0x1ce8, B:182:0x1d2e, B:195:0x1ef2, B:197:0x1eff, B:199:0x1f4d, B:289:0x25c2, B:291:0x25cf, B:292:0x2611, B:303:0x2a0a, B:305:0x2a17, B:306:0x2a54, B:396:0x2ed8, B:398:0x2efb, B:399:0x2f46, B:407:0x303a, B:409:0x3040, B:410:0x3074, B:414:0x3088, B:416:0x308e, B:417:0x30cb, B:423:0x31a0, B:425:0x31a6, B:427:0x31df, B:429:0x3267, B:431:0x326f, B:433:0x328c, B:434:0x32bf, B:436:0x3380, B:438:0x3386, B:439:0x33ba, B:441:0x348e, B:443:0x3494, B:445:0x34cf, B:450:0x35ae, B:452:0x35bb, B:454:0x3606, B:456:0x37a3, B:458:0x37b6, B:460:0x37fa, B:462:0x38b7, B:464:0x38bd, B:465:0x38f1, B:467:0x39e1, B:469:0x3a05, B:470:0x3a4f, B:476:0x3b46, B:478:0x3b53, B:479:0x3b92, B:487:0x3c69, B:489:0x3c6f, B:490:0x3cad, B:493:0x3d67, B:495:0x3d6d, B:496:0x3da5, B:502:0x3eb2, B:504:0x3ee0, B:505:0x3f3b, B:124:0x15fe, B:126:0x1615, B:127:0x1661, B:77:0x08f2, B:79:0x08ff, B:80:0x0947, B:42:0x045a, B:44:0x0471, B:45:0x04bb, B:50:0x0552, B:52:0x0569, B:53:0x05b7, B:60:0x0676, B:62:0x068d, B:63:0x06db), top: B:551:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:161:0x1a70 A[Catch: all -> 0x3ff6, TryCatch #19 {all -> 0x3ff6, blocks: (B:3:0x0014, B:6:0x0025, B:7:0x0057, B:9:0x015b, B:11:0x016b, B:12:0x01b0, B:20:0x0263, B:22:0x0270, B:23:0x02b1, B:25:0x02d4, B:27:0x02e1, B:28:0x0329, B:30:0x0332, B:32:0x034a, B:34:0x039a, B:69:0x07ca, B:71:0x07d7, B:72:0x081c, B:88:0x120a, B:90:0x1217, B:91:0x125d, B:94:0x1298, B:96:0x12a5, B:97:0x12f4, B:101:0x13fb, B:103:0x1408, B:105:0x1457, B:107:0x147a, B:109:0x1487, B:111:0x14ce, B:113:0x14d7, B:115:0x14ef, B:116:0x153c, B:138:0x17b0, B:140:0x17bd, B:141:0x17fd, B:154:0x1905, B:156:0x1912, B:157:0x1955, B:159:0x1a63, B:161:0x1a70, B:162:0x1ab4, B:172:0x1ba9, B:174:0x1bb6, B:176:0x1c01, B:178:0x1cdb, B:180:0x1ce8, B:182:0x1d2e, B:195:0x1ef2, B:197:0x1eff, B:199:0x1f4d, B:289:0x25c2, B:291:0x25cf, B:292:0x2611, B:303:0x2a0a, B:305:0x2a17, B:306:0x2a54, B:396:0x2ed8, B:398:0x2efb, B:399:0x2f46, B:407:0x303a, B:409:0x3040, B:410:0x3074, B:414:0x3088, B:416:0x308e, B:417:0x30cb, B:423:0x31a0, B:425:0x31a6, B:427:0x31df, B:429:0x3267, B:431:0x326f, B:433:0x328c, B:434:0x32bf, B:436:0x3380, B:438:0x3386, B:439:0x33ba, B:441:0x348e, B:443:0x3494, B:445:0x34cf, B:450:0x35ae, B:452:0x35bb, B:454:0x3606, B:456:0x37a3, B:458:0x37b6, B:460:0x37fa, B:462:0x38b7, B:464:0x38bd, B:465:0x38f1, B:467:0x39e1, B:469:0x3a05, B:470:0x3a4f, B:476:0x3b46, B:478:0x3b53, B:479:0x3b92, B:487:0x3c69, B:489:0x3c6f, B:490:0x3cad, B:493:0x3d67, B:495:0x3d6d, B:496:0x3da5, B:502:0x3eb2, B:504:0x3ee0, B:505:0x3f3b, B:124:0x15fe, B:126:0x1615, B:127:0x1661, B:77:0x08f2, B:79:0x08ff, B:80:0x0947, B:42:0x045a, B:44:0x0471, B:45:0x04bb, B:50:0x0552, B:52:0x0569, B:53:0x05b7, B:60:0x0676, B:62:0x068d, B:63:0x06db), top: B:551:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:165:0x1b5c  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x1b69  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x1bb6 A[Catch: all -> 0x3ff6, TryCatch #19 {all -> 0x3ff6, blocks: (B:3:0x0014, B:6:0x0025, B:7:0x0057, B:9:0x015b, B:11:0x016b, B:12:0x01b0, B:20:0x0263, B:22:0x0270, B:23:0x02b1, B:25:0x02d4, B:27:0x02e1, B:28:0x0329, B:30:0x0332, B:32:0x034a, B:34:0x039a, B:69:0x07ca, B:71:0x07d7, B:72:0x081c, B:88:0x120a, B:90:0x1217, B:91:0x125d, B:94:0x1298, B:96:0x12a5, B:97:0x12f4, B:101:0x13fb, B:103:0x1408, B:105:0x1457, B:107:0x147a, B:109:0x1487, B:111:0x14ce, B:113:0x14d7, B:115:0x14ef, B:116:0x153c, B:138:0x17b0, B:140:0x17bd, B:141:0x17fd, B:154:0x1905, B:156:0x1912, B:157:0x1955, B:159:0x1a63, B:161:0x1a70, B:162:0x1ab4, B:172:0x1ba9, B:174:0x1bb6, B:176:0x1c01, B:178:0x1cdb, B:180:0x1ce8, B:182:0x1d2e, B:195:0x1ef2, B:197:0x1eff, B:199:0x1f4d, B:289:0x25c2, B:291:0x25cf, B:292:0x2611, B:303:0x2a0a, B:305:0x2a17, B:306:0x2a54, B:396:0x2ed8, B:398:0x2efb, B:399:0x2f46, B:407:0x303a, B:409:0x3040, B:410:0x3074, B:414:0x3088, B:416:0x308e, B:417:0x30cb, B:423:0x31a0, B:425:0x31a6, B:427:0x31df, B:429:0x3267, B:431:0x326f, B:433:0x328c, B:434:0x32bf, B:436:0x3380, B:438:0x3386, B:439:0x33ba, B:441:0x348e, B:443:0x3494, B:445:0x34cf, B:450:0x35ae, B:452:0x35bb, B:454:0x3606, B:456:0x37a3, B:458:0x37b6, B:460:0x37fa, B:462:0x38b7, B:464:0x38bd, B:465:0x38f1, B:467:0x39e1, B:469:0x3a05, B:470:0x3a4f, B:476:0x3b46, B:478:0x3b53, B:479:0x3b92, B:487:0x3c69, B:489:0x3c6f, B:490:0x3cad, B:493:0x3d67, B:495:0x3d6d, B:496:0x3da5, B:502:0x3eb2, B:504:0x3ee0, B:505:0x3f3b, B:124:0x15fe, B:126:0x1615, B:127:0x1661, B:77:0x08f2, B:79:0x08ff, B:80:0x0947, B:42:0x045a, B:44:0x0471, B:45:0x04bb, B:50:0x0552, B:52:0x0569, B:53:0x05b7, B:60:0x0676, B:62:0x068d, B:63:0x06db), top: B:551:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:175:0x1bff  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x1ce8 A[Catch: all -> 0x3ff6, TryCatch #19 {all -> 0x3ff6, blocks: (B:3:0x0014, B:6:0x0025, B:7:0x0057, B:9:0x015b, B:11:0x016b, B:12:0x01b0, B:20:0x0263, B:22:0x0270, B:23:0x02b1, B:25:0x02d4, B:27:0x02e1, B:28:0x0329, B:30:0x0332, B:32:0x034a, B:34:0x039a, B:69:0x07ca, B:71:0x07d7, B:72:0x081c, B:88:0x120a, B:90:0x1217, B:91:0x125d, B:94:0x1298, B:96:0x12a5, B:97:0x12f4, B:101:0x13fb, B:103:0x1408, B:105:0x1457, B:107:0x147a, B:109:0x1487, B:111:0x14ce, B:113:0x14d7, B:115:0x14ef, B:116:0x153c, B:138:0x17b0, B:140:0x17bd, B:141:0x17fd, B:154:0x1905, B:156:0x1912, B:157:0x1955, B:159:0x1a63, B:161:0x1a70, B:162:0x1ab4, B:172:0x1ba9, B:174:0x1bb6, B:176:0x1c01, B:178:0x1cdb, B:180:0x1ce8, B:182:0x1d2e, B:195:0x1ef2, B:197:0x1eff, B:199:0x1f4d, B:289:0x25c2, B:291:0x25cf, B:292:0x2611, B:303:0x2a0a, B:305:0x2a17, B:306:0x2a54, B:396:0x2ed8, B:398:0x2efb, B:399:0x2f46, B:407:0x303a, B:409:0x3040, B:410:0x3074, B:414:0x3088, B:416:0x308e, B:417:0x30cb, B:423:0x31a0, B:425:0x31a6, B:427:0x31df, B:429:0x3267, B:431:0x326f, B:433:0x328c, B:434:0x32bf, B:436:0x3380, B:438:0x3386, B:439:0x33ba, B:441:0x348e, B:443:0x3494, B:445:0x34cf, B:450:0x35ae, B:452:0x35bb, B:454:0x3606, B:456:0x37a3, B:458:0x37b6, B:460:0x37fa, B:462:0x38b7, B:464:0x38bd, B:465:0x38f1, B:467:0x39e1, B:469:0x3a05, B:470:0x3a4f, B:476:0x3b46, B:478:0x3b53, B:479:0x3b92, B:487:0x3c69, B:489:0x3c6f, B:490:0x3cad, B:493:0x3d67, B:495:0x3d6d, B:496:0x3da5, B:502:0x3eb2, B:504:0x3ee0, B:505:0x3f3b, B:124:0x15fe, B:126:0x1615, B:127:0x1661, B:77:0x08f2, B:79:0x08ff, B:80:0x0947, B:42:0x045a, B:44:0x0471, B:45:0x04bb, B:50:0x0552, B:52:0x0569, B:53:0x05b7, B:60:0x0676, B:62:0x068d, B:63:0x06db), top: B:551:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:181:0x1d2c  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x1dc4  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x1dd1  */
        /* JADX WARN: Removed duplicated region for block: B:194:0x1ef0  */
        /* JADX WARN: Removed duplicated region for block: B:215:0x2156  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x21a0  */
        /* JADX WARN: Removed duplicated region for block: B:286:0x2559  */
        /* JADX WARN: Removed duplicated region for block: B:287:0x2572  */
        /* JADX WARN: Removed duplicated region for block: B:291:0x25cf A[Catch: all -> 0x3ff6, TryCatch #19 {all -> 0x3ff6, blocks: (B:3:0x0014, B:6:0x0025, B:7:0x0057, B:9:0x015b, B:11:0x016b, B:12:0x01b0, B:20:0x0263, B:22:0x0270, B:23:0x02b1, B:25:0x02d4, B:27:0x02e1, B:28:0x0329, B:30:0x0332, B:32:0x034a, B:34:0x039a, B:69:0x07ca, B:71:0x07d7, B:72:0x081c, B:88:0x120a, B:90:0x1217, B:91:0x125d, B:94:0x1298, B:96:0x12a5, B:97:0x12f4, B:101:0x13fb, B:103:0x1408, B:105:0x1457, B:107:0x147a, B:109:0x1487, B:111:0x14ce, B:113:0x14d7, B:115:0x14ef, B:116:0x153c, B:138:0x17b0, B:140:0x17bd, B:141:0x17fd, B:154:0x1905, B:156:0x1912, B:157:0x1955, B:159:0x1a63, B:161:0x1a70, B:162:0x1ab4, B:172:0x1ba9, B:174:0x1bb6, B:176:0x1c01, B:178:0x1cdb, B:180:0x1ce8, B:182:0x1d2e, B:195:0x1ef2, B:197:0x1eff, B:199:0x1f4d, B:289:0x25c2, B:291:0x25cf, B:292:0x2611, B:303:0x2a0a, B:305:0x2a17, B:306:0x2a54, B:396:0x2ed8, B:398:0x2efb, B:399:0x2f46, B:407:0x303a, B:409:0x3040, B:410:0x3074, B:414:0x3088, B:416:0x308e, B:417:0x30cb, B:423:0x31a0, B:425:0x31a6, B:427:0x31df, B:429:0x3267, B:431:0x326f, B:433:0x328c, B:434:0x32bf, B:436:0x3380, B:438:0x3386, B:439:0x33ba, B:441:0x348e, B:443:0x3494, B:445:0x34cf, B:450:0x35ae, B:452:0x35bb, B:454:0x3606, B:456:0x37a3, B:458:0x37b6, B:460:0x37fa, B:462:0x38b7, B:464:0x38bd, B:465:0x38f1, B:467:0x39e1, B:469:0x3a05, B:470:0x3a4f, B:476:0x3b46, B:478:0x3b53, B:479:0x3b92, B:487:0x3c69, B:489:0x3c6f, B:490:0x3cad, B:493:0x3d67, B:495:0x3d6d, B:496:0x3da5, B:502:0x3eb2, B:504:0x3ee0, B:505:0x3f3b, B:124:0x15fe, B:126:0x1615, B:127:0x1661, B:77:0x08f2, B:79:0x08ff, B:80:0x0947, B:42:0x045a, B:44:0x0471, B:45:0x04bb, B:50:0x0552, B:52:0x0569, B:53:0x05b7, B:60:0x0676, B:62:0x068d, B:63:0x06db), top: B:551:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:294:0x261c  */
        /* JADX WARN: Removed duplicated region for block: B:311:0x2b2c A[EDGE_INSN: B:574:0x2b2c->B:311:0x2b2c BREAK  A[LOOP:4: B:295:0x2646->B:299:0x2661], PHI: r5 r11
          0x2b2c: PHI (r5v383 int) = (r5v382 int), (r5v694 int), (r5v382 int) binds: [B:293:0x261a, B:576:0x2b2c, B:574:0x2b2c] A[DONT_GENERATE, DONT_INLINE]
          0x2b2c: PHI (r11v116 java.lang.String) = (r11v115 java.lang.String), (r11v283 java.lang.String), (r11v115 java.lang.String) binds: [B:293:0x261a, B:576:0x2b2c, B:574:0x2b2c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:317:0x2b76 A[Catch: all -> 0x2ba1, IOException -> 0x2baf, TryCatch #22 {IOException -> 0x2baf, all -> 0x2ba1, blocks: (B:315:0x2b6f, B:317:0x2b76, B:320:0x2b82), top: B:558:0x2b6f }] */
        /* JADX WARN: Removed duplicated region for block: B:342:0x2bb8  */
        /* JADX WARN: Removed duplicated region for block: B:343:0x2bc6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x044e A[PHI: r4 r15 r28
          0x044e: PHI (r4v867 int) = (r4v865 int), (r4v875 int) binds: [B:47:0x054d, B:36:0x044b] A[DONT_GENERATE, DONT_INLINE]
          0x044e: PHI (r15v80 int) = (r15v78 int), (r15v82 int) binds: [B:47:0x054d, B:36:0x044b] A[DONT_GENERATE, DONT_INLINE]
          0x044e: PHI (r28v34 int) = (r28v32 int), (r28v36 int) binds: [B:47:0x054d, B:36:0x044b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:393:0x2e44  */
        /* JADX WARN: Removed duplicated region for block: B:394:0x2e5e  */
        /* JADX WARN: Removed duplicated region for block: B:398:0x2efb A[Catch: all -> 0x3ff6, TryCatch #19 {all -> 0x3ff6, blocks: (B:3:0x0014, B:6:0x0025, B:7:0x0057, B:9:0x015b, B:11:0x016b, B:12:0x01b0, B:20:0x0263, B:22:0x0270, B:23:0x02b1, B:25:0x02d4, B:27:0x02e1, B:28:0x0329, B:30:0x0332, B:32:0x034a, B:34:0x039a, B:69:0x07ca, B:71:0x07d7, B:72:0x081c, B:88:0x120a, B:90:0x1217, B:91:0x125d, B:94:0x1298, B:96:0x12a5, B:97:0x12f4, B:101:0x13fb, B:103:0x1408, B:105:0x1457, B:107:0x147a, B:109:0x1487, B:111:0x14ce, B:113:0x14d7, B:115:0x14ef, B:116:0x153c, B:138:0x17b0, B:140:0x17bd, B:141:0x17fd, B:154:0x1905, B:156:0x1912, B:157:0x1955, B:159:0x1a63, B:161:0x1a70, B:162:0x1ab4, B:172:0x1ba9, B:174:0x1bb6, B:176:0x1c01, B:178:0x1cdb, B:180:0x1ce8, B:182:0x1d2e, B:195:0x1ef2, B:197:0x1eff, B:199:0x1f4d, B:289:0x25c2, B:291:0x25cf, B:292:0x2611, B:303:0x2a0a, B:305:0x2a17, B:306:0x2a54, B:396:0x2ed8, B:398:0x2efb, B:399:0x2f46, B:407:0x303a, B:409:0x3040, B:410:0x3074, B:414:0x3088, B:416:0x308e, B:417:0x30cb, B:423:0x31a0, B:425:0x31a6, B:427:0x31df, B:429:0x3267, B:431:0x326f, B:433:0x328c, B:434:0x32bf, B:436:0x3380, B:438:0x3386, B:439:0x33ba, B:441:0x348e, B:443:0x3494, B:445:0x34cf, B:450:0x35ae, B:452:0x35bb, B:454:0x3606, B:456:0x37a3, B:458:0x37b6, B:460:0x37fa, B:462:0x38b7, B:464:0x38bd, B:465:0x38f1, B:467:0x39e1, B:469:0x3a05, B:470:0x3a4f, B:476:0x3b46, B:478:0x3b53, B:479:0x3b92, B:487:0x3c69, B:489:0x3c6f, B:490:0x3cad, B:493:0x3d67, B:495:0x3d6d, B:496:0x3da5, B:502:0x3eb2, B:504:0x3ee0, B:505:0x3f3b, B:124:0x15fe, B:126:0x1615, B:127:0x1661, B:77:0x08f2, B:79:0x08ff, B:80:0x0947, B:42:0x045a, B:44:0x0471, B:45:0x04bb, B:50:0x0552, B:52:0x0569, B:53:0x05b7, B:60:0x0676, B:62:0x068d, B:63:0x06db), top: B:551:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:402:0x3008  */
        /* JADX WARN: Removed duplicated region for block: B:403:0x300a  */
        /* JADX WARN: Removed duplicated region for block: B:406:0x3037  */
        /* JADX WARN: Removed duplicated region for block: B:413:0x3084  */
        /* JADX WARN: Removed duplicated region for block: B:529:0x2d19 A[EXC_TOP_SPLITTER, PHI: r11
          0x2d19: PHI (r11v131 java.io.BufferedInputStream) = (r11v130 java.io.BufferedInputStream), (r11v132 java.io.BufferedInputStream) binds: [B:386:0x2d2b, B:361:0x2c7a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:539:0x2101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:545:0x2b9d A[EXC_TOP_SPLITTER, PHI: r4
          0x2b9d: PHI (r4v47 java.io.BufferedInputStream) = (r4v46 java.io.BufferedInputStream), (r4v637 java.io.BufferedInputStream) binds: [B:338:0x2baf, B:316:0x2b74] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:569:0x2001 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x076c A[PHI: r3 r4 r15 r28
          0x076c: PHI (r3v490 java.lang.String) = (r3v461 java.lang.String), (r3v468 java.lang.String), (r3v491 java.lang.String) binds: [B:65:0x076a, B:55:0x066f, B:38:0x044e] A[DONT_GENERATE, DONT_INLINE]
          0x076c: PHI (r4v866 int) = (r4v865 int), (r4v865 int), (r4v867 int) binds: [B:65:0x076a, B:55:0x066f, B:38:0x044e] A[DONT_GENERATE, DONT_INLINE]
          0x076c: PHI (r15v79 int) = (r15v78 int), (r15v78 int), (r15v80 int) binds: [B:65:0x076a, B:55:0x066f, B:38:0x044e] A[DONT_GENERATE, DONT_INLINE]
          0x076c: PHI (r28v33 int) = (r28v32 int), (r28v32 int), (r28v34 int) binds: [B:65:0x076a, B:55:0x066f, B:38:0x044e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0772  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x08db  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x099e  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x09c1 A[PHI: r3 r4 r15 r28
          0x09c1: PHI (r3v458 java.lang.String) = 
          (r3v27 java.lang.String)
          (r3v461 java.lang.String)
          (r3v461 java.lang.String)
          (r3v490 java.lang.String)
          (r3v490 java.lang.String)
         binds: [B:85:0x09bc, B:58:0x0673, B:65:0x076a, B:82:0x099c, B:74:0x08d7] A[DONT_GENERATE, DONT_INLINE]
          0x09c1: PHI (r4v862 int) = (r4v6 int), (r4v865 int), (r4v865 int), (r4v866 int), (r4v866 int) binds: [B:85:0x09bc, B:58:0x0673, B:65:0x076a, B:82:0x099c, B:74:0x08d7] A[DONT_GENERATE, DONT_INLINE]
          0x09c1: PHI (r15v73 int) = (r15v12 int), (r15v78 int), (r15v78 int), (r15v79 int), (r15v79 int) binds: [B:85:0x09bc, B:58:0x0673, B:65:0x076a, B:82:0x099c, B:74:0x08d7] A[DONT_GENERATE, DONT_INLINE]
          0x09c1: PHI (r28v30 int) = (r28v2 int), (r28v32 int), (r28v32 int), (r28v33 int), (r28v33 int) binds: [B:85:0x09bc, B:58:0x0673, B:65:0x076a, B:82:0x099c, B:74:0x08d7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r50v11 */
        /* JADX WARN: Type inference failed for: r50v12 */
        /* JADX WARN: Type inference failed for: r50v13 */
        /* JADX WARN: Type inference failed for: r50v2, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r50v3 */
        /* JADX WARN: Type inference failed for: r50v4, types: [long] */
        /* JADX WARN: Type inference failed for: r50v5 */
        /* JADX WARN: Type inference failed for: r50v6 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] write$102327b9(int r62, java.lang.Object r63) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 16854
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow.data.models.common.CourseConfigV2.Companion.write$102327b9(int, java.lang.Object):java.lang.Object[]");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$GtAnalyticsCard;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/common/CourseConfigV2$GtAnalyticsCard;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "title", "Ljava/lang/String;", "getTitle", "subText", "getSubText", "badge", "getBadge"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GtAnalyticsCard {
        private final String badge;
        private final String subText;
        private final String title;

        public GtAnalyticsCard(String str, String str2, String str3) {
            this.title = str;
            this.subText = str2;
            this.badge = str3;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubText() {
            return this.subText;
        }

        public final String getBadge() {
            return this.badge;
        }

        public static /* synthetic */ GtAnalyticsCard copy$default(GtAnalyticsCard gtAnalyticsCard, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gtAnalyticsCard.title;
            }
            if ((i & 2) != 0) {
                str2 = gtAnalyticsCard.subText;
            }
            if ((i & 4) != 0) {
                str3 = gtAnalyticsCard.badge;
            }
            return gtAnalyticsCard.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSubText() {
            return this.subText;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getBadge() {
            return this.badge;
        }

        public final GtAnalyticsCard copy(String p0, String p1, String p2) {
            return new GtAnalyticsCard(p0, p1, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof GtAnalyticsCard)) {
                return false;
            }
            GtAnalyticsCard gtAnalyticsCard = (GtAnalyticsCard) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) gtAnalyticsCard.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subText, (Object) gtAnalyticsCard.subText) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.badge, (Object) gtAnalyticsCard.badge);
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.subText;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.badge;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            String str = this.title;
            String str2 = this.subText;
            String str3 = this.badge;
            StringBuilder sb = new StringBuilder("GtAnalyticsCard(title=");
            sb.append(str);
            sb.append(", subText=");
            sb.append(str2);
            sb.append(", badge=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JJ\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eR\u0017\u0010\u001e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0010R\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u000eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0013R\u001c\u0010(\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0015"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$AnnouncementBanner;", "", "", "p0", "", "p1", "p2", "", "p3", "Lcom/marrow/data/models/common/CourseConfigV2$AnnouncementPopup;", "p4", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lcom/marrow/data/models/common/CourseConfigV2$AnnouncementPopup;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/marrow/data/models/common/CourseConfigV2$AnnouncementPopup;", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lcom/marrow/data/models/common/CourseConfigV2$AnnouncementPopup;)Lcom/marrow/data/models/common/CourseConfigV2$AnnouncementBanner;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "isActive", "Z", "text", "getText", "subjectIds", "Ljava/util/List;", "getSubjectIds", CourseConfigKeyConstantsKt.KEY_ANNOUNCEMENT_POPUP, "Lcom/marrow/data/models/common/CourseConfigV2$AnnouncementPopup;", "getPopup"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnnouncementBanner {
        private final String id;
        private final boolean isActive;
        private final AnnouncementPopup popup;
        private final List<String> subjectIds;
        private final String text;

        public AnnouncementBanner(String str, boolean z, String str2, List<String> list, AnnouncementPopup announcementPopup) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.id = str;
            this.isActive = z;
            this.text = str2;
            this.subjectIds = list;
            this.popup = announcementPopup;
        }

        public final String getId() {
            return this.id;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public final String getText() {
            return this.text;
        }

        public /* synthetic */ AnnouncementBanner(String str, boolean z, String str2, List list, AnnouncementPopup announcementPopup, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(str, z, str2, (i & 8) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, announcementPopup);
        }

        public final List<String> getSubjectIds() {
            return this.subjectIds;
        }

        public final AnnouncementPopup getPopup() {
            return this.popup;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AnnouncementBanner copy$default(AnnouncementBanner announcementBanner, String str, boolean z, String str2, List list, AnnouncementPopup announcementPopup, int i, Object obj) {
            if ((i & 1) != 0) {
                str = announcementBanner.id;
            }
            if ((i & 2) != 0) {
                z = announcementBanner.isActive;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                str2 = announcementBanner.text;
            }
            String str3 = str2;
            if ((i & 8) != 0) {
                list = announcementBanner.subjectIds;
            }
            List list2 = list;
            if ((i & 16) != 0) {
                announcementPopup = announcementBanner.popup;
            }
            return announcementBanner.copy(str, z2, str3, list2, announcementPopup);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final List<String> component4() {
            return this.subjectIds;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final AnnouncementPopup getPopup() {
            return this.popup;
        }

        public final AnnouncementBanner copy(String p0, boolean p1, String p2, List<String> p3, AnnouncementPopup p4) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            return new AnnouncementBanner(p0, p1, p2, p3, p4);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof AnnouncementBanner)) {
                return false;
            }
            AnnouncementBanner announcementBanner = (AnnouncementBanner) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) announcementBanner.id) && this.isActive == announcementBanner.isActive && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.text, (Object) announcementBanner.text) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.subjectIds, announcementBanner.subjectIds) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.popup, announcementBanner.popup);
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode();
            int iHashCode2 = Boolean.hashCode(this.isActive);
            int iHashCode3 = this.text.hashCode();
            int iHashCode4 = this.subjectIds.hashCode();
            AnnouncementPopup announcementPopup = this.popup;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (announcementPopup == null ? 0 : announcementPopup.hashCode());
        }

        public final String toString() {
            String str = this.id;
            boolean z = this.isActive;
            String str2 = this.text;
            List<String> list = this.subjectIds;
            AnnouncementPopup announcementPopup = this.popup;
            StringBuilder sb = new StringBuilder("AnnouncementBanner(id=");
            sb.append(str);
            sb.append(", isActive=");
            sb.append(z);
            sb.append(", text=");
            sb.append(str2);
            sb.append(", subjectIds=");
            sb.append(list);
            sb.append(", popup=");
            sb.append(announcementPopup);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$AnnouncementPopup;", "", "", "", "p0", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/marrow/data/models/common/CourseConfigV2$AnnouncementPopup;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "body", "Ljava/util/List;", "getBody"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnnouncementPopup {
        private final List<String> body;

        public AnnouncementPopup(List<String> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.body = list;
        }

        public final List<String> getBody() {
            return this.body;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AnnouncementPopup copy$default(AnnouncementPopup announcementPopup, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = announcementPopup.body;
            }
            return announcementPopup.copy(list);
        }

        public final List<String> component1() {
            return this.body;
        }

        public final AnnouncementPopup copy(List<String> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new AnnouncementPopup(p0);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            return (p0 instanceof AnnouncementPopup) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.body, ((AnnouncementPopup) p0).body);
        }

        public final int hashCode() {
            return this.body.hashCode();
        }

        public final String toString() {
            List<String> list = this.body;
            StringBuilder sb = new StringBuilder("AnnouncementPopup(body=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$EditionUpdatePopup;", "", "", "p0", "", "p1", "p2", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/common/CourseConfigV2$EditionUpdatePopup;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isActive", "Z", CourseConfigKeyConstantsKt.KEY_EDITION_UPDATE_POPUP_VARIANT, "Ljava/lang/String;", "getVariant", "ackKey", "getAckKey"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditionUpdatePopup {
        private final String ackKey;
        private final boolean isActive;
        private final String variant;

        public EditionUpdatePopup(boolean z, String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.isActive = z;
            this.variant = str;
            this.ackKey = str2;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public final String getVariant() {
            return this.variant;
        }

        public final String getAckKey() {
            return this.ackKey;
        }

        public static /* synthetic */ EditionUpdatePopup copy$default(EditionUpdatePopup editionUpdatePopup, boolean z, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = editionUpdatePopup.isActive;
            }
            if ((i & 2) != 0) {
                str = editionUpdatePopup.variant;
            }
            if ((i & 4) != 0) {
                str2 = editionUpdatePopup.ackKey;
            }
            return editionUpdatePopup.copy(z, str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVariant() {
            return this.variant;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAckKey() {
            return this.ackKey;
        }

        public final EditionUpdatePopup copy(boolean p0, String p1, String p2) {
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            return new EditionUpdatePopup(p0, p1, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof EditionUpdatePopup)) {
                return false;
            }
            EditionUpdatePopup editionUpdatePopup = (EditionUpdatePopup) p0;
            return this.isActive == editionUpdatePopup.isActive && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.variant, (Object) editionUpdatePopup.variant) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.ackKey, (Object) editionUpdatePopup.ackKey);
        }

        public final int hashCode() {
            return (((Boolean.hashCode(this.isActive) * 31) + this.variant.hashCode()) * 31) + this.ackKey.hashCode();
        }

        public final String toString() {
            boolean z = this.isActive;
            String str = this.variant;
            String str2 = this.ackKey;
            StringBuilder sb = new StringBuilder("EditionUpdatePopup(isActive=");
            sb.append(z);
            sb.append(", variant=");
            sb.append(str);
            sb.append(", ackKey=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tR\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/marrow/data/models/common/CourseConfigV2$PlanScreenConfig;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/marrow/data/models/common/CourseConfigV2$PlanScreenConfig;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "emptyBuyPlanText", "Ljava/lang/String;", "getEmptyBuyPlanText", "shouldShowEmptyPlanScreen", "Z", "getShouldShowEmptyPlanScreen"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanScreenConfig {
        private final String emptyBuyPlanText;
        private final boolean shouldShowEmptyPlanScreen;

        public PlanScreenConfig(String str, boolean z) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.emptyBuyPlanText = str;
            this.shouldShowEmptyPlanScreen = z;
        }

        public final String getEmptyBuyPlanText() {
            return this.emptyBuyPlanText;
        }

        public final boolean getShouldShowEmptyPlanScreen() {
            return this.shouldShowEmptyPlanScreen;
        }

        public static /* synthetic */ PlanScreenConfig copy$default(PlanScreenConfig planScreenConfig, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = planScreenConfig.emptyBuyPlanText;
            }
            if ((i & 2) != 0) {
                z = planScreenConfig.shouldShowEmptyPlanScreen;
            }
            return planScreenConfig.copy(str, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEmptyBuyPlanText() {
            return this.emptyBuyPlanText;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getShouldShowEmptyPlanScreen() {
            return this.shouldShowEmptyPlanScreen;
        }

        public final PlanScreenConfig copy(String p0, boolean p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new PlanScreenConfig(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof PlanScreenConfig)) {
                return false;
            }
            PlanScreenConfig planScreenConfig = (PlanScreenConfig) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.emptyBuyPlanText, (Object) planScreenConfig.emptyBuyPlanText) && this.shouldShowEmptyPlanScreen == planScreenConfig.shouldShowEmptyPlanScreen;
        }

        public final int hashCode() {
            return (this.emptyBuyPlanText.hashCode() * 31) + Boolean.hashCode(this.shouldShowEmptyPlanScreen);
        }

        public final String toString() {
            String str = this.emptyBuyPlanText;
            boolean z = this.shouldShowEmptyPlanScreen;
            StringBuilder sb = new StringBuilder("PlanScreenConfig(emptyBuyPlanText=");
            sb.append(str);
            sb.append(", shouldShowEmptyPlanScreen=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }
}
