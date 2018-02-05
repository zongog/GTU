/**
 *		그리드 각종 설정 정보 
 *		_SBGrid.CF.LOCALE : locale 설정 정보 (object type) 
 */

_SBGrid.CF.LOCALE = {
						'locale':'K1', 
						'localeinfo':{
										"K1":{
												'datepicker':'ko',
												'caption':[['데이타'],['날짜데이타'],['날짜2데이타'],['숫자데이타'],['숫자2데이타'],['달력데이타']],
												'format':{
													'date':{
														'rule':'yyyy-mm-dd'
													},
													'number':{
														'rule':'#,###'
													}
												}
										},
										"C1":{
												'datepicker':'zh-CN',
												'caption':[['数据'],['日期-数据'],['日期2-数据'],['數字-数据'],['數字2-数据'],['月历-数据']],
												'format':{
													'date':{
														'rule':'yyyy-mm-dd'
													},
													'number':{
														'rule':'#,###'
													}
												}
										},
										"A9":{
											'datepicker':'en-AU',
											'caption':[['DATA'],['DATE-DATA'],['DATE1-DATA'],['NUMBER-DATA'],['NUMBER2-DATA'],['CALENDAR-DATA']],
											'format':{
												'date':{
													'rule':'dd-mm-yyyy'
												},
												'number':{
													'rule':'#,###'
												}
											}
										},
										"A7":{
											'datepicker':'en-AU',
											'caption':[['DATA'],['DATE-DATA'],['DATE1-DATA'],['NUMBER-DATA'],['NUMBER2-DATA'],['CALENDAR-DATA']],
											'format':{
												'date':{
													'rule':'dd-mm-yyyy'
												},
												'number':{
													'rule':'#,###.00',
													'digitgroup':'.',
													'decimalgroup':','
												}
											}
										}
						}
};