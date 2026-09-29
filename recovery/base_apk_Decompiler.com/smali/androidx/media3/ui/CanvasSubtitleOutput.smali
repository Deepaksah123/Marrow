###### Class androidx.media3.ui.CanvasSubtitleOutput (androidx.media3.ui.CanvasSubtitleOutput)
.class final Landroidx/media3/ui/CanvasSubtitleOutput;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/ui/SubtitleView$IconCompatParcelizer;


# instance fields
.field private AudioAttributesCompatParcelizer:Lo/computeNext;

.field private IconCompatParcelizer:F

.field private MediaBrowserCompatItemReceiver:I

.field private final RemoteActionCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo/PrivateMaxEntriesMapEntrySet;",
            ">;"
        }
    .end annotation
.end field

.field private read:F

.field private write:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo/getDefaultImpl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    .line 46
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/CanvasSubtitleOutput;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 50
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 51
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/media3/ui/CanvasSubtitleOutput;->RemoteActionCompatParcelizer:Ljava/util/List;

    .line 52
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/ui/CanvasSubtitleOutput;->write:Ljava/util/List;

    const/4 p1, 0x0

    .line 53
    iput p1, p0, Landroidx/media3/ui/CanvasSubtitleOutput;->MediaBrowserCompatItemReceiver:I

    const p1, 0x3d5a511a    # 0.0533f

    .line 54
    iput p1, p0, Landroidx/media3/ui/CanvasSubtitleOutput;->read:F

    .line 55
    sget-object p1, Lo/computeNext;->IconCompatParcelizer:Lo/computeNext;

    iput-object p1, p0, Landroidx/media3/ui/CanvasSubtitleOutput;->AudioAttributesCompatParcelizer:Lo/computeNext;

    const p1, 0x3da3d70a    # 0.08f

    .line 56
    iput p1, p0, Landroidx/media3/ui/CanvasSubtitleOutput;->IconCompatParcelizer:F

    return-void
.end method

.method private static read(Lo/getDefaultImpl;)Lo/getDefaultImpl;
    .registers 5

    .line 148
    invoke-virtual {p0}, Lo/getDefaultImpl;->AudioAttributesCompatParcelizer()Lo/getDefaultImpl$write;

    move-result-object v0

    const v1, -0x800001

    .line 149
    invoke-virtual {v0, v1}, Lo/getDefaultImpl$write;->RemoteActionCompatParcelizer(F)Lo/getDefaultImpl$write;

    move-result-object v0

    const/high16 v1, -0x80000000

    .line 150
    invoke-virtual {v0, v1}, Lo/getDefaultImpl$write;->IconCompatParcelizer(I)Lo/getDefaultImpl$write;

    move-result-object v0

    const/4 v1, 0x0

    .line 151
    invoke-virtual {v0, v1}, Lo/getDefaultImpl$write;->AudioAttributesCompatParcelizer(Landroid/text/Layout$Alignment;)Lo/getDefaultImpl$write;

    move-result-object v0

    .line 153
    iget v1, p0, Lo/getDefaultImpl;->read:I

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    if-nez v1, :cond_24

    .line 154
    iget v1, p0, Lo/getDefaultImpl;->IconCompatParcelizer:F

    sub-float/2addr v3, v1

    invoke-virtual {v0, v3, v2}, Lo/getDefaultImpl$write;->write(FI)Lo/getDefaultImpl$write;

    goto :goto_2c

    .line 156
    :cond_24
    iget v1, p0, Lo/getDefaultImpl;->IconCompatParcelizer:F

    neg-float v1, v1

    sub-float/2addr v1, v3

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Lo/getDefaultImpl$write;->write(FI)Lo/getDefaultImpl$write;

    .line 158
    :goto_2c
    iget p0, p0, Lo/getDefaultImpl;->write:I

    const/4 v1, 0x2

    if-eqz p0, :cond_37

    if-ne p0, v1, :cond_3a

    .line 160
    invoke-virtual {v0, v2}, Lo/getDefaultImpl$write;->read(I)Lo/getDefaultImpl$write;

    goto :goto_3a

    .line 163
    :cond_37
    invoke-virtual {v0, v1}, Lo/getDefaultImpl$write;->read(I)Lo/getDefaultImpl$write;

    .line 170
    :cond_3a
    :goto_3a
    invoke-virtual {v0}, Lo/getDefaultImpl$write;->write()Lo/getDefaultImpl;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 24

    move-object/from16 v0, p0

    .line 81
    iget-object v1, v0, Landroidx/media3/ui/CanvasSubtitleOutput;->write:Ljava/util/List;

    .line 82
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_87

    .line 86
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v2

    .line 89
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v14

    .line 90
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v15

    .line 91
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int v13, v3, v4

    .line 92
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int v12, v2, v3

    if-le v12, v15, :cond_87

    if-le v13, v14, :cond_87

    sub-int v11, v12, v15

    .line 99
    iget v3, v0, Landroidx/media3/ui/CanvasSubtitleOutput;->MediaBrowserCompatItemReceiver:I

    iget v4, v0, Landroidx/media3/ui/CanvasSubtitleOutput;->read:F

    .line 100
    invoke-static {v3, v4, v2, v11}, Lo/PrivateMaxEntriesMapKeySet;->write(IFII)F

    move-result v16

    const/4 v3, 0x0

    cmpg-float v3, v16, v3

    if-lez v3, :cond_87

    .line 107
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v10

    const/4 v3, 0x0

    move v9, v3

    :goto_3f
    if-ge v9, v10, :cond_87

    .line 109
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/getDefaultImpl;

    .line 110
    iget v4, v3, Lo/getDefaultImpl;->MediaBrowserCompatSearchResultReceiver:I

    const/high16 v5, -0x80000000

    if-eq v4, v5, :cond_51

    .line 111
    invoke-static {v3}, Landroidx/media3/ui/CanvasSubtitleOutput;->read(Lo/getDefaultImpl;)Lo/getDefaultImpl;

    move-result-object v3

    :cond_51
    move-object v4, v3

    .line 113
    iget v3, v4, Lo/getDefaultImpl;->MediaMetadataCompat:I

    iget v5, v4, Lo/getDefaultImpl;->MediaDescriptionCompat:F

    .line 114
    invoke-static {v3, v5, v2, v11}, Lo/PrivateMaxEntriesMapKeySet;->write(IFII)F

    move-result v7

    .line 116
    iget-object v3, v0, Landroidx/media3/ui/CanvasSubtitleOutput;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/PrivateMaxEntriesMapEntrySet;

    .line 117
    iget-object v5, v0, Landroidx/media3/ui/CanvasSubtitleOutput;->AudioAttributesCompatParcelizer:Lo/computeNext;

    iget v8, v0, Landroidx/media3/ui/CanvasSubtitleOutput;->IconCompatParcelizer:F

    move/from16 v6, v16

    move/from16 v17, v9

    move-object/from16 v9, p1

    move/from16 v18, v10

    move v10, v14

    move/from16 v19, v11

    move v11, v15

    move/from16 v20, v12

    move v12, v13

    move/from16 v21, v13

    move/from16 v13, v20

    invoke-virtual/range {v3 .. v13}, Lo/PrivateMaxEntriesMapEntrySet;->write(Lo/getDefaultImpl;Lo/computeNext;FFFLandroid/graphics/Canvas;IIII)V

    add-int/lit8 v9, v17, 0x1

    move/from16 v10, v18

    move/from16 v11, v19

    move/from16 v12, v20

    move/from16 v13, v21

    goto :goto_3f

    :cond_87
    return-void
.end method

.method public final write(Ljava/util/List;Lo/computeNext;FIF)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lo/getDefaultImpl;",
            ">;",
            "Lo/computeNext;",
            "FIF)V"
        }
    .end annotation

    .line 66
    iput-object p1, p0, Landroidx/media3/ui/CanvasSubtitleOutput;->write:Ljava/util/List;

    .line 67
    iput-object p2, p0, Landroidx/media3/ui/CanvasSubtitleOutput;->AudioAttributesCompatParcelizer:Lo/computeNext;

    .line 68
    iput p3, p0, Landroidx/media3/ui/CanvasSubtitleOutput;->read:F

    .line 69
    iput p4, p0, Landroidx/media3/ui/CanvasSubtitleOutput;->MediaBrowserCompatItemReceiver:I

    .line 70
    iput p5, p0, Landroidx/media3/ui/CanvasSubtitleOutput;->IconCompatParcelizer:F

    .line 72
    :goto_a
    iget-object p2, p0, Landroidx/media3/ui/CanvasSubtitleOutput;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p3

    if-ge p2, p3, :cond_25

    .line 73
    iget-object p2, p0, Landroidx/media3/ui/CanvasSubtitleOutput;->RemoteActionCompatParcelizer:Ljava/util/List;

    new-instance p3, Lo/PrivateMaxEntriesMapEntrySet;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-direct {p3, p4}, Lo/PrivateMaxEntriesMapEntrySet;-><init>(Landroid/content/Context;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 76
    :cond_25
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
