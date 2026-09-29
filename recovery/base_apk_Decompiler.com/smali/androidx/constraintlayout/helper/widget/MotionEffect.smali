###### Class androidx.constraintlayout.helper.widget.MotionEffect (androidx.constraintlayout.helper.widget.MotionEffect)
.class public Landroidx/constraintlayout/helper/widget/MotionEffect;
.super Landroidx/constraintlayout/motion/widget/MotionHelper;
.source "SourceFile"


# instance fields
.field private AudioAttributesImplApi21Parcelizer:I

.field private AudioAttributesImplApi26Parcelizer:I

.field private AudioAttributesImplBaseParcelizer:I

.field private MediaBrowserCompatCustomActionResultReceiver:F

.field private MediaBrowserCompatMediaItem:I

.field private MediaDescriptionCompat:I

.field private MediaMetadataCompat:Z

.field private RatingCompat:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 72
    invoke-direct {p0, p1}, Landroidx/constraintlayout/motion/widget/MotionHelper;-><init>(Landroid/content/Context;)V

    const p1, 0x3dcccccd    # 0.1f

    .line 60
    iput p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatCustomActionResultReceiver:F

    const/16 p1, 0x31

    .line 61
    iput p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplBaseParcelizer:I

    const/16 p1, 0x32

    .line 62
    iput p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi26Parcelizer:I

    const/4 p1, 0x0

    .line 63
    iput p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatMediaItem:I

    .line 64
    iput p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaDescriptionCompat:I

    const/4 p1, 0x1

    .line 65
    iput-boolean p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaMetadataCompat:Z

    const/4 p1, -0x1

    .line 67
    iput p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->RatingCompat:I

    .line 69
    iput p1, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi21Parcelizer:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    .line 76
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/motion/widget/MotionHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const v0, 0x3dcccccd    # 0.1f

    .line 60
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatCustomActionResultReceiver:F

    const/16 v0, 0x31

    .line 61
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplBaseParcelizer:I

    const/16 v0, 0x32

    .line 62
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi26Parcelizer:I

    const/4 v0, 0x0

    .line 63
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatMediaItem:I

    .line 64
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaDescriptionCompat:I

    const/4 v0, 0x1

    .line 65
    iput-boolean v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaMetadataCompat:Z

    const/4 v0, -0x1

    .line 67
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->RatingCompat:I

    .line 69
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi21Parcelizer:I

    .line 77
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/helper/widget/MotionEffect;->IconCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 81
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/motion/widget/MotionHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p3, 0x3dcccccd    # 0.1f

    .line 60
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatCustomActionResultReceiver:F

    const/16 p3, 0x31

    .line 61
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplBaseParcelizer:I

    const/16 p3, 0x32

    .line 62
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi26Parcelizer:I

    const/4 p3, 0x0

    .line 63
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatMediaItem:I

    .line 64
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaDescriptionCompat:I

    const/4 p3, 0x1

    .line 65
    iput-boolean p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaMetadataCompat:Z

    const/4 p3, -0x1

    .line 67
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->RatingCompat:I

    .line 69
    iput p3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi21Parcelizer:I

    .line 82
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/helper/widget/MotionEffect;->IconCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private IconCompatParcelizer(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 8

    if-eqz p2, :cond_a9

    .line 87
    sget-object v0, Lo/_isBlank$read;->MotionEffect:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 88
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 v0, 0x0

    move v1, v0

    :goto_e
    if-ge v1, p2, :cond_95

    .line 90
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 91
    sget v3, Lo/_isBlank$read;->MotionEffect_motionEffect_start:I

    const/16 v4, 0x63

    if-ne v2, v3, :cond_2d

    .line 92
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplBaseParcelizer:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplBaseParcelizer:I

    .line 93
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplBaseParcelizer:I

    goto :goto_91

    .line 94
    :cond_2d
    sget v3, Lo/_isBlank$read;->MotionEffect_motionEffect_end:I

    if-ne v2, v3, :cond_44

    .line 95
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi26Parcelizer:I

    .line 96
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi26Parcelizer:I

    goto :goto_91

    .line 97
    :cond_44
    sget v3, Lo/_isBlank$read;->MotionEffect_motionEffect_translationX:I

    if-ne v2, v3, :cond_51

    .line 98
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatMediaItem:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatMediaItem:I

    goto :goto_91

    .line 99
    :cond_51
    sget v3, Lo/_isBlank$read;->MotionEffect_motionEffect_translationY:I

    if-ne v2, v3, :cond_5e

    .line 100
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaDescriptionCompat:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaDescriptionCompat:I

    goto :goto_91

    .line 101
    :cond_5e
    sget v3, Lo/_isBlank$read;->MotionEffect_motionEffect_alpha:I

    if-ne v2, v3, :cond_6b

    .line 102
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatCustomActionResultReceiver:F

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatCustomActionResultReceiver:F

    goto :goto_91

    .line 103
    :cond_6b
    sget v3, Lo/_isBlank$read;->MotionEffect_motionEffect_move:I

    if-ne v2, v3, :cond_78

    .line 104
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi21Parcelizer:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi21Parcelizer:I

    goto :goto_91

    .line 105
    :cond_78
    sget v3, Lo/_isBlank$read;->MotionEffect_motionEffect_strict:I

    if-ne v2, v3, :cond_85

    .line 106
    iget-boolean v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaMetadataCompat:Z

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaMetadataCompat:Z

    goto :goto_91

    .line 107
    :cond_85
    sget v3, Lo/_isBlank$read;->MotionEffect_motionEffect_viewTransition:I

    if-ne v2, v3, :cond_91

    .line 108
    iget v3, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->RatingCompat:I

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->RatingCompat:I

    :cond_91
    :goto_91
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_e

    .line 111
    :cond_95
    iget p2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplBaseParcelizer:I

    iget v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi26Parcelizer:I

    if-ne p2, v0, :cond_a6

    if-lez p2, :cond_a2

    add-int/lit8 p2, p2, -0x1

    .line 113
    iput p2, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplBaseParcelizer:I

    goto :goto_a6

    :cond_a2
    add-int/lit8 v0, v0, 0x1

    .line 115
    iput v0, p0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi26Parcelizer:I

    .line 118
    :cond_a6
    :goto_a6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_a9
    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public final read(Landroidx/constraintlayout/motion/widget/MotionLayout;Ljava/util/HashMap;)V
    .registers 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/motion/widget/MotionLayout;",
            "Ljava/util/HashMap<",
            "Landroid/view/View;",
            "Lo/handleSingleElementUnwrapped;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 129
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0, v2}, Landroidx/constraintlayout/helper/widget/MotionEffect;->write(Landroidx/constraintlayout/widget/ConstraintLayout;)[Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_14

    .line 132
    invoke-static {}, Lo/NumberDeserializersShortDeserializer;->read()Ljava/lang/String;

    return-void

    .line 138
    :cond_14
    new-instance v3, Lo/NumberDeserializersLongDeserializer;

    invoke-direct {v3}, Lo/NumberDeserializersLongDeserializer;-><init>()V

    .line 139
    new-instance v4, Lo/NumberDeserializersLongDeserializer;

    invoke-direct {v4}, Lo/NumberDeserializersLongDeserializer;-><init>()V

    .line 140
    iget v5, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatCustomActionResultReceiver:F

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    const-string v6, "alpha"

    invoke-virtual {v3, v6, v5}, Lo/NumberDeserializersLongDeserializer;->IconCompatParcelizer(Ljava/lang/String;Ljava/lang/Object;)V

    .line 141
    iget v5, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatCustomActionResultReceiver:F

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v4, v6, v5}, Lo/NumberDeserializersLongDeserializer;->IconCompatParcelizer(Ljava/lang/String;Ljava/lang/Object;)V

    .line 142
    iget v5, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplBaseParcelizer:I

    invoke-virtual {v3, v5}, Lo/NumberDeserializersNumberDeserializer;->RemoteActionCompatParcelizer(I)V

    .line 143
    iget v5, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {v4, v5}, Lo/NumberDeserializersNumberDeserializer;->RemoteActionCompatParcelizer(I)V

    .line 144
    new-instance v5, Lo/_concat;

    invoke-direct {v5}, Lo/_concat;-><init>()V

    .line 145
    iget v6, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplBaseParcelizer:I

    invoke-virtual {v5, v6}, Lo/NumberDeserializersNumberDeserializer;->RemoteActionCompatParcelizer(I)V

    .line 146
    invoke-virtual {v5}, Lo/_concat;->AudioAttributesCompatParcelizer()V

    const/4 v6, 0x0

    .line 147
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "percentX"

    invoke-virtual {v5, v8, v7}, Lo/_concat;->read(Ljava/lang/String;Ljava/lang/Object;)V

    .line 148
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v9, "percentY"

    invoke-virtual {v5, v9, v7}, Lo/_concat;->read(Ljava/lang/String;Ljava/lang/Object;)V

    .line 149
    new-instance v7, Lo/_concat;

    invoke-direct {v7}, Lo/_concat;-><init>()V

    .line 150
    iget v10, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {v7, v10}, Lo/NumberDeserializersNumberDeserializer;->RemoteActionCompatParcelizer(I)V

    .line 151
    invoke-virtual {v7}, Lo/_concat;->AudioAttributesCompatParcelizer()V

    const/4 v10, 0x1

    .line 152
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v7, v8, v11}, Lo/_concat;->read(Ljava/lang/String;Ljava/lang/Object;)V

    .line 153
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v9, v8}, Lo/_concat;->read(Ljava/lang/String;Ljava/lang/Object;)V

    .line 157
    iget v8, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatMediaItem:I

    const/4 v9, 0x0

    if-lez v8, :cond_a5

    .line 158
    new-instance v8, Lo/NumberDeserializersLongDeserializer;

    invoke-direct {v8}, Lo/NumberDeserializersLongDeserializer;-><init>()V

    .line 159
    new-instance v11, Lo/NumberDeserializersLongDeserializer;

    invoke-direct {v11}, Lo/NumberDeserializersLongDeserializer;-><init>()V

    .line 160
    iget v12, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatMediaItem:I

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const-string v13, "translationX"

    invoke-virtual {v8, v13, v12}, Lo/NumberDeserializersLongDeserializer;->IconCompatParcelizer(Ljava/lang/String;Ljava/lang/Object;)V

    .line 161
    iget v12, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {v8, v12}, Lo/NumberDeserializersNumberDeserializer;->RemoteActionCompatParcelizer(I)V

    .line 162
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v11, v13, v12}, Lo/NumberDeserializersLongDeserializer;->IconCompatParcelizer(Ljava/lang/String;Ljava/lang/Object;)V

    .line 163
    iget v12, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi26Parcelizer:I

    sub-int/2addr v12, v10

    invoke-virtual {v11, v12}, Lo/NumberDeserializersNumberDeserializer;->RemoteActionCompatParcelizer(I)V

    goto :goto_a7

    :cond_a5
    move-object v8, v9

    move-object v11, v8

    .line 168
    :goto_a7
    iget v12, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaDescriptionCompat:I

    if-lez v12, :cond_d3

    .line 169
    new-instance v9, Lo/NumberDeserializersLongDeserializer;

    invoke-direct {v9}, Lo/NumberDeserializersLongDeserializer;-><init>()V

    .line 170
    new-instance v12, Lo/NumberDeserializersLongDeserializer;

    invoke-direct {v12}, Lo/NumberDeserializersLongDeserializer;-><init>()V

    .line 171
    iget v13, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaDescriptionCompat:I

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const-string v14, "translationY"

    invoke-virtual {v9, v14, v13}, Lo/NumberDeserializersLongDeserializer;->IconCompatParcelizer(Ljava/lang/String;Ljava/lang/Object;)V

    .line 172
    iget v13, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {v9, v13}, Lo/NumberDeserializersNumberDeserializer;->RemoteActionCompatParcelizer(I)V

    .line 173
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, v14, v13}, Lo/NumberDeserializersLongDeserializer;->IconCompatParcelizer(Ljava/lang/String;Ljava/lang/Object;)V

    .line 174
    iget v13, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi26Parcelizer:I

    sub-int/2addr v13, v10

    invoke-virtual {v12, v13}, Lo/NumberDeserializersNumberDeserializer;->RemoteActionCompatParcelizer(I)V

    goto :goto_d4

    :cond_d3
    move-object v12, v9

    .line 177
    :goto_d4
    iget v13, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->AudioAttributesImplApi21Parcelizer:I

    const/4 v14, -0x1

    const/16 v17, 0x0

    if-ne v13, v14, :cond_13c

    const/4 v13, 0x4

    .line 179
    new-array v14, v13, [I

    move v13, v6

    .line 181
    :goto_df
    array-length v15, v2

    if-ge v13, v15, :cond_12b

    .line 182
    aget-object v15, v2, v13

    invoke-virtual {v1, v15}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lo/handleSingleElementUnwrapped;

    if-eqz v15, :cond_128

    .line 186
    invoke-virtual {v15}, Lo/handleSingleElementUnwrapped;->IconCompatParcelizer()F

    move-result v20

    invoke-virtual {v15}, Lo/handleSingleElementUnwrapped;->AudioAttributesImplBaseParcelizer()F

    move-result v21

    sub-float v20, v20, v21

    .line 187
    invoke-virtual {v15}, Lo/handleSingleElementUnwrapped;->AudioAttributesImplApi21Parcelizer()F

    move-result v21

    invoke-virtual {v15}, Lo/handleSingleElementUnwrapped;->MediaBrowserCompatItemReceiver()F

    move-result v15

    sub-float v21, v21, v15

    cmpg-float v15, v21, v17

    if-gez v15, :cond_109

    .line 190
    aget v15, v14, v10

    add-int/2addr v15, v10

    aput v15, v14, v10

    :cond_109
    cmpl-float v15, v21, v17

    if-lez v15, :cond_112

    .line 191
    aget v15, v14, v6

    add-int/2addr v15, v10

    aput v15, v14, v6

    :cond_112
    cmpl-float v15, v20, v17

    if-lez v15, :cond_11d

    const/4 v15, 0x3

    .line 192
    aget v16, v14, v15

    add-int/lit8 v16, v16, 0x1

    aput v16, v14, v15

    :cond_11d
    cmpg-float v15, v20, v17

    if-gez v15, :cond_128

    const/4 v15, 0x2

    .line 193
    aget v19, v14, v15

    add-int/lit8 v19, v19, 0x1

    aput v19, v14, v15

    :cond_128
    add-int/lit8 v13, v13, 0x1

    goto :goto_df

    .line 195
    :cond_12b
    aget v13, v14, v6

    move v15, v13

    move v13, v6

    move v6, v10

    :goto_130
    const/4 v10, 0x4

    if-ge v6, v10, :cond_13c

    .line 198
    aget v10, v14, v6

    if-ge v15, v10, :cond_139

    move v13, v6

    move v15, v10

    :cond_139
    add-int/lit8 v6, v6, 0x1

    goto :goto_130

    :cond_13c
    const/4 v6, 0x0

    .line 205
    :goto_13d
    array-length v10, v2

    if-ge v6, v10, :cond_1da

    .line 206
    aget-object v10, v2, v6

    invoke-virtual {v1, v10}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo/handleSingleElementUnwrapped;

    if-nez v10, :cond_14c

    const/4 v1, 0x3

    goto :goto_1a3

    .line 210
    :cond_14c
    invoke-virtual {v10}, Lo/handleSingleElementUnwrapped;->IconCompatParcelizer()F

    move-result v14

    invoke-virtual {v10}, Lo/handleSingleElementUnwrapped;->AudioAttributesImplBaseParcelizer()F

    move-result v15

    sub-float/2addr v14, v15

    .line 211
    invoke-virtual {v10}, Lo/handleSingleElementUnwrapped;->AudioAttributesImplApi21Parcelizer()F

    move-result v15

    invoke-virtual {v10}, Lo/handleSingleElementUnwrapped;->MediaBrowserCompatItemReceiver()F

    move-result v18

    sub-float v15, v15, v18

    if-nez v13, :cond_171

    cmpl-float v15, v15, v17

    if-lez v15, :cond_16f

    .line 218
    iget-boolean v15, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaMetadataCompat:Z

    if-eqz v15, :cond_16d

    cmpl-float v14, v14, v17

    if-nez v14, :cond_16f

    :cond_16d
    :goto_16d
    const/4 v1, 0x2

    goto :goto_190

    :cond_16f
    const/4 v1, 0x2

    goto :goto_191

    :cond_171
    const/4 v1, 0x1

    if-ne v13, v1, :cond_181

    cmpg-float v15, v15, v17

    if-gez v15, :cond_16f

    .line 222
    iget-boolean v15, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaMetadataCompat:Z

    if-eqz v15, :cond_16d

    cmpl-float v14, v14, v17

    if-nez v14, :cond_16f

    goto :goto_16d

    :cond_181
    const/4 v1, 0x2

    if-ne v13, v1, :cond_193

    cmpg-float v14, v14, v17

    if-gez v14, :cond_191

    .line 226
    iget-boolean v14, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaMetadataCompat:Z

    if-eqz v14, :cond_1a3

    cmpl-float v14, v15, v17

    if-nez v14, :cond_191

    :goto_190
    goto :goto_1a3

    :cond_191
    :goto_191
    const/4 v1, 0x3

    goto :goto_1a7

    :cond_193
    const/4 v1, 0x3

    if-ne v13, v1, :cond_1a7

    cmpl-float v14, v14, v17

    if-lez v14, :cond_1a7

    .line 230
    iget-boolean v14, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaMetadataCompat:Z

    if-eqz v14, :cond_1a3

    cmpl-float v14, v15, v17

    if-eqz v14, :cond_1a3

    goto :goto_1a7

    :cond_1a3
    :goto_1a3
    move-object/from16 v1, p1

    const/4 v15, -0x1

    goto :goto_1d4

    .line 236
    :cond_1a7
    :goto_1a7
    iget v14, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->RatingCompat:I

    const/4 v15, -0x1

    if-ne v14, v15, :cond_1cf

    .line 237
    invoke-virtual {v10, v3}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer(Lo/NumberDeserializersNumberDeserializer;)V

    .line 238
    invoke-virtual {v10, v4}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer(Lo/NumberDeserializersNumberDeserializer;)V

    .line 239
    invoke-virtual {v10, v5}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer(Lo/NumberDeserializersNumberDeserializer;)V

    .line 240
    invoke-virtual {v10, v7}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer(Lo/NumberDeserializersNumberDeserializer;)V

    .line 241
    iget v14, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaBrowserCompatMediaItem:I

    if-lez v14, :cond_1c2

    .line 242
    invoke-virtual {v10, v8}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer(Lo/NumberDeserializersNumberDeserializer;)V

    .line 243
    invoke-virtual {v10, v11}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer(Lo/NumberDeserializersNumberDeserializer;)V

    .line 245
    :cond_1c2
    iget v14, v0, Landroidx/constraintlayout/helper/widget/MotionEffect;->MediaDescriptionCompat:I

    if-lez v14, :cond_1cc

    .line 246
    invoke-virtual {v10, v9}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer(Lo/NumberDeserializersNumberDeserializer;)V

    .line 247
    invoke-virtual {v10, v12}, Lo/handleSingleElementUnwrapped;->RemoteActionCompatParcelizer(Lo/NumberDeserializersNumberDeserializer;)V

    :cond_1cc
    move-object/from16 v1, p1

    goto :goto_1d4

    :cond_1cf
    move-object/from16 v1, p1

    .line 250
    invoke-virtual {v1, v14, v10}, Landroidx/constraintlayout/motion/widget/MotionLayout;->IconCompatParcelizer(ILo/handleSingleElementUnwrapped;)Z

    :goto_1d4
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, p2

    goto/16 :goto_13d

    :cond_1da
    return-void
.end method
